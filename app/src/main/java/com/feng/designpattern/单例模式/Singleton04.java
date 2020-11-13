package com.feng.designpattern.单例模式;

/**
 * Created by fengbei
 * on 20-10-27
 * 使用用类的内部类(线程安全)
 */
public class Singleton04 {

    private Singleton04() {
    }

    private static class SingletonHolder {
        private static Singleton04 instance = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return SingletonHolder.instance;
    }
}
