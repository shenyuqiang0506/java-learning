package com.homework;

/**
 * @Author 申宇强
 * @Date 2023/12/17 17:56
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

/*编一个类A，在类中定义局部内部类B，B中有一个私有final常量name，有一个方法show()打印常量name。进行测试
进阶：A中也定义一个私有的变量name，在show方法中打印测试
 */
class A {
    private String NAME = "Li";

    public void f1() {

        class B {
            private final String NAME = "Shen";

            public void show() {
                System.out.println(NAME + "外部" + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}