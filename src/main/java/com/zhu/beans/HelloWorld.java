package com.zhu.beans;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/4/15 10:41
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello: " + name);
    }
}
