package com.feng.designpattern.创建型.抽象工厂模式.fruit;

/**
 * Created by fengbei
 * on 20-12-11
 */
public class USABanana extends Banana {
    @Override
    public void get() {
        System.out.println("美国的香蕉...");
    }
}
