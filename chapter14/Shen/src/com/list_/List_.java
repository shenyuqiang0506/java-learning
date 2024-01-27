package com.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 申宇强
 * @Date 2024/1/27 20:12
 */
@SuppressWarnings({"all"})
public class List_ {
    public static void main(String[] args) {
        //1. List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("shen");
        list.add("tom");
        System.out.println("list=" + list);

        //2. List集合中的每个元素都有其对应的顺序索引，即支持索引
        //   索引是从0开始的
        System.out.println(list.get(3));
    }
}
