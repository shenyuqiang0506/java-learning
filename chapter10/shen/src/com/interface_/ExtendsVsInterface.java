package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/28 15:56
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        littleMonkey littleMonkey = new littleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.flying();
        littleMonkey.swimming();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }
}

//继承
//小结:  当子类继承了父类，就自动地拥有父类的功能
//      如果子类需要扩展功能，可以通过实现接口的方式扩展.
//      可以理解 实现接口 是 对java 单继承机制的一种补充.
class littleMonkey extends Monkey implements Fishable, Birdable {

    public littleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学习，可以像鱼儿一样游泳...");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " 通过学习，可以像鸟儿一样飞翔...");
    }
}


//接口
interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}