package com.extend;

import com.extend.Base;

/**
 * @Author 申宇强
 * @Date 2023/4/22 10:00
 */
public class Sub extends Base {
    public Sub(String name, int age) {
    //1.调用父类的无参构造器
    // 2.调用父类的Base (String name)

        //super();//父类的无参构造器
       // super("shen");
        //调用父类的Base (String name,int age)
        super("jack",19);
        System.out.println("子类Sub(String name, int age)被调用...");
    }

    public Sub() {//构造器
        //super();//会默认调用父类的无参构造器
        super("xiaomi",10);
        System.out.println("子类Sub()...");
    }
    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        super("tom",10);
        //do nothing...
        System.out.println("子类Sub(String name)被调用...");
    }

    public void sayOk() {//方法
        //非私有的属性和方法可以在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3 );
        test100();
        test200();
        test300();
        //test400();错误
        //要通过父类提供的共用的方法去调用n4
        System.out.println("n4=" + getN4());
        callTest400();//
    }
}
