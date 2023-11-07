package com.single_;

/**
 * @Author 申宇强
 * @Date 2023/8/16 14:31
 * 演示懒汉式单例模式
 */
@SuppressWarnings({"all"})
public class SingleTon02 {
    public static void main(String[] args) {
        //System.out.println(Cat.n1);
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);


        //再次調用getInstance
        Cat cat2 = Cat.getInstance();
        System.out.println(cat2);

        System.out.println(cat1==cat2);
    }
}

//希望在程序運行過程中,只能創建一個Cat對象
//使用單例模式
class Cat {
    private String name;
    public static int n1= 999;
    private static Cat cat;

    //步驟
    //1.仍然構造器私有化
    //2.定义一个static静态属性对象
    //3.提供一個public的static方法，可以返回一個Cat對象
    //4.懶漢式，只有當用戶使用getInstance時，才返回cat對象, 後面再次調用時，會返回上次創建的cat對象
    //  從而保證了單例

    private Cat(String name) {
        System.out.println("构造器调用...");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}