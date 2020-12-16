package com.feng.designpattern.创建型.抽象工厂模式.fruitfactory;

import com.feng.designpattern.创建型.抽象工厂模式.Fruit;
import com.feng.designpattern.创建型.抽象工厂模式.FruitFactory;
import com.feng.designpattern.创建型.抽象工厂模式.fruit.ChinaApple;
import com.feng.designpattern.创建型.抽象工厂模式.fruit.ChinaBanana;

/**
 * Created by fengbei
 * on 20-12-11
 */
public class ChinaFactroty implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new ChinaApple();
    }

    @Override
    public Fruit getBanana() {
        return new ChinaBanana();
    }
}
