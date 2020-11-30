package com.feng.designpattern.责任链模式.impl;

import com.feng.designpattern.责任链模式.Ratify;
import com.feng.designpattern.责任链模式.Request;
import com.feng.designpattern.责任链模式.Result;

/**
 * Created by fengbei
 * on 20-11-19
 */
public class Manager implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.requset();
        System.out.println("Manager=====>request:" + request.toString());
        if (request.getDay() > 3) {
            //  超过3天，向上抛
            Request build = new Request.Builder().newRequset(request).setManagerInfo(request.getName() + "每月的KPI考核还不错，可以批准")
                    .build();
            return chain.prceed(build);
        }
        return new Result(true, "Manager：早点把事情办完，项目离不开你");
    }
}
