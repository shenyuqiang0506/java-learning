package com.string_;

/**
 * @Author 申宇强
 * @Date 2024/1/8 12:38
 */
public class StringExercise04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "shen";
        Person p2 = new Person();
        p2.name = "shen";
        System.out.println(p1.name.equals(p2.name));//比较内容: True
        System.out.println(p1.name == p2.name);  //T
        System.out.println(p1.name == "shen");   //T

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2); //False

    }
}

class Person {
    public String name;
}
