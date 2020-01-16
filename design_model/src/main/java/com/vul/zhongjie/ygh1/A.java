package com.vul.zhongjie.ygh1;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(B b, C c){
        System.out.println("这是"+this.name);
        System.out.println("打印了A:"+b.getName()+",C:"+c.getName());
    }
}
