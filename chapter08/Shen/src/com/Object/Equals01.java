package com.Object;

/**
 * @Author 申宇强
 * @Date 2023/5/17 15:36
 */
public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bObj = a;
        System.out.println(bObj == a);//true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);
        //equals 方法，源码怎么查看.
        //把光标放在equals方法，直接输入ctrl+b
        "hello".equals("abc");
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
        String str1 = new String("shen");
        String str2 = new String("shen");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
    }

}

class B {

}

class A extends B {

}
