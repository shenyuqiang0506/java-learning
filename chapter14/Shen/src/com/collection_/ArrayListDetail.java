package com.collection_;

import java.util.ArrayList;

/**
 * @Author 申宇强
 * @Date 2024/1/27 20:10
 */
@SuppressWarnings({"all"})
public class ArrayListDetail {
    public static void main(String[] args) {
        //ArrayList 是线程不安全的, 可以看源码 没有 synchronized
        /*
            public boolean add(E e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        arrayList.add("shen");
        System.out.println(arrayList);
    }
}
