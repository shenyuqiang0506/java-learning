public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		/*请用二维数组输出如下图形
			0 0 0 0 0 0
			0 0 1 0 0 0
			0 2 0 3 0 0
			0 0 0 0 0 0
		*/
	int [][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},
					{0,2,0,3,0,0},{0,0,0,0,0,0}};
				//(1)	
					System.out.println("二维数组的个数="+ arr.length);
				//(2)二维数组的每个元素是一维数组, 所以如果需要得到每个一维数组的值
				//需要再次遍历
				//(3)如果我们要访问第 (i+1)个一维数组的第 j+1 个值 arr[i][j];
				//举例 访问 3, =》 他是第 3 个一维数组的第 4 个值 arr[2][3]
					System.out.println("第3个一维数组的第4个值=" + arr[2][3]);
		for (int i = 0;i <arr.length ;i++ ) {//遍历二维数组的每个元素
		//遍历二维数组的每个元素(数组)
		//老韩解读
		//1. arr[i] 表示 二维数组的第 i+1 个元素 比如 arr[0]：二维数组的第一个元素
		//2. arr[i].length  得到 对应的 每个一维数组的长度
			for (int j = 0;j < arr[i].length ;j++ ) {
				System.out.print(arr[i][j]+"\t");
			}	
			System.out.println( );
		}
	}
}
