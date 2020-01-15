package com.vul.proxy.liuchong.staticdemo.force;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/1/14 11:06
 */
public class VulForce implements VulForceInterface {
    private String name = "";

    private VulForceInterface proxy = null;

    public VulForce(String name) {
        this.name = name;
    }

    @Override
    public VulForceInterface getProxy() {
        this.proxy = new VulForceProxy(this);
        return this.proxy;
    }

    @Override
    public void add() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void update() {
        if (this.isProxy()) {
            System.out.println(this.name + "又升了一级！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
