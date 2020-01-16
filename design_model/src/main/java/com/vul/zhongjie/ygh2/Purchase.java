package com.vul.zhongjie.ygh2;

/**
 * @Author ygh
 * @Description 采购部门
 * @Date 2020/1/16
 */
public class Purchase {
    public void buyThings(int num){
        Store store = new Store();

        Sell sell = new Sell();

        if (sell.getSellInfo()>80){
            store.increase(num);
        }else {
            store.increase(num/2);
        }
    }

    public void refuseBuy(){
        System.out.println("不在采购电脑");
    }
}
