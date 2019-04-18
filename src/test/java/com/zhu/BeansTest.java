package com.zhu;

import com.zhu.beans.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/4/16 14:06
 */
public class BeansTest {
    @Test
    public void createBeans() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        helloWorld.setName("单例模式下spring容器启动时立即加载bean...");
        helloWorld.hello();
    }
}
