package com.vul.proxy.liuchong.staticdemo.simple;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/1/14 10:57
 */
public class VulSimpleProxy implements VulSimpleInterface {
    private VulSimpleInterface gamePlayer;

    public VulSimpleProxy(String name) throws Exception {
        gamePlayer = new VulSimple(this, name);
    }


    @Override
    public void add() {
        this.gamePlayer.add();
    }

    @Override
    public void update() {
        this.gamePlayer.update();
    }

    public static void main(String[] args) throws Exception {
        VulSimpleInterface gamePlayer = new VulSimpleProxy("张三");
        gamePlayer.add();
        gamePlayer.update();
    }
}
