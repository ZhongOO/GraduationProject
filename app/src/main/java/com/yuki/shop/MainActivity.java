package com.yuki.shop;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unity3d.player.UnityPlayerActivity;
import com.yuki.shop.domain.GetSearchItems;
import com.yuki.shop.domain.GetUploadImagePath;
import com.yuki.shop.domain.ResultItems;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends UnityPlayerActivity {

    private static final String TAG ="MainActivity";
    private static final int PERMISSION_REQUEST_CODE = 1;
    public static final String TEL_KEY="tel18146517767";
    public static final String SECRET="20191226";
    public static final String BASE_URL="https://api.onebound.cn/taobao/api_call.php?";

    public static Gson gson;
    public static GetUploadImagePath getUploadImgPath;
    public static GetUploadImagePath.ItemsBean items= new GetUploadImagePath.ItemsBean();
    public static String cpymsg="";

    GetSearchItems getSearchItems;
    GetSearchItems.ItemsBean searchitems=new GetSearchItems.ItemsBean();
    List<GetSearchItems.ItemsBean.ItemBean> list;

    ResultItems resultItems;
    List<ResultItems> tmallList=new ArrayList<>();
    List<ResultItems> taobaoList=new ArrayList<>();

    Gson gson1=new GsonBuilder().disableHtmlEscaping().create();
    List<String> allList=new ArrayList<>();

    public static String Result="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkStoragePermission();
    }

    public String UnitySearch(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
        cpymsg=msg;
        new Thread(){
            public void run(){
                uploadImageFile(cpymsg);
            }
        }.start();
        return Result;
    }


    @TargetApi(Build.VERSION_CODES.M)
    private void checkStoragePermission() {
        int readPermission=checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE);
        int writePermission=checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (readPermission== PackageManager.PERMISSION_GRANTED&&writePermission==PackageManager.PERMISSION_GRANTED){
            //表示有权限
        }else {
            Log.d(TAG,"requestPermissions....");
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE},PERMISSION_REQUEST_CODE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults) {
        if(requestCode==PERMISSION_REQUEST_CODE){
            //判断结果
            if(grantResults.length==2&&grantResults[0]==PackageManager.PERMISSION_GRANTED&&grantResults[1]==PackageManager.PERMISSION_GRANTED){
                //有权限
                Log.d(TAG,"has permission!");
            }else {
                //没权限
                finish();
            }
        }
    }

    public void uploadImageFile(String filePath){
        OkHttpClient okHttpClient;
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(1000, TimeUnit.MILLISECONDS)
                .build();

        File file=new File(filePath);
        MediaType fileType=MediaType.parse("image/jpeg");
        RequestBody fileBody=RequestBody.create(file,fileType);
        RequestBody requestBody=new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("imgcode",file.getName(),fileBody)
                .build();
        Request request=new Request.Builder()
                .url(BASE_URL+"key=tel18146517767&secret=20191226&api_name=upload_img")
                .post(requestBody)
                .build();

        Call call=okHttpClient.newCall(request);
        try {
            Response response=call.execute();
            int code=response.code();
            if (code== HttpURLConnection.HTTP_OK){
                ResponseBody body=response.body();
                if (body!=null){
                    gson = new Gson();
                    getUploadImgPath = gson.fromJson(body.string(), GetUploadImagePath.class);
                    //searchItems(getUploadImgPath);
                    items=getUploadImgPath.getItems();
                    Result=items.getItem().getName();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void searchItems(GetUploadImagePath getUploadImgPath) {
//        items=getUploadImgPath.getItems();
//        String netImagePath=items.getItem().getName();
//        OkHttpClient okHttpClient=new OkHttpClient.Builder()
//                .connectTimeout(1000,TimeUnit.MILLISECONDS)
//                .build();
//
//        Request request=new Request.Builder()
//                .get()
//                .url(BASE_URL+
//                        "imgid="+netImagePath+"&cat="+
//                        "&api_name=item_search_img"+
//                        "&result_type=jsonu"+
//                        "&lang=zh-CN"+
//                        "&key="+TEL_KEY+
//                        "&secret="+SECRET)
//                .build();
//
//        Call call=okHttpClient.newCall(request);
//        try {
//            Response response=call.execute();
//            int code=response.code();
//            if (code== HttpURLConnection.HTTP_OK){
//                ResponseBody body=response.body();
//                if (body!=null){
//                    gson=new Gson();
//                    getSearchItems=gson.fromJson(body.string(), GetSearchItems.class);
//                    getResult(getSearchItems);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void getResult(GetSearchItems getSearchItems) {
//        searchitems=getSearchItems.getItems();
//        list=searchitems.getItem();
//        int len=list.size();
//        for (int i=0;i<len;i++)
//        {
//            resultItems = new ResultItems(null,null,0,null);
//            resultItems.setPic_url("https:"+list.get(i).getPic_url());
//            resultItems.setPrice(Float.parseFloat(list.get(i).getPrice()));
//            String temp=list.get(i).getDetail_url();
//            resultItems.setDetail_url("https:"+temp);
//            if (temp.contains("tmall")){
//                resultItems.setPlatform_item("天猫");
//                tmallList.add(resultItems);
//            }else if(temp.contains("taobao")){
//                resultItems.setPlatform_item("淘宝");
//                taobaoList.add(resultItems);
//            }
//        }
//        getreasonableprice(tmallList);
//        getreasonableprice(taobaoList);
//        String tmallJson=gson1.toJson(tmallList);
//        String taobaoJson=gson1.toJson(taobaoList);
//        allList.add(tmallJson);
//        allList.add(taobaoJson);
//    }
//
//    private void getreasonableprice(List<ResultItems> resultItemsList) {
//        int len=resultItemsList.size();
//        for (int i=0;i<len-1;i++){
//            for (int j=0;j<len-i-1;j++){
//                if (resultItemsList.get(j).getPrice()>resultItemsList.get(j+1).getPrice()){
//                    ResultItems tempResultItem=resultItemsList.get(j);
//                    resultItemsList.set(j,resultItemsList.get(j+1));
//                    resultItemsList.set(j+1,tempResultItem);
//                }
//            }
//        }
//        float midPrice=resultItemsList.get((int)len/2).getPrice();
//        int count=0;
//        do {
//            if (resultItemsList.get(count).getPrice()<midPrice/4 || resultItemsList.get(count).getPrice()>4*midPrice){
//                resultItemsList.remove(count);
//            }else {
//                count++;
//            }
//        }while (count<resultItemsList.size());
//    }

}
