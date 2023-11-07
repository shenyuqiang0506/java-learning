package com.poly.polyparamete;

/**
 * @Author 申宇强
 * @Date 2023/5/17 15:12
 */
public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("普通员工 " + getName() + " is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
