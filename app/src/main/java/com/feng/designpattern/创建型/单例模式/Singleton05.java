package com.feng.designpattern.创建型.单例模式;

/**
 * Created by fengbei
 * on 20-10-27
 * dlc 模式
 */
public class Singleton05 {

    private static Singleton05 instance;

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                if (instance == null) {
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }

}
