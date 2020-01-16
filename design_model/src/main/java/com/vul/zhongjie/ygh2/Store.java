package com.vul.zhongjie.ygh2;

import com.vul.zhongjie.ygh.C;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class Store {
    private static int COMPUTER_NUM = 100;
    public void increase(int num){
        COMPUTER_NUM += num;
        System.out.println("库存为："+COMPUTER_NUM);
    }
    public void decrease(int num){
        COMPUTER_NUM -= num;
        System.out.println("库存为："+COMPUTER_NUM);
    }
    public int getStoreNum(){
        return COMPUTER_NUM;
    }
    // 库存大了 折价销售
    public void clearSell(){
        Sell sell = new Sell();
        Purchase purchase = new Purchase();
        System.out.println("清空库存："+COMPUTER_NUM);
        sell.offSell();

    }
}
