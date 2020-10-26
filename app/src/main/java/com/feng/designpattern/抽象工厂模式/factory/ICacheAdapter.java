package com.feng.designpattern.抽象工厂模式.factory;

import java.util.concurrent.TimeUnit;

/**
 * Created by fengbei
 * on 20-10-22
 * 定义适配器
 * 这个类的主要作用用是让所有集群的提供方方,能在统一一的方方法名称下进行行行操作。也方便后续的拓拓展
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
