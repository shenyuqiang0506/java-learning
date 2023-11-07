package com.encap;

/*
 * 创建程序,在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性。
 * Account 类要求具有属性：姓名（长度为 2 位 3 位或 4 位）、余额(必须>20)、
 *  密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
 *	通过 setXxx 的方法给 Account 的属性赋值。
 *	在 AccountTest 中测试
 */

/**
 * @Author 申宇强
 * @Date 2023/4/20 15:30
 */
public class Account {
    public static void main(String[] args) {

    }

    //为了封装,将3个属性为私有
    private String name;
    private double balance;
    private String pwd;
    //提供构造器


    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    //姓名（长度为 2 位 3 位或 4 位)
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名（长度为 2 位 3 位或 4 位)");
            this.name = null;
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额(必须>20)");
            this.balance = 0;
        }

    }

    public String getPwd() {
        return pwd;
    }

    //密码（必须是六位）
    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码（必须是六位）默认为000000");
            this.pwd = "000000";
        }

    }

    //可以显示账号信息
    public void showInfo() {
        //可以增加一个权限的效验
        System.out.println("账号信息 姓名=" + name + "余额=" + balance + "密码=" + pwd);
//        if () {
//            System.out.println("账号信息 姓名=" + name + "余额=" + balance + "密码=" + pwd);
//        }else {
//            System.out.println("无权限");
//        }
    }
}
