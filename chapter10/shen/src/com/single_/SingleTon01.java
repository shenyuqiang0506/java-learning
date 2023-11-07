package com.single_;

/**
 * @Author 申宇强
 * @Date 2023/8/16 14:31
 */
@SuppressWarnings({"all"})
public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend girlFriend1 = new GirlFriend("小红");
//        GirlFriend girlFriend2 = new GirlFriend("小花");
        //通过方法可以获取对象
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);

        System.out.println(instance1==instance2);
        System.out.println(GirlFriend.n1);
    }
}

//有一个类， GirlFriend
//只能有一个女朋友
class GirlFriend {
    private String name;
    public static int n1= 100;
    //为了能够在静态方法中，返回 girlFriend对象，需要将其修饰为static
    private static GirlFriend girlFriend = new GirlFriend("李文静");

    //如何保障我们只能创建一个 GirlFriend 对象
    //步骤[单例模式-饿汉式]
    //1. 将构造器私有化
    //2. 在类的内部直接创建对象(该对象是static)
    //3. 提供一个公共的static方法，返回 gf对象
    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
