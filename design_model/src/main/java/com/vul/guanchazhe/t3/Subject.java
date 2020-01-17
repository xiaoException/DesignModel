package com.vul.guanchazhe.t3;


/**
 * 功能描述 : 抽出秘书类使其面向接口编程
 * @author ygh
 * @date 15:12
 */
public interface Subject {
    /**
     * 功能描述 : 增加观察者
     * @author ygh
     * @date 15:14
     */
    public void add(EObserver eObserver);

    /**
     * 功能描述 : 移除观者者
     * @author ygh
     * @date 15:15
     */
    public void remove(EObserver eObserver);


    /**
     * 功能描述 : 通知观察者
     * @author ygh
     * @date 15:15
     */
    public void notifyObserver();
}

