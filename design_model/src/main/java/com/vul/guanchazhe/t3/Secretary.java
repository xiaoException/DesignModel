package com.vul.guanchazhe.t3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ygh
 * @Description
 * @Date 2020/1/6
 */
public class Secretary implements Subject{
    // 通知的同事
    private List<EObserver> list = new ArrayList<>();

    @Override
    public void add(EObserver observer){
        list.add(observer);
    }

    @Override
    public void remove(EObserver observer){
        for (int i = 0; i < list.size(); i++) {
            if (observer == list.get(i)){
                list.remove(i);
            }
        }
    }

    /**
     * 功能描述 : 通知
     * @author ygh
     * @date 14:57
     */
    @Override
    public void notifyObserver(){
        list.forEach((i)->{
            System.out.println("老板来了");
            i.update();
        });
    }

}
