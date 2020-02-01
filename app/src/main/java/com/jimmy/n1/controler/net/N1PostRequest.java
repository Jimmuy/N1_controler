package com.jimmy.n1.controler.net;


import com.jimmy.iot.net.callback.CallBack;
import com.jimmy.iot.net.callback.CallBackProxy;
import com.jimmy.iot.net.callback.CallClazzProxy;
import com.jimmy.iot.net.request.PostRequest;

import java.lang.reflect.Type;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;


public class N1PostRequest extends PostRequest {

    public N1PostRequest(String url) {
        super(url);
    }

    @Override
    public <T> Observable<T> execute(Type type) {
        return super.execute(new CallClazzProxy<N1ApiResult<T>, T>(type) {
        });
    }

    @Override
    public <T> Observable<T> execute(Class<T> clazz) {
        return super.execute(new CallClazzProxy<N1ApiResult<T>, T>(clazz) {
        });
    }

    @Override
    public <T> Disposable execute(CallBack<T> callBack) {
        return super.execute(new CallBackProxy<N1ApiResult<T>, T>(callBack) {
        });
    }
}