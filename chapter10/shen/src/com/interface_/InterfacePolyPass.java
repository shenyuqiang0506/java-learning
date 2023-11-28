package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/28 16:26
 */

/**
 * 演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        Li li = new teacher();
        //如果IG 继承了 IH 接口，而Teacher 类实现了 IG接口
        //那么，实际上就相当于 Teacher 类也实现了 IH接口.
        //这就是所谓的 接口多态传递现象.
        Shen shen = new teacher();
    }
}

interface Shen {
    void Hi();
}

interface Li extends Shen {
}

class teacher implements Li {

    @Override
    public void Hi() {
        System.out.println("你好");
    }
}