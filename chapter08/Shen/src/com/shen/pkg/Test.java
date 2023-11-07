package com.shen.pkg;

import com.shen.modifier.A;

/**
 * @Author 申宇强
 * @Date 2023/4/15 11:00
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下,可以访问public 修饰的方法
        //但是不能访问 protected 默认, private
        System.out.println(a.n1);
        a.m1();
        //不能访问 a.m2()....
    }
}
