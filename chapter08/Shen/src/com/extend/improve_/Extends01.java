package com.extend.improve_;

import com.extend.Graduate;
import com.extend.Pupil;

/**
 * @Author 申宇强
 * @Date 2023/4/22 9:45
 */
public class Extends01 {
    public static void main(String[] args) {
        com.extend.Pupil pupil = new Pupil();
        pupil.name = "xiaomi~";
        pupil.age = 13;
        pupil.testing();
        pupil.setScore(100);
        pupil.showInfo();

        System.out.println("========");
        com.extend.Graduate graduate = new Graduate();
        graduate.name = "申宇强~";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(150);
        graduate.showInfo();
    }
}
