package com.feng.designpattern.抽象工厂模式.factory.impl;

import com.feng.designpattern.抽象工厂模式.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * Created by fengbei
 * on 20-10-22
 * 具体实现
 */
public class IIRCacheAdapter implements ICacheAdapter {


    private String iir = "IIR";

    @Override
    public String get(String key) {
        //
        return iir;
    }

    @Override
    public void set(String key, String value) {
//        iir.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
//        iir.set(key,value);
    }

    @Override
    public void del(String key) {
//        iir.del(key,value);
    }
}
