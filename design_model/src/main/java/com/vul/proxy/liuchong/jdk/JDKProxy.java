package com.vul.proxy.liuchong.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author: Liuchong
 * Description:
 * date: 2019/12/30 15:02
 */
public class JDKProxy implements InvocationHandler {
    private Subject subject;

    public JDKProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object invoke = method.invoke(subject, args);
        System.out.println("after");
        return invoke;
    }

    public static void main(String[] args) {
        Subject subject = new RealSubject();

//        JDKProxy jdkProxy = new JDKProxy(subject);

//        Subject afterProxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
//                subject.getClass().getInterfaces(), jdkProxy);
        Subject proxy = JDKDynamicProxy.newProxyInstance(subject);
        proxy.getOne();
        proxy.dosomething();

       /* byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0",
                subject.getClass().getInterfaces());
        FileOutputStream out = null;

        try {
            out = new FileOutputStream("C:\\Users\\liuchong\\Desktop\\jdk.class");
            out.write($Proxy0s);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    }
}
