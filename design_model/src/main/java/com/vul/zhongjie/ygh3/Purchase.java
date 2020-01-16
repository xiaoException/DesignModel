package com.vul.zhongjie.ygh3;

/**
 * @Author ygh
 * @Description 采购部门
 * @Date 2020/1/16
 */
public class Purchase {
    private Mediator mediator;

    public Purchase(Mediator mediator) {
        this.mediator = mediator;
    }

    public void buy(int num){
        mediator.execute("BUY",num);
    }

    public void refuseBuy(){
        System.out.println("不在采购电脑");
    }
}
