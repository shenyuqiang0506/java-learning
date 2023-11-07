package com.static_;

/**
 * @Author 申宇强
 * @Date 2023/8/5 18:22
 * 统计学费的总和
 */
@SuppressWarnings({"all"})
public class StaticMethod {
    public static void main(String[] args) {
        //创建两个学生对象 交学费
        Student tom = new Student("tom");
//        tom.payFee(2000);
        Student.payFee(2000);
        Student shen = new Student("shen");
//        shen.payFee(3000);
        Student.payFee(3000);

        //输出学费
        Student.showFee();

        //如果我们希望不创建实例，也可以调用某个方法(即当做工具来使用)
        //这时，把方法做成静态方法时非常合适
        System.out.println("9开平方的结果是=" + Math.sqrt(9));
        System.out.println(MYTools.calSum(3, 4));
    }

}

//开发自己的工具类时，可以将方法做成静态的，方便调用
class MYTools {
    //求出两个数的和
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}

class Student {
    private String name;//普通成员
    //定义一个静态变量 来累计学生的学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    //1. 当方法使用了static修饰后，该方法就是静态方法
    //2. 静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Student.fee += fee;
    }

    public static void showFee() {
        System.out.println("总消费有" + Student.fee);
    }
}
