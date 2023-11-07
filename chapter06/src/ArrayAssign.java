public class ArrayAssign {
	public static void main(String[] args) {
		//基本数据类型,赋值为只拷贝
		int n1 = 10;
		int n2 = n1;

		n2 = 80;
		System.out.println("n1="+ n1);//10
        System.out.println("n2="+ n2);//80


        //数组:数组在默认情况下是引用传递，赋的值是地址。
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;//把 arr1 赋给 arr2
        arr2 [0] = 10;
 		//看arr1 的值
 		System.out.println("====arr1=====");
        for (int i = 0; i < arr1.length ;i++ ) {
        	System.out.println(arr1[i]);
        	
        }
	}
}