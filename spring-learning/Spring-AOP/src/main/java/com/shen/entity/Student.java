package com.shen.entity;

import org.springframework.stereotype.Component;

/**
 * @Author 申宇强
 * @Date 2024/2/15 16:41
 */
@Component
public class Student {
    //    public void study() {
//        System.out.println("室友还在打游戏，我狠狠的学Java，太爽了");
//        //现在我们希望在这个方法执行完之后，打印一些其他的内容，在不修改原有代码的情况下，该怎么做呢？
//    }
//    public void study(String str) {  //现在方法有一个String类型的参数
//        System.out.println("都别学Java了，根本找不到工作，快去卷" + str);
//    }
    //环绕
//    public String study(String str){
//        if(str.equals("Java"))
//            System.out.println("我的梦想是学Java");
//        else {
//            System.out.println("我就要学Java，不要修改我的梦想！");
//            str = "Java";
//        }
//        return str;
//    }
    //注解
    public void study() {
        System.out.println("hello world!");
    }
}
