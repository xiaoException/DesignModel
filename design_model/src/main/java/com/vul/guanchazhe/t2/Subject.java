package com.vul.guanchazhe.t2;

/**
 * @Author ygh
 * @Description 主题接口
 * Observer适用于增加或者删除一个订阅者
 * @Date 2019/12/9
 */
public interface Subject {

    /**
     * 功能描述 : 增加一个订阅者
     * @author ygh
     * @date 16:49
     */

    public boolean addObserver(Observer observer);


    /**
     * 功能描述 : 移除一个订阅者
     * @author ygh
     * @date 16:49
     */

    public boolean removeObserver(Observer observer);


    /**
     * 功能描述 : 通知数据改变
     * @author ygh
     * @date 16:51
     */

    public void notifiedObserver();

}
