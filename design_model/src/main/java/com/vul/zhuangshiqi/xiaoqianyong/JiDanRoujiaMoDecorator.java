package com.vul.zhuangshiqi.xiaoqianyong;

/**
 * @Author xiaoqianyong
 * @DATE 2019/12/4 10:59
 * @Description
 */
public class JiDanRoujiaMoDecorator implements Component {

    protected Component component;

    public JiDanRoujiaMoDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return component.operation()+"加鸡蛋";
    }
}
