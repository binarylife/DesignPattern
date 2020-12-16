package com.feng.designpattern.行为型模式.责任链模式.impl;

import com.feng.designpattern.行为型模式.责任链模式.Ratify;
import com.feng.designpattern.行为型模式.责任链模式.Request;
import com.feng.designpattern.行为型模式.责任链模式.Result;

import java.util.List;

/**
 * Created by fengbei
 * on 20-11-17
 */
public class RealChain implements Ratify.Chain {

    public Request request;

    public List<Ratify> ratifyList;

    public int index;

    public RealChain(List<Ratify> list, Request request, int index) {
        ratifyList = list;
        this.request = request;
        this.index = index;
    }

    @Override
    public Request requset() {
        return request;
    }

    @Override
    public Result prceed(Request request) {
        Result proceed = null;
        if (ratifyList.size() > index) {
            RealChain realChain = new RealChain(ratifyList, request, index + 1);
            Ratify ratify = ratifyList.get(index);
            proceed = ratify.deal(realChain);
        }
        return proceed;
    }
}
