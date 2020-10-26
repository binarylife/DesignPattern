package com.feng.designpattern.抽象工厂模式.factory;

import java.lang.reflect.Proxy;

/**
 * Created by fengbei
 * on 20-10-22
 */
public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        JDKInvocationHandler jdkInvocationHandler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(contextClassLoader, new Class[]{interfaces[0]
        }, jdkInvocationHandler);
    }
}
