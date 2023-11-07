package com.poly.polyarr;

/**
 * @Author 申宇强
 * @Date 2023/5/17 14:45
 */
public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //重写父类的say方法
    @Override
    public String say() {
        return "老师 " + super.say() + "salary=" + salary;
    }

    //特有的方法
    public void teach() {
        System.out.println("老师是" + getName() + "正在讲课....");
    }
}
