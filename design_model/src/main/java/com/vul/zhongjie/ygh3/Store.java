package com.vul.zhongjie.ygh3;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class Store {
    private static int COMPUTER_NUM = 100;
    private Mediator mediator ;

    public Store(Mediator mediator) {
        this.mediator = mediator;
    }

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

    public void clear(){
        mediator.execute("OFFSELL");
    }

}
