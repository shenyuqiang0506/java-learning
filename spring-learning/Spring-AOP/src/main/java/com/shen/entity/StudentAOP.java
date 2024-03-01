package com.shen.entity;

import org.aopalliance.aop.Advice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author 申宇强
 * @Date 2024/2/15 16:44
 */
@Aspect
@Component
public class StudentAOP implements Advice {
    //这个方法就是我们打算对其进行的增强操作
//    public void afterStudy(JoinPoint point) {   //JoinPoint实例会被自动传入
//        //这里我们直接通过getArgs()返回的参数数组获取第1个参数
//        System.out.println("学什么"+point.getArgs()[0]+"，Rust天下第一！");
//    }

    //    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("方法开始之前");
//        String arg = joinPoint.getArgs()[0] + "伞兵一号";
//        Object value = joinPoint.proceed(new Object[]{arg});
//        System.out.println("方法执行完成，结果为："+value);
//        return value;
//    }

    //注解开发
//    @After("execution(public void com.shen.entity.Student.study(*))")
//    public void afterStudy() {
//        System.out.println("我是后置增强");
//    }
    @Around("execution(* com.shen.entity.Student.study(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("方法执行之前！");
        Object val = point.proceed();
        System.out.println("方法执行之后！");
        return val;
    }
}
