package com.yehao.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Package: com.yehao
 * @Description:
 * @function:
 * @Author : LiuYong
 * Created by yehao on 2018/9/29.
 */
public class BusinessTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo_config.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务启动");
        System.in.read();
    }

}
