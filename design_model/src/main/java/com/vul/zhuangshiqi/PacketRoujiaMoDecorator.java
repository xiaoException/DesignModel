package com.vul.zhuangshiqi;

/**
 * @Author xiaoqianyong
 * @DATE 2019/12/4 11:00
 * @Description
 */
public class PacketRoujiaMoDecorator implements Component {

    protected Component component;


    public PacketRoujiaMoDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return "精美包装<html>"+component.operation()+"</html>";
    }
}
