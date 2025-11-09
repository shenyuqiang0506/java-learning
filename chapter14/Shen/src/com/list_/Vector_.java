package com.list_;

import java.util.Vector;

@SuppressWarnings({"all"})
public class Vector_ {
    public static void main(String[] args) {
        //无参构造器
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector=" + vector);
        //1. new Vector() 底层
        /*
        public Vector() {
        this(10);
        }
        补充：如果是 Vector vector = new Vector(8);
        走的方法:
        public Vector(int initialCapacity) {
        this(initialCapacity, 0);
        }
    }

 */
    }
}
