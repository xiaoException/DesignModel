package com.vul.guanchazhe.t4;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/14
 */
public class Weather {
    private String wenDu;
    private String shiDu;
    private String qiYa;

    private Phone phone;

    // 注入观察者
    public Weather(Phone phone) {
        this.phone = phone;
    }

    //感应器告知数据变了
    public void change(String wenDu, String shiDu, String qiYa){
        this.wenDu = wenDu;
        this.shiDu = shiDu;
        this.qiYa = qiYa;
        phone.update(wenDu,shiDu);
    }

}
