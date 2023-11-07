public class BubbleSort {
	public static void main(String[] args) {
		/*下面我们举一个具体的案例来说明冒泡法。我们将五个无序：24,69,80,57,13
		 使用冒泡排序法将其排成一个从小到大的有 序数列。
		思路:数组 [24,69,80,57,13]
		第 1 轮排序: 目标把最大数放在最后 
		第 1 次比较[24,69,80,57,13]
		第 2 次比较[24,69,80,57,13]
		第 3 次比较[24,69,57,80,13]
		第 4 次比较[24,69,57,13,80]
		 */
		int[] arr = {24,69,80,57,99,13,110,-1,-99};
		int temp = 0;//辅助交换
		//外从循环包裹
		for (int i = 0;i< arr.length - 1 ;i++ ) {
			for (int j = 0 ;j < arr.length - 1 - i;j++ ) {
			if (arr[j]>arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		System.out.println("\n==第"+(i+1)+"轮排序后===");
		for(int j = 0;j< arr.length ;j++){
			System.out.print(arr[j] + "\t");
			}
		}
		// for (int j = 0 ;j < 4 ;j++ ) {
		// 	if (arr[j]>arr[j + 1]) {
		// 		temp = arr[j];
		// 		arr[j] = arr[j + 1];
		// 		arr[j + 1] = temp;
		// 	}
		// }
		// System.out.println("==第一轮排序后===");
		// for(int j = 0;j< arr.length ;j++){
		// 	System.out.print(arr[j] + "\t");
		// }
		// for (int j = 0 ;j < 3 ;j++ ) {
		// 	if (arr[j]>arr[j + 1]) {
		// 		temp = arr[j];
		// 		arr[j] = arr[j + 1];
		// 		arr[j + 1] = temp;
		// 	}
		// }
		// System.out.println("\n==第二轮排序后===");
		// for(int j = 0;j< arr.length ;j++){
		// 	System.out.print(arr[j] + "\t");
		// }
		// for (int j = 0 ;j < 2 ;j++ ) {
		// 	if (arr[j]>arr[j + 1]) {
		// 		temp = arr[j];
		// 		arr[j] = arr[j + 1];
		// 		arr[j + 1] = temp;
		// 	}
		// }
		// System.out.println("\n==第三轮排序后===");
		// for(int j = 0;j< arr.length ;j++){
		// 	System.out.print(arr[j] + "\t");
		// }
		// for (int j = 0 ;j < 1 ;j++ ) {
		// 	if (arr[j]>arr[j + 1]) {
		// 		temp = arr[j];
		// 		arr[j] = arr[j + 1];
		// 		arr[j + 1] = temp;
		// 	}
		// }
		// System.out.println("\n==第四轮排序后===");
		// for(int j = 0;j< arr.length ;j++){
		// 	System.out.print(arr[j] + "\t");
		// }
	}
}