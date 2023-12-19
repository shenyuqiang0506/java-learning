package com.exception_;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author 申宇强
 * @Date 2023/12/19 15:51
 */
public class Exception02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis;
            fis = new FileInputStream("d:\\aa.jpg");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

