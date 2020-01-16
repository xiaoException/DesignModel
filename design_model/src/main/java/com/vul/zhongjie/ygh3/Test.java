package com.vul.zhongjie.ygh3;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        Sell sell = new Sell(mediator);
        Store store = new Store(mediator);
        purchase.buy(100);
        sell.sell(50);
        store.clear();
    }
}
