package com.zhu;

import com.zhu.controller.AopController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/4/17 10:26
 */
public class AopTest {
    @Test
    public void aopText() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AopController aopController = (AopController) ctx.getBean("aopController");
        String result = aopController.AopRequest("哈哈哈哈...");
        System.out.println("返回结果：" + result);
    }
}
