package com.vul.proxy.liuchong.staticdemo;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/1/13 15:30
 */
public class VulProxy implements VulInterface {

    private VulInterface vulInterface;

    public VulProxy(VulInterface vulInterface) {
        this.vulInterface = vulInterface;
    }

    @Override
    public void add() {
        vulInterface.add();
        insertLog();
    }

    @Override
    public void update() {
        vulInterface.update();
        updateLog();
    }

    private void insertLog() {
        System.out.println("插入日志");
    }

    private void updateLog() {
        System.out.println("更新日志");
    }

    public static void main(String[] args) {
        VulProxy vulProxy = new VulProxy(new Vul("CNNVD-1"));
        vulProxy.add();
        vulProxy.update();
    }
}

