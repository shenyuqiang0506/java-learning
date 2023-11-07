package com.abstract_;

/**
 * @Author 申宇强
 * @Date 2023/9/7 15:00
 */
public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager shen = new Manager("申宇强", 1, 10000);
        shen.setBonus(8000);
        shen.work();

        CommonEmployee tom = new CommonEmployee("tom", 2, 5000);
        tom.work();
    }
}
