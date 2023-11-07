package com.extend;

/**
 * @Author 申宇强
 * @Date 2023/4/22 9:55
 */
public class Base extends TopBase {//父类
    //4个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {//无参构造器
        System.out.println("父类Base()...");
    }
    public Base (String name) {
        System.out.println("父类Base(String name)...");
    }
    public Base (String name,int age) {
        System.out.println("父类Base(String name,int age)...");
    }

    //父类提供一个public的方法,返回了n4
    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void callTest400() {
        test400();
    }
}