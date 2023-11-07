package com.extend.improve_;

/**
 * @Author 申宇强
 * @Date 2023/4/22 9:37
 */
//父类 是Pupil 和graduate的父类
public class Student {
    //共用的属性
    public String name;
    public int age;
    private double score;

    //共用的方法
    public void setScore(double score) {
        this.score = score;
    }


    public void showInfo() {
        System.out.println("学生名" + name + "年龄" + age + "成绩" + score);
    }
}
