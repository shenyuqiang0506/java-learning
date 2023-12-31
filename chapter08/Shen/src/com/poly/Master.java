package com.poly;

/**
 * @Author 申宇强
 * @Date 2023/5/13 12:08
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态机制,可以统一管理主人喂食物的问题
    //animal 编译类型是Animal ,可以指向(接受)Animal子类对象
    //food 编译类型为Food ,可以指向(接受)Food子类对象
    public void feed(Animal animal,Food food){
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
    }
//
//    //主人给小狗喂食:骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人" + name + "给" + dog.getName() + "吃" + bone.getName());
//    }
//
//    //主人给小猫喂食:黄花鱼
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人" + name + "给" + cat.getName() + "吃" + fish.getName());
//    }
    //如果动物很多,食物也很多
    //===> feed 方法很多,不利于管理和维护
    //Pig --> rice
    //Tiger --> meat
}
