package com.shen.modifier;

/**
 * @Author 申宇强
 * @Date 2023/4/15 10:55
 */
public class B {
    public void say(){
        A a = new A();
        //在同一个包下，可以访问 public , protected  和
        // 默认修饰属性或方法,不能访问 private 属性或方法
        System.out.println("n1=" + a.n1 + " " + a.n2 + " " + a.n3);
        a.m1();
        a.m2();
        a.m3();
        //a.m4()错误
    }
}
