package com.exercise;

/**
 * @Author 申宇强
 * @Date 2023/4/24 9:49
 */
public class ExtendsExercise02 {
    public static void main(String[] args) {
        CC cc = new CC();
    }
}

class AA {
    public AA() {
        System.out.println("我是AA类");
    }
}

class BB extends AA {
    public BB() {
        System.out.println("我是 BB 类的无参构造");
    }

    public BB(String name) {
        System.out.println(name + "我是 BB 类的有参构造");
    }

}

class CC extends BB {    //C 类，继承 B 类
    public CC() {
        this("hello");
        System.out.println("我是 CC 类的无参构造");
    }

    public CC(String name) {
        super("hahah");
        System.out.println("我是 CC类的有参构造");
    }
}
