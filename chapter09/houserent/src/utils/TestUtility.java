package utils;

/**
 * @Author 申宇强
 * @Date 2023/7/29 2:13
 */
public class TestUtility {
    public static void main(String[] args) {
        //测试类 使用完毕可以删除
        //要求输入一个字符串，长度最大为3
//        String s = Utility.readString(3);
//        System.out.println("s=" + s);

        //要求输入一个字符串，长度最大为10, 如果用户直接回车，就给一个默认值
        //老师提示：就把该方法当做一个api使用即可
        //"shen"
        System.out.println("请输入字符串:");
        String s2 = Utility.readString(10, "shen");
        System.out.println("s2=" + s2);


        //解释一个问题
        //这里老师是直接使用 类.方法() => 因为当一个方法是static时，就是一个静态方法
        //注意：静态方法可以直接通过类名调用. => 具体细节后面在说.

        A.cry();
    }
}

class A {
    public void hi() {

    }

    public static void cry() {

    }
}

