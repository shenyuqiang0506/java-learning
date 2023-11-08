package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/8 16:51
 */
public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(AA.a);
        System.out.println(B.a);
    }
}

interface AA {
    int a = 23;//等价 public static final int a = 23;
}

class B implements AA {

}