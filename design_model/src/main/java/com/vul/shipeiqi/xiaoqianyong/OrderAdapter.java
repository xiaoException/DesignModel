package com.vul.shipeiqi.xiaoqianyong;

import java.time.LocalDateTime;

/**
 * @Author xiaoqianyong
 * @DATE 2019/12/9 9:56
 * @Description  这是一种对象适配器  ，持有老接口对象的应用  实现新接口对老接口的调用
 */
public class OrderAdapter implements AppOrderApi {

    private SourceOrderApi sourceOrderApi;

    public OrderAdapter(SourceOrderApi sourceOrderApi) {
        this.sourceOrderApi = sourceOrderApi;
    }

    @Override
    public void updateDate(String orderId, String clientId) {
        long l = System.currentTimeMillis();
        LocalDateTime localDateTime=LocalDateTime.now();
        localDateTime.plusDays(3);
        sourceOrderApi.updateDate(orderId ,localDateTime.toString(), clientId );
    }
}
