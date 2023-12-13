package com.emun_;

/**
 * @Author 申宇强
 * @Date 2023/12/13 11:37
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week value : values) {
            System.out.println(value);
        }
    }
}

enum Week {
    //定义Week的枚举对象
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
