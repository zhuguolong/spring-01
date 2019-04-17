package com.zhu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

/**
 * @author zhugu
 * @version 1.0
 * @Date 2019/4/17 10:09
 */
public class Aop {
    public void aopBefore() {
        System.out.println("aop before...");
    }

    public void aopAfter() {
        System.out.println("aop after...");
    }

    public void aopThrowing() {
        System.out.println("aop throwing...");
    }

    public void aopReturning() {
        System.out.println("aop returning...");
    }

    public Object aopAround(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("aop around begin...");
        try {
            return jp.proceed();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            System.out.println("aop around end...");
        }
    }
}
