package com.string_;

/**
 * @Author 申宇强
 * @Date 2024/1/9 12:02
 */
public class StringExercise07 {
    public static void main(String[] args) {

    }
}

class Test1 {
    String str = new String("shen");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 's';
    }

    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }
}