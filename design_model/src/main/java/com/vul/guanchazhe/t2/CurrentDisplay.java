package com.vul.guanchazhe.t2;

/**
 * @Author ygh
 * @Description
 * @Date 2019/12/9
 */
public class CurrentDisplay implements  Observer,DisplayElement{

    private Subject subject;
    private float wenDu;
    private float shiDu;
    /**
     * 功能描述 : 构造函数，用于注册
     * @author ygh
     * @date 17:19
     */
    public CurrentDisplay(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("shiDu"+shiDu+":wenDu"+wenDu);
    }

    @Override
    public void update(float wenDu, float shiDu, float qiYa) {
        this.wenDu = wenDu;
        this.shiDu = shiDu;
        display();
    }
}
