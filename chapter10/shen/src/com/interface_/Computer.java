package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/7 15:39
 */
public class Computer {
    //编写一个方法
    //解读:
    //1. UsbInterface usbInterface 形参是接口类型 UsbInterface
    //2. 看到 接收 实现了 UsbInterface接口的类的对象实例
    public void work(Usb usb) {
        usb.start();
        usb.stop();
    }
}
