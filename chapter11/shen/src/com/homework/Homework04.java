package com.homework;

/**
 * @Author 申宇强
 * @Date 2023/12/17 16:20
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 8);//18.0
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 8);
    }
}

/*
1.计算器接口具有work方法，功能是运算，有一个手机类Cellphone，
   定义方法testWork测试计算功能，调用计算接口的work方法，
2.要求调用CellPhone对象 的testWork方法，使用上 匿名内部类

 */
//编写接口
interface ICalculate {
    public double work(double n1, double n2);
}

class Cellphone {
    public void testWork(ICalculate iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2);//动态绑定
        System.out.println("计算后的结果是=" + result);
    }
}


