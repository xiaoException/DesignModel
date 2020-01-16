package com.vul.zhongjie.ygh2;

import java.util.Random;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class Sell {

    public void sellThings(int num){
        Store store = new Store();
        Purchase purchase = new Purchase();
        if (store.getStoreNum()<num){
            purchase.buyThings(num);
        }
        System.out.println("销售："+num);
        store.decrease(num);
    }

    public int getSellInfo(){
        Random random = new Random();
        int status = random.nextInt(100);
        System.out.println("当前销售情况为"+status);
        return  status;
    }

    public void offSell(){
        Store store = new Store();
        System.out.println("折价抛空"+store.getStoreNum());
        store.decrease(store.getStoreNum());
    }
}
