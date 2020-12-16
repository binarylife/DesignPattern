package com.feng.designpattern.创建型.抽象工厂模式.fruitfactory;

import com.feng.designpattern.创建型.抽象工厂模式.Fruit;
import com.feng.designpattern.创建型.抽象工厂模式.FruitFactory;
import com.feng.designpattern.创建型.抽象工厂模式.fruit.ChinaApple;
import com.feng.designpattern.创建型.抽象工厂模式.fruit.ChinaBanana;
import com.feng.designpattern.创建型.抽象工厂模式.fruit.USAApple;
import com.feng.designpattern.创建型.抽象工厂模式.fruit.USABanana;

/**
 * Created by fengbei
 * on 20-12-11
 */
public class USAFactroty implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new USAApple();
    }

    @Override
    public Fruit getBanana() {
        return new USABanana();
    }
}
