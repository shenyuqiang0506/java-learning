package com.static_;

/**
 * @Author 申宇强
 * @Date 2023/8/7 15:58
 */
@SuppressWarnings({"all"})
public class StaticExercise01 {
}

class Test {
    static int count = 9;

    public void count() {
        System.out.println("count=" + count++);
    }
    public static void main(String args[]){
        new Test().count();//9
        new Test().count();//10
        System.out.println(Test.count);//11
    }
}