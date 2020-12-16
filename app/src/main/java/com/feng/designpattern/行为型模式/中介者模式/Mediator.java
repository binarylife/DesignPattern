package com.feng.designpattern.行为型模式.中介者模式;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by fengbei
 * on 20-12-8
 */
public abstract class Mediator {
    protected List<Country> countries = new LinkedList<>();

    public void register(Country country) {
        countries.add(country);
    }

    public void remove(Country country) {
        countries.remove(country);
    }


    /**
     * 用于和各个同事之间通讯
     */
    public abstract void declare(Country country, String msg);
}
