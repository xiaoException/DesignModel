package com.vul.proxy.liuchong.staticdemo.simple;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/1/14 10:55
 */
public class VulSimple implements VulSimpleInterface {
    private String vulName = "";

    VulSimple(VulSimpleInterface gamePlayer, String vulName) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实角色");
        } else {
            this.vulName = vulName;
        }
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
