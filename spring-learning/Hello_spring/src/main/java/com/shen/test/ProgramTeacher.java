package com.shen.test;

/**
 * @Author 申宇强
 * @Date 2024/2/5 16:25
 */
public class ProgramTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("我是编程老师，我教你学Golang！");
    }
}
