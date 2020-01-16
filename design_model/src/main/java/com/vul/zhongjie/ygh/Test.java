package com.vul.zhongjie.ygh;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class Test {
    public static void main(String[] args) {
        A a = new A("A");
        B b = new B("B");
        C c = new C("C");
        a.print(b,c);
        b.print(a,c);
        c.print(a,b);
    }
}
