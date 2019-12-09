package com.vul.zhuangshiqi.xiaoqianyong;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author xiaoqianyong
 * @DATE 2019/12/4 10:20
 * @Description
 */
public class ZhuangShiQi {

    /**
     * 动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式相比生成子类较为灵活
     * @param args
     * @throws IOException
     */
/*    public static void main(String[] args) {
        RouJIaMoComponent rouJIaMoComponent = new RouJIaMoComponent();
        System.out.println(rouJIaMoComponent.operation());

        //在基础上加鸡蛋
        Component jidanDecorator = new JiDanRoujiaMoDecorator(rouJIaMoComponent);
        System.out.println(jidanDecorator.operation());

        //只有 包装
        Component baozhuangDecorator = new PacketRoujiaMoDecorator(rouJIaMoComponent);
        System.out.println(baozhuangDecorator.operation());

        //加鸡蛋 并且精美包装
        Component decorator = new PacketRoujiaMoDecorator(new JiDanRoujiaMoDecorator(rouJIaMoComponent));
        System.out.println(decorator.operation());
    }*/

    public static void main(String[] args) throws IOException {

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("F:\\data.txt"));

        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("F:\\data.txt")));

        for (int i = 0; i < 1000; i++) {
           // outputStream.write(i);
            dataOutputStream.write(i);
        }

    }
    //OutputStream
    //FileOutputStream
    //BufferedOutputStream
}
