package com.string_;

/**
 * @Author 申宇强
 * @Date 2024/1/9 12:00
 */
public class StringExercise06 {
    public static void main(String[] args) {
        String s1 = "shen";  //s1 指向池中的 “shen”
        String s2 = "java"; // s2 指向池中的 “java”
        String s5 = "shenjava"; //s5 指向池中的 “shenjava”
        String s6 = (s1 + s2).intern();//s6 指向池中的   “shenjava”
        System.out.println(s5 == s6); //T
        System.out.println(s5.equals(s6));//T
    }
}
