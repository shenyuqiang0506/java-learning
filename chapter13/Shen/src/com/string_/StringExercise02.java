package com.string_;

/**
 * @Author 申宇强
 * @Date 2024/1/8 12:31
 */
public class StringExercise02 {
    public static void main(String[] args) {
        String a = "shen"; //a 指向 常量池的 “shen”
        String b = new String("shen");//b 指向堆中对象
        System.out.println(a.equals(b)); //T
        System.out.println(a == b); //F
        //b.intern() 方法返回常量池地址
        System.out.println(a == b.intern()); //T //intern方法自己先查看API
        System.out.println(b == b.intern()); //F
    }
}
