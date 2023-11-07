package com.static_;

/**
 * @Author 申宇强
 * @Date 2023/8/5 13:44
 */
@SuppressWarnings({"all"})
public class ChildGame {
    public static void main(String[] args) {
        //定义一个变量进行统计
        int count = 0;
        Child child1 = new Child("申宇强");
        child1.join();
//        count++;
        child1.count++;
        Child child2 = new Child("李文静");
        child2.join();
//        count++;
        child2.count++;
        Child child3 = new Child("黄浩");
        child3.join();
//        count++;
        child3.count++;
        //===========
        //类变量，可以通过类名来访问
        System.out.println("共有" + Child.count + "加入游戏:)~");
        System.out.println("child1.count=" + child1.count);//3
        System.out.println("child2.count=" + child2.count);//3
        System.out.println("child3.count=" + child3.count);//3
    }
}

class Child {
    private String name;
    //定义一个变量 count ,是一个类变量(静态变量) static 静态
    //该变量最大的特点就是会被Child 类的所有的对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入游戏");
    }
}
