public class ArrayDetail {
	public static void main(String[] args) {
		//数组是多个相同类型数据的组合，实现对这些数据的统一管理
		int [] arr1 = {1,23,4,5,67};
		double [] arr2 = {1.1,1.2,1.3,1.4,60.6,100};
		//数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
		String[] arr3 = {"北京","Jack","妹妹"};
		// 数组创建后，如果没有赋值，有默认值
		short[] arr4 = new short[3];
		for (int i = 0;i< arr4.length ;i++ ) {
			System.out.println(arr4[i]);
		}
		//使用数组的步骤 1.  声明数组并开辟空间 2  给数组各个元素赋值 3 使用数组
		//数组下标必须在指定范围内使用，否则报：下标越界异常，比如
		int [] arr5 = new int[5];
		System.out.println(arr5 [5]);
		// 数组属引用类型，数组型数据是对象(object)

	}
}