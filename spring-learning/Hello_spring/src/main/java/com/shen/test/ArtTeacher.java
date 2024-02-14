package com.shen.test;

/**
 * @Author 申宇强
 * @Date 2024/2/5 16:25
 */
public class ArtTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("我是美术老师，我教你画画！");
    }
}
