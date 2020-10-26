package com.feng.designpattern.抽象工厂模式.impl;

import com.feng.designpattern.抽象工厂模式.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * Created by fengbei
 * on 20-10-22
 */
public class CacheServiceImpl implements CacheService {
    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public void set(String key, String value) {
        System.out.print("CacheServiceImpl"+ "set");
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {

    }

    @Override
    public void del(String key) {

    }
}
