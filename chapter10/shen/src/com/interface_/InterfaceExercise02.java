package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/8 16:54
 */
public class InterfaceExercise02 {
    public static void main(String[] args) {
        new C().pX();
    }
}

interface A1 {
    int x = 0;//想到 等价 public static final int x = 0;
}

class B1 {
    int x = 1;
}//普通属性

class C extends B1 implements A1 {
    public void pX() {
        //System.out.println(x); //错误，原因不明确x
        //可以明确的指定x
        //访问接口的 x 就使用 A.x
        //访问父类的 x 就使用 super.x
        System.out.println(A1.x + " " + super.x);
    }
}