package com.homework;

/**
 * @Author 申宇强
 * @Date 2024/1/25 19:21
 */
public class Homework05 {
    public static void main(String[] args) {
        String s1 = "shen";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);//f
        System.out.println(a.equals(b));//f
        System.out.println(a.name == b.name);//t
        String s4 = new String("shen");
        String s5 = "shen";

        System.out.println(s1 == s4);//f
        System.out.println(s4 == s5);//f

        String t1 = "hello" + s1;
        String t2 = "hellohshen";
        System.out.println(t1.intern() == t2);//f


    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}