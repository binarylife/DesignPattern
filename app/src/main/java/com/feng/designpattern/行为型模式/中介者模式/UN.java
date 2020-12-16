package com.feng.designpattern.行为型模式.中介者模式;

import com.feng.designpattern.行为型模式.中介者模式.Country;
import com.feng.designpattern.行为型模式.中介者模式.Mediator;

/**
 * Created by fengbei
 * on 20-12-8
 * 安理会在中间作出调停
 */
public class UN extends Mediator {
    @Override
    public void declare(Country country, String msg) {
        for (Country toCountry : countries) {
            if (toCountry.equals(country)) {
                String name = country.getName();
                toCountry.receive(msg);
            }
        }
    }
}
