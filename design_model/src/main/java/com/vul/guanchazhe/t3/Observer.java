package com.vul.guanchazhe.t3;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/6
 */
public class Observer implements EObserver{

    @Override
    public void update() {
        System.out.println("知道了,关闭电视");
    }
}
