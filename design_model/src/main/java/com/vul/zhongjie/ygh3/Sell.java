package com.vul.zhongjie.ygh3;

import java.util.Random;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/16
 */
public class Sell {

    private Mediator mediator;

    public Sell(Mediator mediator) {
        this.mediator = mediator;
    }

    public int getSellInfo(){
        Random random = new Random();
        int status = random.nextInt(100);
        System.out.println("当前销售情况为"+status);
        return  status;
    }

    public void sell(int num){
        mediator.execute("SELL",num);
    }

}
