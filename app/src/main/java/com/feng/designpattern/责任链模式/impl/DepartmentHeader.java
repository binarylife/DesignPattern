package com.feng.designpattern.责任链模式.impl;

import com.feng.designpattern.责任链模式.Ratify;
import com.feng.designpattern.责任链模式.Request;
import com.feng.designpattern.责任链模式.Result;

/**
 * Created by fengbei
 * on 20-11-19
 */
public class DepartmentHeader implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request requset = chain.requset();
        System.out.println("DepartmentHeader=====>request:"
                + requset.toString());
        if (requset.getDay() > 7) {
            return new Result(false, "你完全没这个必要");
        }
        return new Result(true, "DepartmentHeader：不要着急，把事情处理完再回来！");
    }
}
