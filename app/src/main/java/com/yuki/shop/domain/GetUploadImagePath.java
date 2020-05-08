package com.yuki.shop.domain;

import java.util.List;

public class GetUploadImagePath {

    /**
     * items : {"item":{"name":"https://img.alicdn.com/imgextra/i2/2601011849/O1CN01C7jVJn1PWsvHYoFZ0_!!2601011849.jpg","status":1}}
     * error_code : 0000
     * reason : ok
     * error :
     * cache : 0
     * api_info : today:14 max:5000
     * execution_time : 2.637
     * server_time : Beijing/2020-04-28 23:28:24
     * call_args : []
     * api_type : taobao
     * server_memory : 7MB
     * request_id : .14848981.5ea84b962238c1.46569849
     */

    private ItemsBean items;
    private String error_code;
    private String reason;
    private String error;
    private int cache;
    private String api_info;
    private double execution_time;
    private String server_time;
    private String api_type;
    private String server_memory;
    private String request_id;
    private List<?> call_args;

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

    public String getApi_type() {
        return api_type;
    }

    public void setApi_type(String api_type) {
        this.api_type = api_type;
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

    public List<?> getCall_args() {
        return call_args;
    }

    public void setCall_args(List<?> call_args) {
        this.call_args = call_args;
    }

    public static class ItemsBean {
        /**
         * item : {"name":"https://img.alicdn.com/imgextra/i2/2601011849/O1CN01C7jVJn1PWsvHYoFZ0_!!2601011849.jpg","status":1}
         */

        private ItemBean item;

        public ItemBean getItem() {
            return item;
        }

        public void setItem(ItemBean item) {
            this.item = item;
        }

        public static class ItemBean {
            /**
             * name : https://img.alicdn.com/imgextra/i2/2601011849/O1CN01C7jVJn1PWsvHYoFZ0_!!2601011849.jpg
             * status : 1
             */

            private String name;
            private int status;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }
    }
}
