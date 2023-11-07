package com.poly.dynamic;

/**
 * @Author 申宇强
 * @Date 2023/5/14 9:30
 */
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        //a 的编译类型 A, 运行类型 B
        System.out.println(a.sum());//40->30
        System.out.println(a.sum1());//30->20
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}
