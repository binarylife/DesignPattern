package com.feng.designpattern.装饰模式;

/**
 * Created by fengbei
 * on 20-11-2
 * 抽象装饰类
 */
public class HouseDecorator implements House {

    House house;

    @Override
    public void sytle() {
        house.sytle();
    }


    public HouseDecorator(House house) {
        this.house = house;
    }
}
