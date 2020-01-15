package com.vul.proxy.liuchong.staticdemo.force;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/1/14 11:12
 */
public class VulForceProxy implements VulForceInterface {
    private VulForceInterface gamePlayer = null;

    VulForceProxy(VulForceInterface gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void add() {
        this.gamePlayer.add();
    }

    @Override
    public void update() {
        this.gamePlayer.update();
    }

    @Override
    public VulForceInterface getProxy() {
        return this;
    }

    public static void main(String[] args) {
        VulForce player = new VulForce("张三;");
        VulForceInterface proxy = player.getProxy();
        proxy.add();
        proxy.update();
    }
}
