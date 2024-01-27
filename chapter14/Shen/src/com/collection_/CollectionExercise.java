package com.collection_;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/1/27 20:04
 */
@SuppressWarnings({"all"})
public class CollectionExercise {
    /**
     * 创建  3个 Dog {name, age}  对象，放入到 ArrayList 中，赋给 List 引用
     * 用迭代器和增强for循环两种方式来遍历
     * 重写Dog 的toString方法， 输出name和age
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小黑", 3));
        list.add(new Dog("大黄", 100));
        list.add(new Dog("大壮", 8));
        for (Object dog : list) {
            System.out.println("dog=" + dog);
        }
        //使用迭代器
        System.out.println("===使用迭代器来遍历===");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog=" + dog);

        }
    }
}

class Dog {
    @Getter
    @Setter
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}