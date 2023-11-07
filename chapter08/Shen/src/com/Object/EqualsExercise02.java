package com.Object;

/**
 * @Author 申宇强
 * @Date 2023/5/17 16:44
 */
public class EqualsExercise02 {
    public static void main(String[] args) {
        Penson p1 = new Penson();
        p1.name = "shen";

        Penson p2 = new Penson();
        p2.name = "shen";
        System.out.println(p1 == p2);//f
        System.out.println(p1.name.equals(p2.name));//t
        System.out.println(p1.equals(p2));//f

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));//t
        System.out.println(s1 == s2);//f
    }
}

class Penson {
    public String name;
}
