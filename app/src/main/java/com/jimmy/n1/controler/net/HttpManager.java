package com.jimmy.n1.controler.net;


import com.jimmy.iot.net.request.GetRequest;
import com.jimmy.iot.net.request.PostRequest;

public class HttpManager {
    /**
     * get请求
     */
    public static GetRequest get(String url) {
        return new N1GetRequest(url);
    }

    /**
     * post请求
     */
    public static PostRequest post(String url) {
        return new N1PostRequest(url);
    }
}
