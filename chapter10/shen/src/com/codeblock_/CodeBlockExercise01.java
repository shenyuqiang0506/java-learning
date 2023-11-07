package com.codeblock_;

/**
 * @Author 申宇强
 * @Date 2023/8/16 14:16
 */
@SuppressWarnings({"all"})
public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total=" + Person.total);
        System.out.println("total=" + Person.total);
    }
}

class Person {
    public static int total;//静态变量

    static {//静态代码块
        total = 100;
        System.out.println("in static block");
    }
}
