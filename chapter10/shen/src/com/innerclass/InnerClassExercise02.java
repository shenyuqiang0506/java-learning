package com.innerclass;

/**
 * @Author 申宇强
 * @Date 2023/12/11 16:39
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {
          /*
        1.有一个铃声接口Bell，里面有个ring方法。(右图)
        2.有一个手机类Cellphone，具有闹钟功能alarmClock，参数是Bell类型(右图)
        3.测试手机类的闹钟功能，通过匿名内部类(对象)作为参数，打印：懒猪起床了
        4.再传入另一个匿名内部类(对象)，打印：小伙伴上课了
         */
        CellPhone cellPhone = new CellPhone();
        //解读
        //1. 传递的是实现了 Bell接口的匿名内部类 InnerClassExercise02$1
        //2. 重写了 ring
        //3. Bell bell = new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("懒猪起床了");
        //            }
        //        }
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }

}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
        System.out.println(bell.getClass());
    }
}
