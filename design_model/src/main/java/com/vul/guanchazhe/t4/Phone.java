package com.vul.guanchazhe.t4;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/14
 */
public class Phone {

    private String wenDu;
    private String shiDu;

    protected void display(){
        System.out.println("温度的"+wenDu+";湿度："+shiDu);
    }

    public void update(String wenDu,String shiDu){
        this.shiDu = shiDu;
        this.wenDu = wenDu;
        display();
    }
}
