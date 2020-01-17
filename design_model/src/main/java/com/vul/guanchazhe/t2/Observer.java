package com.vul.guanchazhe.t2;

/**
 * @Author ygh
 * @Description 订阅者接口
 * @Date 2019/12/9
 */
public interface Observer {

    /**
     * 功能描述 : 更新订阅者消息
     * @author ygh
     * @date 16:57
     */
    public void update(float wenDu, float shiDu, float qiYa);
}
