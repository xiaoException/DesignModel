package com.vul.proxy.liuchong.staticdemo;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/1/13 15:29
 */
public class Vul implements VulInterface {
    private String vulName;

    public Vul(String vulName) {
        this.vulName = vulName;
    }

    @Override
    public void add() {
            System.out.println("增加漏洞" + vulName);
    }

    @Override
    public void update() {
            System.out.println("更新漏洞" + vulName);
    }

}
