package com.abstract_;

/**
 * @Author 申宇强
 * @Date 2023/9/7 15:17
 */
public class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "正在工作");
    }
}
