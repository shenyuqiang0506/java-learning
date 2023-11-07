package com.extend;

/**
 * @Author 申宇强
 * @Date 2023/4/22 9:50
 */
public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();//创建了子类对象 Sub
        System.out.println("=====2====");
        Sub sub1 = new Sub("xiaomi");
        //sub.sayOk();
        System.out.println("=====3====");
        Sub sub2 = new Sub("xiaomi",19);
    }
}
