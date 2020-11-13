package com.feng.designpattern.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by fengbei
 * on 20-11-4
 */
public class AdminServiceInvocation implements InvocationHandler {

    private final Object target;

    public AdminServiceInvocation(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("判断用户是否有权限进行操作");
        Object invoke = method.invoke(target);
        System.out.println("记录用户执行操作的用户信息。更改内容和时间等");
        return invoke;
    }
}
