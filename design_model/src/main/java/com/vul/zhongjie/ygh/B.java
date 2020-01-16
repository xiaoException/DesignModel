package com.vul.zhongjie.ygh;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class B {
    private String name;

    public B(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(A a,C c){
        System.out.println("这是"+this.name);
        System.out.println("打印了A:"+a.getName()+",C:"+c.getName());
    }
}
