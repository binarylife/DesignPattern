package com.feng.designpattern.行为型模式.策略模式.behavior;

/**
 * Created by fengbei
 * on 20-12-17
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("---我不会飞---");
    }
}
