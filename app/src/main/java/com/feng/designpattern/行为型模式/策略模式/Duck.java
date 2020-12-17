package com.feng.designpattern.行为型模式.策略模式;

import com.feng.designpattern.行为型模式.策略模式.behavior.FlyBehavior;
import com.feng.designpattern.行为型模式.策略模式.behavior.QuackBehavior;

/**
 * Created by fengbei
 * on 20-12-17
 */
public abstract class Duck {
    //  飞行属性
    FlyBehavior flyBehavior;
//    //   叫属性
    QuackBehavior quackBehavior;

    public Duck() {
        //子类的构造函数中可以定义行为

    }

    public void quack() {
//        System.out.println("~~嘎嘎嘎~~");
        //  抽象出特有的叫声特性
        quackBehavior.quack();
    }

    /**
     * 鸭子外形 由子类负责实现
     */
    public abstract void dispaly();

    public void swin() {
        System.out.println("~~我会游泳~~");
    }

    public void fly() {
        //  抽象出特有的飞行特性
        flyBehavior.fly();
    }

    //实例化对象时可以动态的改变对象的行为(比继承灵活性强)
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    //实例化对象时可以动态的改变对象的行为
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
