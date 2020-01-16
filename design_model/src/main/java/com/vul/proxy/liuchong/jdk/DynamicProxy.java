package com.vul.proxy.liuchong.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/1/15 17:28
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance (ClassLoader loader, Class<?>[] interfaces, InvocationHandler invocationHandler) {
        return (T) Proxy.newProxyInstance(loader, interfaces, invocationHandler);
    }
}
