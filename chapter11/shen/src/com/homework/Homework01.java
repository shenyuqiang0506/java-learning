package com.homework;

/**
 * @Author 申宇强
 * @Date 2023/12/17 16:09
 */
public class Homework01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(100);
        System.out.println(car);
        System.out.println(car1);
    }
}

class Car {
    double price = 10;
    static String color = "white";

    @Override
    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}
