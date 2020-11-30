package com.feng.designpattern.责任链模式;

import com.feng.designpattern.代理模式.动态代理.AdminServiceDynamicProxy;
import com.feng.designpattern.代理模式.动态代理.AdminServiceInvocation;
import com.feng.designpattern.代理模式.静态代理.AdminService;
import com.feng.designpattern.代理模式.静态代理.AdminServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class Test {
    public static void main(String[] args) {


        System.out.println("============方法一=============");

        Request build = new Request.Builder().setName("张三").setDay(5).setReason("事假").build();
        ChainOfResponsibilityClient chainOfResponsibilityClient = new ChainOfResponsibilityClient();
        chainOfResponsibilityClient.addRatifys(new Ratify() {
            @Override
            public Result deal(Chain chain) {
                System.out.println("default=====>request:" + chain.requset().toString());
                Request build = new Request.Builder().newRequset(chain.requset()).setCoustomInfo(chain.requset().getName() + "自己先确认下")
                        .build();
                return chain.prceed(build);
            }
        });
        chainOfResponsibilityClient.execute(build);
    }
}
