package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/7 15:37
 */
//Phone 类 实现 UsbInterface
//解读1. 即 Phone类需要实现 UsbInterface接口 规定/声明的方法
public class Phone implements Usb {
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
