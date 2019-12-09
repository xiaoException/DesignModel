package com.vul.shipeiqi.xiaoqianyong;

import java.time.LocalDateTime;

/**
 * @Author xiaoqianyong
 * @DATE 2019/12/9 10:06
 * @Description  是类的适配  具体为谁类做适配 当然也可以实现接口（但是我觉得实现接口重写方法多余，，那要原有接口实现类来干嘛）
 */
public class OrderAdapter2 extends SourceOrderApiImpl implements AppOrderApi {

    @Override
    public void updateDate(String orderId, String clientId) {
        long l = System.currentTimeMillis();
        LocalDateTime localDateTime=LocalDateTime.now();
        localDateTime.plusDays(3);
        updateDate(orderId,localDateTime.toString(), clientId);
    }
}
