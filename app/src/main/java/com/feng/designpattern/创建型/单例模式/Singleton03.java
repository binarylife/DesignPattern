package com.feng.designpattern.创建型.单例模式;

/**
 * Created by fengbei
 * on 20-10-27
 * 饿汉形式
 */
public class Singleton03 {
    private static Singleton03 instance = new Singleton03();

    private Singleton03() {
    }


    public static Singleton03 getInstance() {
        return instance;
    }
}
