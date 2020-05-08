package com.yuki.shop.domain;

import java.util.List;

public class GetSearchItems {

    /**
     * items : {"real_total_results":40,"error":"","item":[{"title":"夏季专业NBA篮球精英袜加厚毛巾底缓震运动袜子 男士中高筒精英袜",
     *                                                       "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/TB2Dp4vCMaTBuNjSszfXXXgfpXa_!!3367992574.jpg",
     *                                                       "promotion_price":"18.00",
     *                                                       "price":"45.00",
     *                                                       "sales":0,
     *                                                       "num_iid":"573206006585",
     *                                                       "post_fee":"0.00",
     *                                                       "sample_id":"夏季专业NBA篮球精英袜加厚毛巾底缓震运动袜子 男士中高筒精英袜",
     *                                                       "seller_nick":"cici13656986592",
     *                                                       "area":"福建 厦门",
     *                                                       "detail_url":"//item.taobao.com/item.htm?id=573206006585"},
     *                                                     {"title":"专业NBA精英篮球袜加厚毛巾底缓震高筒运动袜子 男士中筒精英袜",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/TB2d7l2b.gQMeJjy0FfXXbddXXa_!!819836837.jpg",
     *                                                      "promotion_price":"19.00",
     *                                                      "price":"35.00",
     *                                                      "sales":1,
     *                                                      "num_iid":"558055440807",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"专业NBA精英篮球袜加厚毛巾底缓震高筒运动袜子 男士中筒精英袜",
     *                                                      "seller_nick":"331855829qiu",
     *                                                      "area":"福建 泉州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=558055440807"},
     *                                                     {"title":"8双28元精英袜街头篮球袜男女棉加厚毛巾底户外马拉松跑步袜骚粉",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01PvEGVZ1M9ZrRMOwZp_!!751971392.jpg",
     *                                                      "promotion_price":"28.00",
     *                                                      "price":"56.00",
     *                                                      "sales":20,
     *                                                      "num_iid":"590512190820",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"8双28元精英袜街头篮球袜男女棉加厚毛巾底户外马拉松跑步袜骚粉",
     *                                                      "seller_nick":"小秦441",
     *                                                      "area":"江苏 南通",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=590512190820"},
     *                                                     {"title":"2双！黑人月欧文詹姆斯精英篮球袜加厚毛巾底中高筒运动袜子",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01J44zWP2HCGF0ZOlQ4_!!2273019114.jpg",
     *                                                      "promotion_price":"19.80",
     *                                                      "price":"39.60",
     *                                                      "sales":38,"
     *                                                      num_iid":"572916148089",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"2双！黑人月欧文詹姆斯精英篮球袜加厚毛巾底中高筒运动袜子",
     *                                                      "seller_nick":"球你别走",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=572916148089"},
     *                                                    {"title":"高端专业职业高帮高筒篮球袜篮球精英袜比赛训练装备缓震吸汗防滑",
     *                                                     "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01UdtToZ27LHxO73viG_!!437157780.jpg",
     *                                                     "promotion_price":"38.00",
     *                                                     "price":"120.00",
     *                                                     "sales":8,
     *                                                     "num_iid":"601251764156",
     *                                                     "post_fee":"0.00",
     *                                                     "sample_id":"高端专业职业高帮高筒篮球袜篮球精英袜比赛训练装备缓震吸汗防滑",
     *                                                     "seller_nick":"王家森森",
     *                                                     "area":"浙江 宁波",
     *                                                     "detail_url":"//item.taobao.com/item.htm?id=601251764156"},
     *                                                    {"title":"成人中高筒精英篮球袜 加厚毛巾底长筒袜 防摩擦学生运动袜",
     *                                                     "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN019EHo8w2NZ3iryl7tG_!!728809976.jpg",
     *                                                     "promotion_price":"21.00",
     *                                                     "price":"98.00",
     *                                                     "sales":0,
     *                                                     "num_iid":"607582397447",
     *                                                     "post_fee":"0.00",
     *                                                     "sample_id":"成人中高筒精英篮球袜 加厚毛巾底长筒袜 防摩擦学生运动袜",
     *                                                     "seller_nick":"白咕咕2010",
     *                                                     "area":"广东 深圳",
     *                                                     "detail_url":"//item.taobao.com/item.htm?id=607582397447"},
     *                                                    {"title":"专业运动毛巾底精英袜子加厚长筒袜吸汗防滑防臭篮球袜子高筒袜",
     *                                                     "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/TB2rxFdctMnyKJjSZPhXXaeZVXa_!!1744664431.jpg",
     *                                                     "promotion_price":"19.90",
     *                                                     "price":"90.00",
     *                                                     "sales":0,
     *                                                     "num_iid":"556108978340",
     *                                                     "post_fee":"0.00",
     *                                                     "sample_id":"专业运动毛巾底精英袜子加厚长筒袜吸汗防滑防臭篮球袜子高筒袜",
     *                                                     "seller_nick":"速胜旗舰店",
     *                                                     "area":"广东 广州",
     *                                                     "detail_url":"//detail.tmall.com/item.htm?id=556108978340"},
     *                                                    {"title":"绝版现货STANCE 359中帮 NBA球员版专业篮球袜 精英袜 毛巾袜",
     *                                                     "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/TB2e6e1jRDH8KJjy1zeXXXjepXa_!!119717886.jpg",
     *                                                     "promotion_price":"129.00",
     *                                                     "price":"129.00",
     *                                                     "sales":31,
     *                                                     "num_iid":"563178781800",
     *                                                     "post_fee":"12.00",
     *                                                     "sample_id":"绝版现货STANCE 359中帮 NBA球员版专业篮球袜 精英袜 毛巾袜",
     *                                                     "seller_nick":"smily我的落地窗",
     *                                                     "area":"上海",
     *                                                     "detail_url":"//item.taobao.com/item.htm?id=563178781800"},
     *                                                    {"title":"精英篮球袜高筒加厚毛巾袜女运动袜子男袜詹姆斯杜兰特科比中筒袜",
     *                                                     "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/TB2PMg3ebaI.eBjSspaXXXIKpXa_!!2573809305.jpg",
     *                                                     "promotion_price":"69.00",
     *                                                     "price":"69.00",
     *                                                     "sales":0,
     *                                                     "num_iid":"543467091300",
     *                                                     "post_fee":"0.00",
     *                                                     "sample_id":"精英篮球袜高筒加厚毛巾袜女运动袜子男袜詹姆斯杜兰特科比中筒袜",
     *                                                     "seller_nick":"欢姿华贸易",
     *                                                     "area":"广东 广州",
     *                                                     "detail_url":"//item.taobao.com/item.htm?id=543467091300"},
     *                                                     {"title":"专业运动袜男女精英袜吸汗透气防滑臭跑步运动中筒高帮加厚篮球袜",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN01PyDJHf1gSAHwXxqxM_!!3517954140.jpg",
     *                                                      "promotion_price":"15.80",
     *                                                      "price":"58.00",
     *                                                      "sales":11,
     *                                                      "num_iid":"609733129329",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"专业运动袜男女精英袜吸汗透气防滑臭跑步运动中筒高帮加厚篮球袜",
     *                                                      "seller_nick":"银马旗舰店","area":"广东 深圳",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=609733129329"},
     *                                                     {"title":"库里杜兰特欧文精英篮球袜子男春夏季吸汗透气防臭詹姆斯运动袜",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/TB2xyn1Xoz.BuNjt_bXXXcQmpXa_!!2528588457.jpg",
     *                                                      "promotion_price":"30.00"
     *                                                      "price":"30.00",
     *                                                      "sales":0,
     *                                                      "num_iid":"567827947591",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"库里杜兰特欧文精英篮球袜子男春夏季吸汗透气防臭詹姆斯运动袜",
     *                                                      "seller_nick":"小莲lsl",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=567827947591"},
     *                                                     {"title":"专业精英篮球袜子男中筒袜加厚毛巾底纯棉长筒运动袜跑步袜3双装",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/TB22aikiZrI8KJjy0FhXXbfnpXa_!!2566618854.jpg",
     *                                                      "promotion_price":"39.00",
     *                                                      "price":"78.00",
     *                                                      "sales":0,
     *                                                      "num_iid":"562854496269",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"专业精英篮球袜子男中筒袜加厚毛巾底纯棉长筒运动袜跑步袜3双装",
     *                                                      "seller_nick":"天健贸易商",
     *                                                      "area":"上海",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=562854496269"},
     *                                                     {"title":"超长款篮球袜 特里款到膝盖下方 官方球员版精英袜 加厚运动袜子",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/TB2wSC4XX15V1Bjy1XaXXaPqVXa_!!137698885.jpg",
     *                                                      "promotion_price":"55.00",
     *                                                      "price":"55.00",
     *                                                      "sales":0,
     *                                                      "num_iid":"526126716872",
     *                                                      "post_fee":"5.00",
     *                                                      "sample_id":"超长款篮球袜 特里款到膝盖下方 官方球员版精英袜 加厚运动袜子",
     *                                                      "seller_nick":"旷野百合_2008",
     *                                                      "area":"上海",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=526126716872"},
     *                                                     {"title":"精英篮球袜高帮长筒专业运动透气防滑臭冬季加厚毛巾底高筒棉袜男",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01Gv6Rtj20qhpERbA7a_!!2206539156901.jpg",
     *                                                      "promotion_price":"21.80",
     *                                                      "price":"78.00",
     *                                                      "sales":0,
     *                                                      "num_iid":"609163473681",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"精英篮球袜高帮长筒专业运动透气防滑臭冬季加厚毛巾底高筒棉袜男",
     *                                                      "seller_nick":"basketman旗舰店",
     *                                                      "area":"福建 泉州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=609163473681"},
     *                                                     {"title":"篮球精英袜高筒加厚透气防臭吸汗球袜中筒袜子专业毛巾底运动袜男",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01AFB30x208jns4k1m9_!!1914286805.jpg",
     *                                                      "promotion_price":"19.80",
     *                                                      "price":"98.00",
     *                                                      "sales":2,
     *                                                      "num_iid":"609168484937",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球精英袜高筒加厚透气防臭吸汗球袜中筒袜子专业毛巾底运动袜男",
     *                                                      "seller_nick":"飒凯旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=609168484937"},
     *                                                     {"title":"篮球袜子男篮球精英袜中筒专业运动袜子加厚毛巾袜透气防滑四季",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN011ibRRBfjjdTz6NW_!!1744664431.jpg",
     *                                                      "promotion_price":"24.90",
     *                                                      "price":"90.00",
     *                                                      "sales":7,
     *                                                      "num_iid":"556126933784",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球袜子男篮球精英袜中筒专业运动袜子加厚毛巾袜透气防滑四季",
     *                                                      "seller_nick":"速胜旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=556126933784"},
     *                                                     {"title":"篮球袜子男士精英袜中筒防滑毛巾底运动袜子羽毛球袜棉运动袜子",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN011GPi1kNAw1jGb8V_!!2878470615.jpg",
     *                                                      "promotion_price":"9.80",
     *                                                      "price":"25.00",
     *                                                      "sales":10,
     *                                                      "num_iid":"574410511915",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球袜子男士精英袜中筒防滑毛巾底运动袜子羽毛球袜棉运动袜子",
     *                                                      "seller_nick":"晨曦袜业123",
     *                                                      "area":"江西 宜春",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=574410511915"},
     *                                                     {"title":"云男士篮球袜棉精英袜中筒运动毛巾底防滑袜子袜子运动羽毛球袜子",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01sCyypk22LDqpbNV7h_!!0-item_pic.jpg",
     *                                                      "promotion_price":"13.96",
     *                                                      "price":"25.39",
     *                                                      "sales":1,
     *                                                      "num_iid":"616667810556",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"云男士篮球袜棉精英袜中筒运动毛巾底防滑袜子袜子运动羽毛球袜子",
     *                                                      "seller_nick":"franklin云湾专卖店",
     *                                                      "area":"江西 宜春",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=616667810556"},
     *                                                     {"title":"男秋冬跑步篮球袜中筒高筒足球加厚毛巾底篮球袜子男运动袜中高筒",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01wtJzt51R4bffJuJZ1_!!1970922058.jpg",
     *                                                      "promotion_price":"25.00",
     *                                                      "price":"98.00",
     *                                                      "sales":0,
     *                                                      "num_iid":"606054584068",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"男秋冬跑步篮球袜中筒高筒足球加厚毛巾底篮球袜子男运动袜中高筒",
     *                                                      "seller_nick":"langytx旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=606054584068"},
     *                                                     {"title":"篮球袜男中高帮专业运动袜女长筒防滑臭毛巾底加厚精英袜训练球袜",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01g6Bol51ibRYA1X6bh_!!1744664431.jpg",
     *                                                      "promotion_price":"19.80",
     *                                                      "price":"99.00",
     *                                                      "sales":166,
     *                                                      "num_iid":"611492834499",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球袜男中高帮专业运动袜女长筒防滑臭毛巾底加厚精英袜训练球袜",
     *                                                      "seller_nick":"速胜旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=611492834499"},
     *                                                     {"title":"篮球袜子男士精英袜中筒防滑毛巾底运动袜子羽毛球袜棉运动袜子",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01pYEApH1ZrAbu6x0e8_!!2247203247.jpg",
     *                                                      "promotion_price":"11.46",
     *                                                      "price":"23.88",
     *                                                      "sales":0,
     *                                                      "num_iid":"611865876968",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球袜子男士精英袜中筒防滑毛巾底运动袜子羽毛球袜棉运动袜子",
     *                                                      "seller_nick":"lzy930528242",
     *                                                      "area":"江西 宜春",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=611865876968"},
     *                                                     {"title":"迈耐克斯文精英篮球袜男中筒专业运动长筒球袜高筒吸汗透气加厚",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN0187LNLs2IFIYO4vTAP_!!3250179256.jpg",
     *                                                      "promotion_price":"34.80",
     *                                                      "price":"34.80",
     *                                                      "sales":0,
     *                                                      "num_iid":"602280788519",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"迈耐克斯文精英篮球袜男中筒专业运动长筒球袜高筒吸汗透气加厚",
     *                                                      "seller_nick":"tb072159623",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=602280788519"},
     *                                                     {"title":"NBA球星系列2020新款实战防臭运动篮球袜",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN01Iznblz2HlWpnHUCbG_!!1084509191.jpg",
     *                                                      "promotion_price":"18.00",
     *                                                      "price":"18.00",
     *                                                      "sales":1,
     *                                                      "num_iid":"616293890285",
     *                                                      "post_fee":"5.00",
     *                                                      "sample_id":"NBA球星系列2020新款实战防臭运动篮球袜",
     *                                                      "seller_nick":"houniaodeshijie",
     *                                                      "area":"浙江 嘉兴",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=616293890285"},
     *                                                     {"title":"李宁羽毛球袜短筒加厚毛巾底篮球袜子专业运动中筒羽球网球厚袜男",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01M0VKSw1K6Flx7mFhQ_!!436581114.jpg",
     *                                                      "promotion_price":"19.00",
     *                                                      "price":"22.00",
     *                                                      "sales":3,
     *                                                      "num_iid":"575085212665",
     *                                                      "post_fee":"15.00",
     *                                                      "sample_id":"李宁羽毛球袜短筒加厚毛巾底篮球袜子专业运动中筒羽球网球厚袜男",
     *                                                      "seller_nick":"飞腾运动户外专营店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=575085212665"},
     *                                                     {"title":"JRS 城市篮球袜  长款精英袜男毛巾底专业透气运动训练夏季纯棉厚",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01fKnv2v2NMgzrMV0NP_!!2201506239949.jpg",
     *                                                      "promotion_price":"39.00",
     *                                                      "price":"39.00",
     *                                                      "sales":81,
     *                                                      "num_iid":"597357531831",
     *                                                      "post_fee":"7.00",
     *                                                      "sample_id":"JRS 城市篮球袜  长款精英袜男毛巾底专业透气运动训练夏季纯棉厚",
     *                                                      "seller_nick":"jrs_official",
     *                                                      "area":"上海",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=597357531831"},
     *                                                     {"title":"KT4篮球鞋垫男5原装透气3运动鞋垫6韦德之道全城心安踏竹跑步鞋",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01UqO1yU2CwSCWVxzev_!!40198538.jpg",
     *                                                      "promotion_price":"15.90",
     *                                                      "price":"23.90",
     *                                                      "sales":3,
     *                                                      "num_iid":"610818758859",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"KT4篮球鞋垫男5原装透气3运动鞋垫6韦德之道全城心安踏竹跑步鞋",
     *                                                      "seller_nick":"rcbbser",
     *                                                      "area":"浙江 杭州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=610818758859"},
     *                                                     {"title":"实战篮球袜子男女中长筒专业运动防滑臭加厚毛巾底欧文精英袜库里",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN01cZvqrV1LjvjX2Nw4i_!!1035351336.jpg",
     *                                                      "promotion_price":"16.00",
     *                                                      "price":"98.00",
     *                                                      "sales":14,
     *                                                      "num_iid":"614227358990",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"实战篮球袜子男女中长筒专业运动防滑臭加厚毛巾底欧文精英袜库里",
     *                                                      "seller_nick":"尼歌拉旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=614227358990"},
     *                                                     {"title":"球员专业篮球袜子毛巾底实战高筒长筒运动训练精英男中筒加厚高帮",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN012wZXy61rmHTDRBHKn_!!2220805673.jpg",
     *                                                      "promotion_price":"17.00",
     *                                                      "price":"62.00",
     *                                                      "sales":20,
     *                                                      "num_iid":"614134485368",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"球员专业篮球袜子毛巾底实战高筒长筒运动训练精英男中筒加厚高帮",
     *                                                      "seller_nick":"奇点运动专营店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=614134485368"},
     *                                                     {"title":"詹姆斯23号篮球袜男高帮湖人队专业篮球精英袜科比24号运动毛巾袜",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01f7VEjw25uR9JfV6Vk_!!446347586.jpg",
     *                                                      "promotion_price":"19.90",
     *                                                      "price":"39.80",
     *                                                      "sales":21,
     *                                                      "num_iid":"615623398026",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"詹姆斯23号篮球袜男高帮湖人队专业篮球精英袜科比24号运动毛巾袜",
     *                                                      "seller_nick":"欧邦鼠旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=615623398026"},
     *                                                     {"title":"正品李宁羽毛球国家队篮球跑步莱卡加厚舒适高弹毛巾底中帮运动袜",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01lgFk3a1EP8MN0JUzN_!!220343.jpg",
     *                                                      "promotion_price":"29.00",
     *                                                      "price":"59.00",
     *                                                      "sales":1,
     *                                                      "num_iid":"589890721527",
     *                                                      "post_fee":"50.00",
     *                                                      "sample_id":"正品李宁羽毛球国家队篮球跑步莱卡加厚舒适高弹毛巾底中帮运动袜",
     *                                                      "seller_nick":"hamburger0530",
     *                                                      "area":"广西 柳州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=589890721527"},
     *                                                     {"title":"篮球精英袜子男高筒詹姆斯23号毛巾底加厚防滑运动外穿高帮数字袜",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01IrjSak2EXq8rlfG37_!!2502418755.jpg",
     *                                                      "promotion_price":"18.50",
     *                                                      "price":"68.00",
     *                                                      "sales":63,
     *                                                      "num_iid":"613555249035",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球精英袜子男高筒詹姆斯23号毛巾底加厚防滑运动外穿高帮数字袜",
     *                                                      "seller_nick":"大sirsir",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=613555249035"},
     *                                                     {"title":"篮球袜精英袜男高筒专业23号球袜24号篮球袜子男实战加厚长袜长筒",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN011rAiry2558mSU35D2_!!3025637474.jpg",
     *                                                      "promotion_price":"25.00",
     *                                                      "price":"68.00",
     *                                                      "sales":3,
     *                                                      "num_iid":"613144337425",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球袜精英袜男高筒专业23号球袜24号篮球袜子男实战加厚长袜长筒",
     *                                                      "seller_nick":"佳米娜旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=613144337425"},
     *                                                     {"title":"湖人队科比篮球袜中高筒24号球袜库里东契奇哈登运动袜中邦男女",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01XQ5ikp1nzmgK9k0Zm_!!1975465161.jpg",
     *                                                      "promotion_price":"19.00",
     *                                                      "price":"57.00",
     *                                                      "sales":99,
     *                                                      "num_iid":"612360901847",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"湖人队科比篮球袜中高筒24号球袜库里东契奇哈登运动袜中邦男女",
     *                                                      "seller_nick":"品宇运动旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=612360901847"},
     *                                                     {"title":"篮球袜毛巾底球星号码中高筒袜子高帮减震弹力精英球袜加厚运动袜",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN01ImrS2c1VnjAeCdcuZ_!!1678592698.jpg",
     *                                                      "promotion_price":"18.00",
     *                                                      "price":"36.00",
     *                                                      "sales":8,
     *                                                      "num_iid":"612879979610",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球袜毛巾底球星号码中高筒袜子高帮减震弹力精英球袜加厚运动袜",
     *                                                      "seller_nick":"绚丝颖旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=612879979610"},
     *                                                     {"title":"8双装全棉毛巾底户外防滑中筒詹姆斯库里精英篮球功能运动袜哈登",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/TB2hkTnsrGYBuNjy0FoXXciBFXa_!!294685617.jpg",
     *                                                      "promotion_price":"25.00",
     *                                                      "price":"96.00",
     *                                                      "sales":6,
     *                                                      "num_iid":"543532584322",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"8双装全棉毛巾底户外防滑中筒詹姆斯库里精英篮球功能运动袜哈登",
     *                                                      "seller_nick":"古歌vs顾",
     *                                                      "area":"浙江 绍兴",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=543532584322"},
     *                                                     {"title":"精英球袜科比24号篮球球袜实战袜专业运动袜子高帮长筒加厚毛巾袜",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01c0EZUb1R4bgwESjsA_!!1970922058.jpg",
     *                                                      "promotion_price":"25.00",
     *                                                      "price":"88.00",
     *                                                      "sales":10,
     *                                                      "num_iid":"611737701757",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"精英球袜科比24号篮球球袜实战袜专业运动袜子高帮长筒加厚毛巾袜",
     *                                                      "seller_nick":"langytx旗舰店",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//detail.tmall.com/item.htm?id=611737701757"},
     *                                                     {"title":"精英篮球袜加厚防震毛巾圈底袜防臭吸汗专业短中筒足球袜男士袜子",
     *                                                      "pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01qOpgNA28PExiic1yy_!!3993147924.jpg",
     *                                                      "promotion_price":"9.90",
     *                                                      "price":"19.90",
     *                                                      "sales":1,
     *                                                      "num_iid":"596567485098",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"精英篮球袜加厚防震毛巾圈底袜防臭吸汗专业短中筒足球袜男士袜子",
     *                                                      "seller_nick":"酷加服饰",
     *                                                      "area":"江西 宜春",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=596567485098"},
     *                                                     {"title":"23号詹姆斯篮球袜精英袜男高帮训练袜子男运动科比24号袜子篮球袜",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01g1zHly1CFOmmpUGZt_!!2270270051.jpg",
     *                                                      "promotion_price":"19.00",
     *                                                      "price":"88.00",
     *                                                      "sales":178,
     *                                                      "num_iid":"611565080459",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"23号詹姆斯篮球袜精英袜男高帮训练袜子男运动科比24号袜子篮球袜",
     *                                                      "seller_nick":"tbw运动户外旗舰店",
     *                                                      "area":"广东 广州"
     *                                                      ,"detail_url":"//detail.tmall.com/item.htm?id=611565080459"},
     *                                                     {"title":"库里30号篮球袜毛巾底高筒长中筒专业运动训练男跑步袜子潮街头",
     *                                                      "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN01A9xR1Q1eutv8DofBh_!!558983932.jpg",
     *                                                      "promotion_price":"24.00",
     *                                                      "price":"59.00",
     *                                                      "sales":1,
     *                                                      "num_iid":"614509874351",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"库里30号篮球袜毛巾底高筒长中筒专业运动训练男跑步袜子潮街头",
     *                                                      "seller_nick":"稍稍ss",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=614509874351"},
     *                                                     {"title":"篮球袜科比24高筒毛巾底詹姆斯23袜子厚防滑高邦精英浓眉3运动袜",
     *                                                      "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01pDnqDZ2FDWBq1A8wO_!!1951348846.jpg",
     *                                                      "promotion_price":"21.00",
     *                                                      "price":"58.00",
     *                                                      "sales":1,
     *                                                      "num_iid":"615872565469",
     *                                                      "post_fee":"0.00",
     *                                                      "sample_id":"篮球袜科比24高筒毛巾底詹姆斯23袜子厚防滑高邦精英浓眉3运动袜",
     *                                                      "seller_nick":"无缘_世界杯",
     *                                                      "area":"广东 广州",
     *                                                      "detail_url":"//item.taobao.com/item.htm?id=615872565469"}],
     *                                                      "data_from":"omyb",
     *                                                      "pagecount":1,
     *                                                      "total_results":40}
     * error_code : 0000
     * reason : ok
     * secache : e82b9b50f76a1a900e32390b6bbaadb4
     * secache_time : 1587832111
     * secache_date : 2020-04-26 00:28:31
     * translate_status : error
     * translate_time : 0.002
     * language : {"current_lang":"zh-CN","source_lang":"cn"}
     * error :
     * cache : 0
     * api_info : today:2 max:5000
     * execution_time : 0.634
     * server_time : Beijing/2020-04-26 00:28:31
     * call_args : {"imgid":"O1CN01IDpcD81zHbpHs1YgT_%21%212200811456689.jpg"}
     * api_type : taobao
     * translate_language : zh-CN
     * translate_engine : google_cn
     * server_memory : 7.44MB
     * request_id : .30720021.5ea4652e378764.49466233
     */

    private ItemsBean items;
    private String error_code;
    private String reason;
    private String secache;
    private int secache_time;
    private String secache_date;
    private String translate_status;
    private double translate_time;
    private LanguageBean language;
    private String error;
    private int cache;
    private String api_info;
    private double execution_time;
    private String server_time;
    private CallArgsBean call_args;
    private String api_type;
    private String translate_language;
    private String translate_engine;
    private String server_memory;
    private String request_id;

    public ItemsBean getItems() {
        return items;
    }

    public void setItems(ItemsBean items) {
        this.items = items;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSecache() {
        return secache;
    }

    public void setSecache(String secache) {
        this.secache = secache;
    }

    public int getSecache_time() {
        return secache_time;
    }

    public void setSecache_time(int secache_time) {
        this.secache_time = secache_time;
    }

    public String getSecache_date() {
        return secache_date;
    }

    public void setSecache_date(String secache_date) {
        this.secache_date = secache_date;
    }

    public String getTranslate_status() {
        return translate_status;
    }

    public void setTranslate_status(String translate_status) {
        this.translate_status = translate_status;
    }

    public double getTranslate_time() {
        return translate_time;
    }

    public void setTranslate_time(double translate_time) {
        this.translate_time = translate_time;
    }

    public LanguageBean getLanguage() {
        return language;
    }

    public void setLanguage(LanguageBean language) {
        this.language = language;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public String getApi_info() {
        return api_info;
    }

    public void setApi_info(String api_info) {
        this.api_info = api_info;
    }

    public double getExecution_time() {
        return execution_time;
    }

    public void setExecution_time(double execution_time) {
        this.execution_time = execution_time;
    }

    public String getServer_time() {
        return server_time;
    }

    public void setServer_time(String server_time) {
        this.server_time = server_time;
    }

    public CallArgsBean getCall_args() {
        return call_args;
    }

    public void setCall_args(CallArgsBean call_args) {
        this.call_args = call_args;
    }

    public String getApi_type() {
        return api_type;
    }

    public void setApi_type(String api_type) {
        this.api_type = api_type;
    }

    public String getTranslate_language() {
        return translate_language;
    }

    public void setTranslate_language(String translate_language) {
        this.translate_language = translate_language;
    }

    public String getTranslate_engine() {
        return translate_engine;
    }

    public void setTranslate_engine(String translate_engine) {
        this.translate_engine = translate_engine;
    }

    public String getServer_memory() {
        return server_memory;
    }

    public void setServer_memory(String server_memory) {
        this.server_memory = server_memory;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public static class ItemsBean {
        /**
         * real_total_results : 40
         * error :
         * item : [{"title":"夏季专业NBA篮球精英袜加厚毛巾底缓震运动袜子 男士中高筒精英袜",
         *           "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/TB2Dp4vCMaTBuNjSszfXXXgfpXa_!!3367992574.jpg",
         *           "promotion_price":"18.00",
         *           "price":"45.00",
         *           "sales":0,"num_iid":"573206006585",
         *           "post_fee":"0.00",
         *           "sample_id":"夏季专业NBA篮球精英袜加厚毛巾底缓震运动袜子 男士中高筒精英袜",
         *           "seller_nick":"cici13656986592",
         *           "area":"福建 厦门",
         *           "detail_url":"//item.taobao.com/item.htm?id=573206006585"},
         *           {"title":"专业NBA精英篮球袜加厚毛巾底缓震高筒运动袜子 男士中筒精英袜",
         *            "pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/TB2d7l2b.gQMeJjy0FfXXbddXXa_!!819836837.jpg",
         *            "promotion_price":"19.00",
         *            "price":"35.00",
         *            "sales":1,
         *            "num_iid":"558055440807",
         *            "post_fee":"0.00","sample_id":"专业NBA精英篮球袜加厚毛巾底缓震高筒运动袜子 男士中筒精英袜","seller_nick":"331855829qiu","area":"福建 泉州","detail_url":"//item.taobao.com/item.htm?id=558055440807"},
         *            {"title":"8双28元精英袜街头篮球袜男女棉加厚毛巾底户外马拉松跑步袜骚粉","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01PvEGVZ1M9ZrRMOwZp_!!751971392.jpg","promotion_price":"28.00","price":"56.00","sales":20,"num_iid":"590512190820","post_fee":"0.00","sample_id":"8双28元精英袜街头篮球袜男女棉加厚毛巾底户外马拉松跑步袜骚粉","seller_nick":"小秦441","area":"江苏 南通","detail_url":"//item.taobao.com/item.htm?id=590512190820"},
         *            {"title":"2双！黑人月欧文詹姆斯精英篮球袜加厚毛巾底中高筒运动袜子","pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01J44zWP2HCGF0ZOlQ4_!!2273019114.jpg","promotion_price":"19.80","price":"39.60","sales":38,"num_iid":"572916148089","post_fee":"0.00","sample_id":"2双！黑人月欧文詹姆斯精英篮球袜加厚毛巾底中高筒运动袜子","seller_nick":"球你别走","area":"广东 广州","detail_url":"//item.taobao.com/item.htm?id=572916148089"},
         *            {"title":"高端专业职业高帮高筒篮球袜篮球精英袜比赛训练装备缓震吸汗防滑","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01UdtToZ27LHxO73viG_!!437157780.jpg","promotion_price":"38.00","price":"120.00","sales":8,"num_iid":"601251764156","post_fee":"0.00","sample_id":"高端专业职业高帮高筒篮球袜篮球精英袜比赛训练装备缓震吸汗防滑","seller_nick":"王家森森","area":"浙江 宁波","detail_url":"//item.taobao.com/item.htm?id=601251764156"},
         *            {"title":"成人中高筒精英篮球袜 加厚毛巾底长筒袜 防摩擦学生运动袜","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN019EHo8w2NZ3iryl7tG_!!728809976.jpg","promotion_price":"21.00","price":"98.00","sales":0,"num_iid":"607582397447","post_fee":"0.00","sample_id":"成人中高筒精英篮球袜 加厚毛巾底长筒袜 防摩擦学生运动袜","seller_nick":"白咕咕2010","area":"广东 深圳","detail_url":"//item.taobao.com/item.htm?id=607582397447"},
         *            {"title":"专业运动毛巾底精英袜子加厚长筒袜吸汗防滑防臭篮球袜子高筒袜","pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/TB2rxFdctMnyKJjSZPhXXaeZVXa_!!1744664431.jpg","promotion_price":"19.90","price":"90.00","sales":0,"num_iid":"556108978340","post_fee":"0.00","sample_id":"专业运动毛巾底精英袜子加厚长筒袜吸汗防滑防臭篮球袜子高筒袜","seller_nick":"速胜旗舰店","area":"广东 广州","detail_url":"//detail.tmall.com/item.htm?id=556108978340"},
         *            {"title":"绝版现货STANCE 359中帮 NBA球员版专业篮球袜 精英袜 毛巾袜","pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/TB2e6e1jRDH8KJjy1zeXXXjepXa_!!119717886.jpg","promotion_price":"129.00","price":"129.00","sales":31,"num_iid":"563178781800","post_fee":"12.00","sample_id":"绝版现货STANCE 359中帮 NBA球员版专业篮球袜 精英袜 毛巾袜","seller_nick":"smily我的落地窗","area":"上海","detail_url":"//item.taobao.com/item.htm?id=563178781800"},
         *            {"title":"精英篮球袜高筒加厚毛巾袜女运动袜子男袜詹姆斯杜兰特科比中筒袜","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/TB2PMg3ebaI.eBjSspaXXXIKpXa_!!2573809305.jpg","promotion_price":"69.00","price":"69.00","sales":0,"num_iid":"543467091300","post_fee":"0.00","sample_id":"精英篮球袜高筒加厚毛巾袜女运动袜子男袜詹姆斯杜兰特科比中筒袜","seller_nick":"欢姿华贸易","area":"广东 广州","detail_url":"//item.taobao.com/item.htm?id=543467091300"},
         *            {"title":"专业运动袜男女精英袜吸汗透气防滑臭跑步运动中筒高帮加厚篮球袜","pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN01PyDJHf1gSAHwXxqxM_!!3517954140.jpg","promotion_price":"15.80","price":"58.00","sales":11,"num_iid":"609733129329","post_fee":"0.00","sample_id":"专业运动袜男女精英袜吸汗透气防滑臭跑步运动中筒高帮加厚篮球袜","seller_nick":"银马旗舰店","area":"广东 深圳","detail_url":"//detail.tmall.com/item.htm?id=609733129329"},
         *            {"title":"库里杜兰特欧文精英篮球袜子男春夏季吸汗透气防臭詹姆斯运动袜","pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/TB2xyn1Xoz.BuNjt_bXXXcQmpXa_!!2528588457.jpg","promotion_price":"30.00","price":"30.00","sales":0,"num_iid":"567827947591","post_fee":"0.00","sample_id":"库里杜兰特欧文精英篮球袜子男春夏季吸汗透气防臭詹姆斯运动袜","seller_nick":"小莲lsl","area":"广东 广州","detail_url":"//item.taobao.com/item.htm?id=567827947591"},
         *            {"title":"专业精英篮球袜子男中筒袜加厚毛巾底纯棉长筒运动袜跑步袜3双装","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/TB22aikiZrI8KJjy0FhXXbfnpXa_!!2566618854.jpg","promotion_price":"39.00","price":"78.00","sales":0,"num_iid":"562854496269","post_fee":"0.00","sample_id":"专业精英篮球袜子男中筒袜加厚毛巾底纯棉长筒运动袜跑步袜3双装","seller_nick":"天健贸易商","area":"上海","detail_url":"//item.taobao.com/item.htm?id=562854496269"},
         *            {"title":"超长款篮球袜 特里款到膝盖下方 官方球员版精英袜 加厚运动袜子","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/TB2wSC4XX15V1Bjy1XaXXaPqVXa_!!137698885.jpg","promotion_price":"55.00","price":"55.00","sales":0,"num_iid":"526126716872","post_fee":"5.00","sample_id":"超长款篮球袜 特里款到膝盖下方 官方球员版精英袜 加厚运动袜子","seller_nick":"旷野百合_2008","area":"上海","detail_url":"//item.taobao.com/item.htm?id=526126716872"},
         *            {"title":"精英篮球袜高帮长筒专业运动透气防滑臭冬季加厚毛巾底高筒棉袜男","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01Gv6Rtj20qhpERbA7a_!!2206539156901.jpg","promotion_price":"21.80","price":"78.00","sales":0,"num_iid":"609163473681","post_fee":"0.00","sample_id":"精英篮球袜高帮长筒专业运动透气防滑臭冬季加厚毛巾底高筒棉袜男","seller_nick":"basketman旗舰店","area":"福建 泉州","detail_url":"//detail.tmall.com/item.htm?id=609163473681"},
         *            {"title":"篮球精英袜高筒加厚透气防臭吸汗球袜中筒袜子专业毛巾底运动袜男","pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01AFB30x208jns4k1m9_!!1914286805.jpg","promotion_price":"19.80","price":"98.00","sales":2,"num_iid":"609168484937","post_fee":"0.00","sample_id":"篮球精英袜高筒加厚透气防臭吸汗球袜中筒袜子专业毛巾底运动袜男","seller_nick":"飒凯旗舰店","area":"广东 广州","detail_url":"//detail.tmall.com/item.htm?id=609168484937"},
         *            {"title":"篮球袜子男篮球精英袜中筒专业运动袜子加厚毛巾袜透气防滑四季","pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN011ibRRBfjjdTz6NW_!!1744664431.jpg","promotion_price":"24.90","price":"90.00","sales":7,"num_iid":"556126933784","post_fee":"0.00","sample_id":"篮球袜子男篮球精英袜中筒专业运动袜子加厚毛巾袜透气防滑四季","seller_nick":"速胜旗舰店","area":"广东 广州","detail_url":"//detail.tmall.com/item.htm?id=556126933784"},
         *            {"title":"篮球袜子男士精英袜中筒防滑毛巾底运动袜子羽毛球袜棉运动袜子","pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN011GPi1kNAw1jGb8V_!!2878470615.jpg","promotion_price":"9.80","price":"25.00","sales":10,"num_iid":"574410511915","post_fee":"0.00","sample_id":"篮球袜子男士精英袜中筒防滑毛巾底运动袜子羽毛球袜棉运动袜子","seller_nick":"晨曦袜业123","area":"江西 宜春","detail_url":"//item.taobao.com/item.htm?id=574410511915"},
         *            {"title":"云男士篮球袜棉精英袜中筒运动毛巾底防滑袜子袜子运动羽毛球袜子","pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01sCyypk22LDqpbNV7h_!!0-item_pic.jpg","promotion_price":"13.96","price":"25.39","sales":1,"num_iid":"616667810556","post_fee":"0.00","sample_id":"云男士篮球袜棉精英袜中筒运动毛巾底防滑袜子袜子运动羽毛球袜子","seller_nick":"franklin云湾专卖店","area":"江西 宜春","detail_url":"//detail.tmall.com/item.htm?id=616667810556"},
         *            {"title":"男秋冬跑步篮球袜中筒高筒足球加厚毛巾底篮球袜子男运动袜中高筒","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01wtJzt51R4bffJuJZ1_!!1970922058.jpg","promotion_price":"25.00","price":"98.00","sales":0,"num_iid":"606054584068","post_fee":"0.00","sample_id":"男秋冬跑步篮球袜中筒高筒足球加厚毛巾底篮球袜子男运动袜中高筒","seller_nick":"langytx旗舰店","area":"广东 广州","detail_url":"//detail.tmall.com/item.htm?id=606054584068"},
         *            {"title":"篮球袜男中高帮专业运动袜女长筒防滑臭毛巾底加厚精英袜训练球袜","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01g6Bol51ibRYA1X6bh_!!1744664431.jpg","promotion_price":"19.80","price":"99.00","sales":166,"num_iid":"611492834499","post_fee":"0.00","sample_id":"篮球袜男中高帮专业运动袜女长筒防滑臭毛巾底加厚精英袜训练球袜","seller_nick":"速胜旗舰店","area":"广东 广州","detail_url":"//detail.tmall.com/item.htm?id=611492834499"},
         *            {"title":"篮球袜子男士精英袜中筒防滑毛巾底运动袜子羽毛球袜棉运动袜子","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01pYEApH1ZrAbu6x0e8_!!2247203247.jpg","promotion_price":"11.46","price":"23.88","sales":0,"num_iid":"611865876968","post_fee":"0.00","sample_id":"篮球袜子男士精英袜中筒防滑毛巾底运动袜子羽毛球袜棉运动袜子","seller_nick":"lzy930528242","area":"江西 宜春","detail_url":"//item.taobao.com/item.htm?id=611865876968"},
         *            {"title":"迈耐克斯文精英篮球袜男中筒专业运动长筒球袜高筒吸汗透气加厚","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN0187LNLs2IFIYO4vTAP_!!3250179256.jpg","promotion_price":"34.80","price":"34.80","sales":0,"num_iid":"602280788519","post_fee":"0.00","sample_id":"迈耐克斯文精英篮球袜男中筒专业运动长筒球袜高筒吸汗透气加厚","seller_nick":"tb072159623","area":"广东 广州","detail_url":"//item.taobao.com/item.htm?id=602280788519"},
         *            {"title":"精英篮球袜加厚防震毛巾圈底袜防臭吸汗专业短中筒足球袜男士袜子","pic_url":"//g-search3.alicdn.com/img/bao/uploaded/i4/O1CN01qOpgNA28PExiic1yy_!!3993147924.jpg","promotion_price":"9.90","price":"19.90","sales":1,"num_iid":"596567485098","post_fee":"0.00","sample_id":"精英篮球袜加厚防震毛巾圈底袜防臭吸汗专业短中筒足球袜男士袜子","seller_nick":"酷加服饰","area":"江西 宜春","detail_url":"//item.taobao.com/item.htm?id=596567485098"},
         *            {"title":"23号詹姆斯篮球袜精英袜男高帮训练袜子男运动科比24号袜子篮球袜","pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01g1zHly1CFOmmpUGZt_!!2270270051.jpg","promotion_price":"19.00","price":"88.00","sales":178,"num_iid":"611565080459","post_fee":"0.00","sample_id":"23号詹姆斯篮球袜精英袜男高帮训练袜子男运动科比24号袜子篮球袜","seller_nick":"tbw运动户外旗舰店","area":"广东 广州","detail_url":"//detail.tmall.com/item.htm?id=611565080459"},
         *            {"title":"库里30号篮球袜毛巾底高筒长中筒专业运动训练男跑步袜子潮街头","pic_url":"//g-search1.alicdn.com/img/bao/uploaded/i4/O1CN01A9xR1Q1eutv8DofBh_!!558983932.jpg","promotion_price":"24.00","price":"59.00","sales":1,"num_iid":"614509874351","post_fee":"0.00","sample_id":"库里30号篮球袜毛巾底高筒长中筒专业运动训练男跑步袜子潮街头","seller_nick":"稍稍ss","area":"广东 广州","detail_url":"//item.taobao.com/item.htm?id=614509874351"},
         *            {"title":"篮球袜科比24高筒毛巾底詹姆斯23袜子厚防滑高邦精英浓眉3运动袜",
         *            "pic_url":"//g-search2.alicdn.com/img/bao/uploaded/i4/O1CN01pDnqDZ2FDWBq1A8wO_!!1951348846.jpg",
         *            "promotion_price":"21.00",
         *            "price":"58.00",
         *            "sales":1,
         *            "num_iid":"615872565469",
         *            "post_fee":"0.00",
         *            "sample_id":"篮球袜科比24高筒毛巾底詹姆斯23袜子厚防滑高邦精英浓眉3运动袜",
         *            "seller_nick":"无缘_世界杯",
         *            "area":"广东 广州","
         *            detail_url":"//item.taobao.com/item.htm?id=615872565469"}]
         * data_from : omyb
         * pagecount : 1
         * total_results : 40
         */

        private int real_total_results;
        private String error;
        private String data_from;
        private int pagecount;
        private int total_results;
        private List<ItemBean> item;

        public int getReal_total_results() {
            return real_total_results;
        }

        public void setReal_total_results(int real_total_results) {
            this.real_total_results = real_total_results;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public String getData_from() {
            return data_from;
        }

        public void setData_from(String data_from) {
            this.data_from = data_from;
        }

        public int getPagecount() {
            return pagecount;
        }

        public void setPagecount(int pagecount) {
            this.pagecount = pagecount;
        }

        public int getTotal_results() {
            return total_results;
        }

        public void setTotal_results(int total_results) {
            this.total_results = total_results;
        }

        public List<ItemBean> getItem() {
            return item;
        }

        public void setItem(List<ItemBean> item) {
            this.item = item;
        }

        public static class ItemBean {
            /**
             * title : 夏季专业NBA篮球精英袜加厚毛巾底缓震运动袜子 男士中高筒精英袜
             * pic_url : //g-search1.alicdn.com/img/bao/uploaded/i4/TB2Dp4vCMaTBuNjSszfXXXgfpXa_!!3367992574.jpg
             * promotion_price : 18.00
             * price : 45.00
             * sales : 0
             * num_iid : 573206006585
             * post_fee : 0.00
             * sample_id : 夏季专业NBA篮球精英袜加厚毛巾底缓震运动袜子 男士中高筒精英袜
             * seller_nick : cici13656986592
             * area : 福建 厦门
             * detail_url : //item.taobao.com/item.htm?id=573206006585
             */

            private String title;
            private String pic_url;
            private String promotion_price;
            private String price;
            private int sales;
            private String num_iid;
            private String post_fee;
            private String sample_id;
            private String seller_nick;
            private String area;
            private String detail_url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getPromotion_price() {
                return promotion_price;
            }

            public void setPromotion_price(String promotion_price) {
                this.promotion_price = promotion_price;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getSales() {
                return sales;
            }

            public void setSales(int sales) {
                this.sales = sales;
            }

            public String getNum_iid() {
                return num_iid;
            }

            public void setNum_iid(String num_iid) {
                this.num_iid = num_iid;
            }

            public String getPost_fee() {
                return post_fee;
            }

            public void setPost_fee(String post_fee) {
                this.post_fee = post_fee;
            }

            public String getSample_id() {
                return sample_id;
            }

            public void setSample_id(String sample_id) {
                this.sample_id = sample_id;
            }

            public String getSeller_nick() {
                return seller_nick;
            }

            public void setSeller_nick(String seller_nick) {
                this.seller_nick = seller_nick;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getDetail_url() {
                return detail_url;
            }

            public void setDetail_url(String detail_url) {
                this.detail_url = detail_url;
            }
        }
    }

    public static class LanguageBean {
        /**
         * current_lang : zh-CN
         * source_lang : cn
         */

        private String current_lang;
        private String source_lang;

        public String getCurrent_lang() {
            return current_lang;
        }

        public void setCurrent_lang(String current_lang) {
            this.current_lang = current_lang;
        }

        public String getSource_lang() {
            return source_lang;
        }

        public void setSource_lang(String source_lang) {
            this.source_lang = source_lang;
        }
    }

    public static class CallArgsBean {
        /**
         * imgid : O1CN01IDpcD81zHbpHs1YgT_%21%212200811456689.jpg
         */

        private String imgid;

        public String getImgid() {
            return imgid;
        }

        public void setImgid(String imgid) {
            this.imgid = imgid;
        }
    }
}
