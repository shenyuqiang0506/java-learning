package com.codeblock_;

/**
 * @Author 申宇强
 * @Date 2023/8/7 17:26
 */
@SuppressWarnings({"all"})
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}
//(1)AAA的普通代码块(2)AAA() 构造器被调用(3)BBB的普通代码块(4)BBB() 构造器被调用
class AAA {//父类Object

    {
        System.out.println("AAA的普通代码块");
    }

    public AAA() {
        //(1)super()
        //(2)调用本类的普通代码块
        System.out.println("AAA() 构造器被调用....");
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB的普通代码块...");
    }

    public BBB() {
        //(1)super()
        //(2)调用本类的普通代码块
        System.out.println("BBB() 构造器被调用....");
    }
}
