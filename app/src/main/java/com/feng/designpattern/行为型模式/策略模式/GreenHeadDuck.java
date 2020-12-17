package com.feng.designpattern.行为型模式.策略模式;

import com.feng.designpattern.行为型模式.策略模式.behavior.BadFlyBehavior;

/**
 * Created by fengbei
 * on 20-12-17
 */
public class GreenHeadDuck extends Duck {


    @Override
    public void dispaly() {
        System.out.println("我和你们不一样，我是绿色的头");
    }

   public GreenHeadDuck(){
       flyBehavior = new BadFlyBehavior();
   }
}
