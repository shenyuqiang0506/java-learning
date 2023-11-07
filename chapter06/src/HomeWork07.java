public class HomeWork07  {
	public static void main(String[] args) {
		//冒泡排序
		int[] arr = {20,1,33,44,5555,6};
		int temp = 0;//辅助交换
		for (int i = 0;i <arr.length-1 ;i++ ) {//外层循环
			for (int j = 0; j< arr.length-1-i ;j++ ) {//每轮的比较次数
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("======排序后的=====");
		for (int i = 0; i< arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
	}
}