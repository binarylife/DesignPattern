package com.feng.designpattern.行为型模式.中介者模式.impl;

import com.feng.designpattern.行为型模式.中介者模式.Country;
import com.feng.designpattern.行为型模式.中介者模式.Mediator;

/**
 * Created by fengbei
 * on 20-12-8
 */
public class USA extends Country {


    public USA(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void declare(String msg) {
        mediator.declare(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("美国接收到: [" + msg + "]");
    }
}
