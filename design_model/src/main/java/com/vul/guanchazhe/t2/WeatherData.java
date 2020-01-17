package com.vul.guanchazhe.t2;

import java.util.LinkedList;

/**
 * @Author ygh
 * @Description
 * @Date 2019/12/9
 */
public class WeatherData implements Subject{
    // 订阅者
    private LinkedList linkedList;
    private float wenDu;
    private float shiDU;
    private float qiYa;

    public WeatherData(){
        linkedList = new LinkedList();
    }

    @Override
    public boolean addObserver(Observer observer) {
        return linkedList.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return linkedList.remove(observer);
    }

    @Override
    public void notifiedObserver() {
        linkedList.forEach(i->{
            Observer observer = (Observer) i;
            observer.update(wenDu,shiDU,qiYa);
        });
    }

    public void weatherChanged(){
        notifiedObserver();
    }

    public void setWeatherData(float wenDu, float shiDU,float qiYa){
        this.wenDu = wenDu;
        this.shiDU = shiDU;
        this.qiYa = qiYa;
        weatherChanged();
    }
}
