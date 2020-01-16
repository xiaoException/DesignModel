package com.vul.zhongjie.ygh3;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class Mediator {
    private Purchase purchase;
    private Sell sell;
    private Store store;

    public Mediator() {
        purchase = new Purchase(this);
        sell = new Sell(this);
        store = new Store(this);
    }

    public void buyThings(int num){
        if (sell.getSellInfo()>80){
            store.increase(num);
        }else {
            store.increase(num/2);
        }
    }

    public void offSell(){
        System.out.println("折价抛空"+store.getStoreNum());
        store.decrease(store.getStoreNum());
    }

    public void sellThings(int num){
        if (store.getStoreNum()<num){
            buyThings(num);
        }
        System.out.println("销售："+num);
        store.decrease(num);
    }

    // 库存大了 折价销售
    public void clearSell(){
        System.out.println("清空库存："+store.getStoreNum());
        offSell();
    }

    public void execute(String str,Object... objects){
        if (str.equals("BUY")){
            this.buyThings((int)objects[0]);
        }else if (str.equals("SELL")){
            this.sellThings((int)objects[0]);
        }else if (str.equals("OFFSELL")){
            this.offSell();
        }
    }
}
