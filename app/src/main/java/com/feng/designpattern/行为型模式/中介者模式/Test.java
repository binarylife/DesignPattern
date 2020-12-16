package com.feng.designpattern.行为型模式.中介者模式;

import com.feng.designpattern.行为型模式.中介者模式.impl.China;
import com.feng.designpattern.行为型模式.中介者模式.impl.Iraq;
import com.feng.designpattern.行为型模式.中介者模式.impl.USA;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class Test {
    public static void main(String[] args) {


        System.out.println("============方法一=============");
        UN mediator = new UN();
        Country usa = new USA(mediator, "美国");
        Country china = new China(mediator, "中国");
        Country iraq = new Iraq(mediator, "伊拉克");

        mediator.register(usa);
        mediator.register(china);
        mediator.register(iraq);

        usa.declare("我要打伊拉克, 谁管我跟谁急!!!");
        System.out.println("----------");
        china.declare("我们强烈谴责!!!");
        System.out.println("----------");
        iraq.declare("来呀, 来互相伤害呀!!!");
    }
}
