package com.vul.guanchazhe.t2;

/**
 * @Author ygh
 * @Description
 * @Date 2019/12/10
 */
public class T1 {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(data);
        data.setWeatherData(11.2f,15.01f,11.22f);
    }
}
