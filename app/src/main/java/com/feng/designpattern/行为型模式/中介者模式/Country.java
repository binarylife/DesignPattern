package com.feng.designpattern.行为型模式.中介者模式;

/**
 * Created by fengbei
 * on 20-12-8
 * 模式实现
 * <p>
 * 联合国转发各国声明, 调停各国关系:
 * 各国向联合国安理会发送和接收消息, 安理会在各国间'适当地'转发请求以实现协作行为:
 */
public abstract class Country {

    protected Mediator mediator;
    private String name;

    public Country(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract void declare(String msg);

    public abstract void receive(String msg);
}
