package com.vul.shipeiqi.xiaoqianyong;

/**
 * @Author xiaoqianyong
 * @DATE 2019/12/9 9:49
 * @Description 老的接口实现，对于新的接口无法适用
 */
public class SourceOrderApiImpl implements SourceOrderApi {

    public void updateDate(String orderId, String date, String clientId) {
        if (date==null){
            throw new RuntimeException("时间参数异常");
        }
        System.out.println(orderId+"延迟发货时间到"+date);
    }
}
