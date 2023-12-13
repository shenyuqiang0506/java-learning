package com.emun_;

/**
 * @Author 申宇强
 * @Date 2023/12/13 11:11
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;
        //本质就是调用 Gender2 的父类Enum的 toString()
//        public String toString() {
//            return name;
//        }
        System.out.println(boy);
        System.out.println(boy2 == boy);
    }
}

enum Gender {
    BOY, GIRL;
}
