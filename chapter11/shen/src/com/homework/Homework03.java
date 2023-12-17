package com.homework;

/**
 * @Author 申宇强
 * @Date 2023/12/17 16:13
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        dog.shout();
        cat.shout();
    }
}

/*
按要求实现下列问题：
动物类Animal包含了抽象方法  shout()；
Cat类继承了Animal，并实现方法shout，打印“猫会喵喵叫”
Dog类继承了Animal，并实现方法shout，打印“狗会汪汪叫”
在测试类中实例化对象Animal cat =new  Cat(),并调用cat的shout方法
在测试类中实例化对象Animal dog=new  Dog(),并调用dog的shout方法

 */
abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}