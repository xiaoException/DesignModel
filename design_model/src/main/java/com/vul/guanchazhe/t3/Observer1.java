package com.vul.guanchazhe.t3;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/6
 */
public class Observer1 implements EObserver{
    @Override
    public void update() {
        System.out.println("关闭程序");
    }
}
