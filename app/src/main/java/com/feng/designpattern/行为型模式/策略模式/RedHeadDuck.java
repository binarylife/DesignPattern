package com.feng.designpattern.行为型模式.策略模式;

import com.feng.designpattern.行为型模式.策略模式.behavior.BadQuackBehavior;

/**
 * Created by fengbei
 * on 20-12-17
 */
public class RedHeadDuck extends Duck {
    @Override
    public void dispaly() {
        System.out.println("我是独一无二的，我是红头鸭。");
    }

    public RedHeadDuck() {
        quackBehavior = new BadQuackBehavior();
    }
}
