package com.wrapper;

/**
 * @Author 申宇强
 * @Date 2024/1/8 10:52
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;
        //方式1
        String s1 = i + "";
        //方式2
        String s2 = i.toString();
        //方式3
        String s3 = String.valueOf(i);
        //String -> 包装类(Integer)
        String str4 = "12345";
        Integer n1 = Integer.parseInt(str4);
//        Integer i3 = new Integer(str4);//构造器
        System.out.println("ok~~");
    }
}
