package com.poly.polyarr;

/**
 * @Author 申宇强
 * @Date 2023/5/17 14:45
 */
public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //重写父类的say方法

    @Override
    public String say() {
        return "学生 " + super.say() + "score=" + score;
    }

    //特有的方法
    public void study() {
        System.out.println("学生" + getName() + "学习ing");
    }
}
