package com.extend;

/**
 * @Author 申宇强
 * @Date 2023/4/22 9:00
 */
//小学生>-模拟小学生考试
public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {
        System.out.println("小学生" + name + "正在考小学数学");
    }

    public void showInfo() {
        System.out.println("小学生名" + name + "年龄" + age + "成绩" + score);
    }
}
