package com.yehao.code.business.controller;

import com.yehao.code.business.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package: com.yehao.code.business.controller
 * @Description:
 * @function:
 * @Author : LiuYong
 * Created by yehao on 2018/9/29.
 */
public class ConsumerController {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer start....");
        System.out.println(demoService.getStrList(10L));
    }

}
