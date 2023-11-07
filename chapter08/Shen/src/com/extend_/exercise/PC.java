package com.extend_.exercise;

/**
 * @Author 申宇强
 * @Date 2023/5/12 15:14
 */
//继承 Computer 类，添加特有属性【品牌 brand】
public class PC extends Computer {
    private String brand;
    //这里 IDEA 根据继承的规则，自动把构造器的调用写好
    //这里也体现： 继承设计的基本思想，父类的构造器完成父类属性初始化
    //子类的构造器完成子类属性初始化
    public PC(String cup, int memory, int disk, String brand) {
        super(cup, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息=");
        //调用父类
        System.out.println(getDetails()+"brand="+brand);
    }
}
