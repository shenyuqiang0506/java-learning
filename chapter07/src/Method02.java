public class Method02 {
	public static void main(String[] args) {
		//请遍历一个数组 , 输出数组的各个元素值
		int [][] map =	{{0,0,1},{1,1,1},{1,1,3}};
		//使用方法完成输出,  创建 MyTools 对象
		MyTools tool = new MyTools();
		tool.printArr(map);
	}
}
class  MyTools{
	public void printArr(int[][] map){
		//对传入的map数组进行遍历
		for (int i = 0;i< map.length ; i++) {
			for (int j = 0;j< map[i].length;j++ ) {
			System.out.print(map[i][j]+ " ");
			}
			System.out.println();
		}
	}
}