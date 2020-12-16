package com.feng.designpattern.行为型模式.责任链模式.impl;

import com.feng.designpattern.行为型模式.责任链模式.Ratify;
import com.feng.designpattern.行为型模式.责任链模式.Request;
import com.feng.designpattern.行为型模式.责任链模式.Result;

/**
 * Created by fengbei
 * on 20-11-17
 */
public class GroupLeader implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request requset = chain.requset();
        System.out.println("GroupLeader=====>request:" + requset.toString());

        if (requset.getDay() > 1) {
            // 权利范围之外了，需要向上反馈
            Request.Builder builder = new Request.Builder().newRequset(requset).setManagerInfo(requset.getName() + "平时表现不错，且现在项目也不忙");
            Request re = builder.build();
            return chain.prceed(re);
        }
        return new Result(true, "GroupLeader：早点把事情办完，项目离不开你");
    }
}
