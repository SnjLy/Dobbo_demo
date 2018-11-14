package com.yehao.code.business;

import com.yehao.code.business.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Package: com.yehao.code.business
 * @Description:
 * @function:
 * @Author : LiuYong
 * Created by yehao on 2018/9/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/dubbo-consumer.xml")
public class ConsumerTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testDubboConsumer(){
        List<String> list = demoService.getStrList(12L);
        System.out.println(list);
    }

}
