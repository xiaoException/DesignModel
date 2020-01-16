package com.vul.zhongjie.ygh1;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class C {
    private String name;

    public C(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print(A a, B b){
        System.out.println("这是"+this.name);
        System.out.println("打印了A:"+a.getName()+",B:"+b.getName());
    }
}
