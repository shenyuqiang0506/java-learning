package com.extend_.exercise;

/**
 * @Author 申宇强
 * @Date 2023/5/12 14:45
 */
public class ExtendExercise01 {
    public static void main(String[] args) {
        B b = new B();

    }
}
class A {
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}
class B extends A {
    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
        super();
        System.out.println("b name");
    }
}
