package com.feng.designpattern.结构型.装饰模式;

/**
 * Created by fengbei
 * on 20-11-2
 */
public class RedDecorator extends HouseDecorator {
    public RedDecorator(House house) {
        super(house);
    }

    @Override
    public void sytle() {
        super.sytle();
        System.out.println("红色装饰墙");
    }
}
