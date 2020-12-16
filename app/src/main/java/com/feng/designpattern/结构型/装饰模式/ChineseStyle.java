package com.feng.designpattern.结构型.装饰模式;

/**
 * Created by fengbei
 * on 20-11-2
 */
public class ChineseStyle implements House {
    @Override
    public void sytle() {
        System.out.println("中式风格装修");
    }
}
