package com.vul.zhongjie.ygh2;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class Test {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.buyThings(100);
        Sell sell = new Sell();
        sell.sellThings(50);
        Store store = new Store();
        store.clearSell();
    }
}
