package com.final_;

/**
 * @Author 申宇强
 * @Date 2023/8/20 15:05
 */
public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
        //包装类,String 是final类，不能被继承
    }
}

//final 和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
class BBB{
    public final static int num = 10000;
    static {
        System.out.println("BBB静态代码块");
    }
}

final class AAA{
    //一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法
    //public final void cry() {}
}