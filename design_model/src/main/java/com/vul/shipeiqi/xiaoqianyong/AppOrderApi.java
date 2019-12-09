package com.vul.shipeiqi.xiaoqianyong;

/**
 * @Author xiaoqianyong
 * @DATE 2019/12/9 9:52
 * @Description
 */
public interface AppOrderApi {

    /**
     * 对于app商城  不传时间参数(默认为当前时间+3天  后端又必须需要时间  ）
     * @param orderId
     * @param clientId
     */
    void updateDate(String orderId, String clientId);
}
