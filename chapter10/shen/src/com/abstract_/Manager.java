package com.abstract_;

/**
 * @Author 申宇强
 * @Date 2023/9/7 15:10
 */
public class Manager extends Employee {
    public double bonus;

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "正在工作");
    }
}
