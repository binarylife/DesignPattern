package com.feng.designpattern.抽象工厂模式;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by fengbei
 * on 20-10-22
 * 一个简单的cache缓存模块
 */
public interface CacheService {

    /**
     * 获取缓存
     *
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置缓存
     */
    void set(String key, String value);


    /**
     * 可设置缓有效期限
     *
     * @param key
     * @param value
     * @param timeout
     * @param timeUnit
     */
    void set(String key, String value, long timeout, TimeUnit timeUnit);


    /**
     * 删除缓存
     *
     * @param key
     */
    void del(String key);
}
