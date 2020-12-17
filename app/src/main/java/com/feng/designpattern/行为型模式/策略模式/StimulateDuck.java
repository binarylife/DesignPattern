package com.feng.designpattern.行为型模式.策略模式;

import com.feng.designpattern.行为型模式.策略模式.behavior.FlyBehavior;
import com.feng.designpattern.行为型模式.策略模式.behavior.QuackBehavior;

/**
 * Created by fengbei
 * on 20-12-17
 */
public class StimulateDuck {

    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        Duck redHeadDuck = new RedHeadDuck();
        greenHeadDuck.dispaly();
        greenHeadDuck.swin();
        greenHeadDuck.setQuackBehavior(new QuackBehavior() {
            @Override
            public void quack() {
                System.out.println("我会叫");
            }
        });
        greenHeadDuck.quack();

        greenHeadDuck.setFlyBehavior(new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("我会飞");
            }
        });

        greenHeadDuck.fly();

        redHeadDuck.dispaly();
        redHeadDuck.quack();
        redHeadDuck.swin();
        redHeadDuck.setFlyBehavior(new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("我会飞");
            }
        });
    }

}
