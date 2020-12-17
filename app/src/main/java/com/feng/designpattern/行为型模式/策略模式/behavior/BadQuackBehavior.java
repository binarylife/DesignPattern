package com.feng.designpattern.行为型模式.策略模式.behavior;

/**
 * Created by fengbei
 * on 20-12-17
 */
public class BadQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫~");
    }
}
