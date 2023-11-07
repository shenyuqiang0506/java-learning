package com.extend_.exercise;

/**
 * @Author 申宇强
 * @Date 2023/5/12 14:54
 */
public class ExtendExercise02 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class AA {
    public AA() {
        System.out.println("我是A类");
    }
}

class BB extends AA {
    public BB() {
        System.out.println("我是B类的无参构造器");
    }
    public BB(String name){
        System.out.println(name+"我是B类的有参构造");
    }
}
class C extends BB{
    public C(){
       this("hello");
        System.out.println("我是C类的无参构造器");

    }
    public C(String name){
        super("hahaha");
        System.out.println("我是C类的有参构造器");
    }
}