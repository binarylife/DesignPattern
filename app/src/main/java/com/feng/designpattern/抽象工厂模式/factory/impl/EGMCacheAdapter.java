package com.feng.designpattern.抽象工厂模式.factory.impl;

import com.feng.designpattern.抽象工厂模式.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * Created by fengbei
 * on 20-10-22
 * 具体实现
 */
public class EGMCacheAdapter implements ICacheAdapter {


    private String egm = "egm";

    @Override
    public String get(String key) {
        //

        return egm;
    }

    @Override
    public void set(String key, String value) {
//        egm.set(key,value);
        System.out.print(egm+ "set");
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
//        egm.set(key,value);
    }

    @Override
    public void del(String key) {
//        egm.del(key,value);
    }
}
