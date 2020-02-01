package com.jimmy.n1.controler.net;


import com.jimmy.iot.net.model.ApiResult;

public class N1ApiResult<T> extends ApiResult<T> {

    public T data;
    public Boolean success;
    public String errorMsg;
    public String errorCode;

    @Override
    public T getBaseData() {
        return data;
    }

    @Override
    public boolean isOk() {
        return success;
    }

    @Override
    public String getMsg() {
        return errorMsg;
    }

    @Override
    public int getCode() {
        return Integer.valueOf(errorCode);
    }
}
