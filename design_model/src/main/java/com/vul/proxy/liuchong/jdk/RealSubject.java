package com.vul.proxy.liuchong.jdk;

/**
 * Author: Liuchong
 * Description:
 * date: 2019/12/30 15:01
 */
public class RealSubject implements Subject {
    @Override
    public void dosomething() {
        System.out.println("do some thing!");
    }

    @Override
    public Integer getOne() {
        return 1;
    }
}
