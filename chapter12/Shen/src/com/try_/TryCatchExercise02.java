package com.try_;

/**
 * @Author 申宇强
 * @Date 2023/12/25 15:18
 */
public class TryCatchExercise02 {
}

class Exception02 {
    public static int method() {
        int i = 1;
        try {
            i++; //i = 2
            String[] names = new String[3];
            if (names[1].equals("tom")) {//空指针
                System.out.println(names[1]);
            } else {
                names[3] = "shen";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i; //i = 3
        } finally {//必须执行
            return ++i; //i = 4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}