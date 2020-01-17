package com.vul.guanchazhe.t3;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/6
 */
public class Test {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        Observer observer = new Observer();
        Observer1 observer1 = new Observer1();
        Observer observer2 = new Observer();
        secretary.add(observer);
        secretary.add(observer2);
        secretary.add(observer1);
        secretary.notifyObserver();
    }
}
