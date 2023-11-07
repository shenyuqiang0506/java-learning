import java.util.Scanner;

/**
 * @Author 申宇强
 * @Date 2023/4/14 14:53
 */
public class ArrayTest {
    public static void main(String[] args) {
        MyTools mt = new MyTools();
        Scanner myScanner = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        MyTools myTools = new MyTools();

        int[] arr = {10, -1, 2, 0, 4};
        mt.bubble(arr);
        System.out.println("===排序后的arr===");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
    class Person{
        String name;
        int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }
}

class MyTools {
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
}
