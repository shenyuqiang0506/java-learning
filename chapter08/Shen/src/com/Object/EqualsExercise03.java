package com.Object;
import java.sql.Date;

/**
 * @Author 申宇强
 * @Date 2023/5/17 16:54
 */
public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("是否相等" + (it == fl));//t
        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("(it==ch1)" + (it == ch1));//t
        System.out.println("(12==ch2)" + (12 == ch2));//t
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);//f
        System.out.println(str1.equals(str2));//t
    }
}
