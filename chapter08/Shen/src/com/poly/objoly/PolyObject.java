package com.poly.objoly;

/**
 * @Author 申宇强
 * @Date 2023/5/13 12:40
 */
public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态特点
        Animal animal1 = new Animal();
        animal1.cry();
        //animal 编译类型就是 Animal , 运行类型 Dog
        Animal animal = new Dog();
        //因为运行时 , 执行到改行时，animal运行类型是Dog,所以cry就是Dog的cry
        animal.cry(); //小狗汪汪叫

        //animal 编译类型 Animal,运行类型就是 Cat
        animal = new Cat();
        animal.cry(); //小猫喵喵叫
    }
}

