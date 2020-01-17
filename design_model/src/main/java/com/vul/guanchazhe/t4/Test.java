package com.vul.guanchazhe.t4;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/14
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Weather weather = new Weather(phone);
        weather.change("11","22","33");
    }
}
