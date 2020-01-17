package com.vul.guanchazhe.t1;

/**
 * @Author ygh
 * @Description
 * @Date 2019/12/9
 */
public class WeatherData {
    private float wenDu;
    private float shiDU;
    private float qiYa;

    public float getWenDu() {
        return wenDu;
    }

    public void setWenDu(float wenDu) {
        this.wenDu = wenDu;
    }

    public float getShiDU() {
        return shiDU;
    }

    public void setShiDU(float shiDU) {
        this.shiDU = shiDU;
    }

    public float getQiYa() {
        return qiYa;
    }

    public void setQiYa(float qiYa) {
        this.qiYa = qiYa;
    }

    public void weatherChanged(){

        // 调用各种条件变化了 如果是现有设计的话--每增加一个就多写一个类，改一次这里的代码
    }

    public static void main(String[] args) {
        System.out.println("\\\\—_你好");
    }
}
