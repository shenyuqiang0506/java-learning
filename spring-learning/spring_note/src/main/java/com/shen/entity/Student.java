package com.shen.entity;

import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author 申宇强
 * @Date 2024/2/14 15:37
 */
@ToString
@Component("test")//容器自己反射获取构造方法去生成这个对象
public class Student {
    @Autowired
//    @Qualifier("a")
    Teacher teacher;

    //    @Autowired
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
    @PostConstruct
    public void init() {
        System.out.println("我是初始化方法");
    }

    //    @Override
//    public void setBeanName(String name) {
//        System.out.println("我得到了bean的名称" + name);
//    }
    public void syncTest() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "我是同步执行的方法，开始...");
        Thread.sleep(3000);
        System.out.println("我是同步执行的方法，结束！");
    }

    @Async
    public void asyncTest() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "我是异步执行的方法，开始...");
        Thread.sleep(3000);
        System.out.println("我是异步执行的方法，结束！");
    }

    @Scheduled(fixedRate = 2000)   //单位依然是毫秒，这里是每两秒钟打印一次
    public void task() {
        System.out.println("我是定时任务！" + new Date());
    }
}
