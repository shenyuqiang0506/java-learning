package com.poly;

/**
 * @Author 申宇强
 * @Date 2023/5/13 12:05
 */
public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("汤姆");
        Dog dog = new Dog("大黄~");
        Bone bone = new Bone("骨头~");
        tom.feed(dog,bone);

        Cat cat = new Cat("小花猫~");
        Fish fish = new Fish("黄花鱼~");
        System.out.println("===============");
        tom.feed(cat,fish);
        Pig pig = new Pig("小猪");
        Rice rice = new Rice("米饭");
        System.out.println("==================");
        tom.feed(pig,rice);
    }
}
