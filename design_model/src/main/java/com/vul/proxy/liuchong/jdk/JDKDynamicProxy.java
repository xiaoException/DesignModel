package com.vul.proxy.liuchong.jdk;

import java.lang.reflect.InvocationHandler;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/1/16 9:47
 */
public class JDKDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new JDKProxy(subject);
        return newProxyInstance(classLoader, interfaces, handler);
    }
}
