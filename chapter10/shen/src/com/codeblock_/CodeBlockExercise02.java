package com.codeblock_;

/**
 * @Author 申宇强
 * @Date 2023/8/16 14:16
 */
@SuppressWarnings({"all"})
public class CodeBlockExercise02 {
    Sample sam1 = new Sample("sam1成员初始化");//
    static Sample sam = new Sample("静态成员sam初始化 ");//

    static {
        System.out.println("static块执行");//
        if (sam == null) System.out.println("sam is null");
    }

    CodeBlockExercise02()//构造器
    {
        System.out.println("Test默认构造函数被调用");//
    }

    public static void main(String[] args) {
        {
            CodeBlockExercise02 codeBlockExercise02 = new CodeBlockExercise02();//无参构造器
        }
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample默认构造函数被调用");
    }
}
