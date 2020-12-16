package com.feng.designpattern.创建型.抽象工厂模式.fruit;

import com.feng.designpattern.创建型.抽象工厂模式.Fruit;

/**
 * Created by fengbei
 * on 20-12-11
 */
public class ChinaApple implements Fruit {
    @Override
    public void get() {
        System.out.println("中国的苹果...");
    }
}
