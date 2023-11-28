package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/28 16:16
 */
public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组-> 接口类型数组
        usb[] usb = new usb[2];
        usb[0] = new Phone_();
        usb[1] = new Camera_();

        /*
        给Usb数组中，存放 Phone  和  相机对象，Phone类还有一个特有的方法call（），
        请遍历Usb数组，如果是Phone对象，除了调用Usb 接口定义的方法外，
        还需要调用Phone 特有方法 call
         */
        for (int i = 0; i < usb.length; i++) {
            usb[i].work();//动态绑定
            //和前面一样，我们仍然需要进行类型的向下转型
            if (usb[i] instanceof Phone_) {
                ((Phone_) usb[i]).call();
            }
        }
    }
}

interface usb {
    void work();
}

class Phone_ implements usb {
    public void call() {
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}

class Camera_ implements usb {
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}