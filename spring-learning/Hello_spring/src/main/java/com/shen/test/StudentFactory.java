package com.shen.test;

/**
 * @Author 申宇强
 * @Date 2024/2/14 15:04
 */
public class StudentFactory {
    public static Student getStudent() {
        System.out.println("欢迎光临电子厂");
        return new Student();
    }
}
