public class YangHui{
	public static void main(String[] args) {
		int[][] yangangHui = new int[12][];
		for (int i = 0;i <yangangHui.length ; i++) {//遍历 yangHui 的每个元素
			//给每个一维数组(行) 开空间
			yangangHui[i] = new int[i+1];
			//给每个一维数组(行) 赋值
			for (int j = 0;j<yangangHui[i].length ;j++ ) {
				//每一行的第一个元素和最后一个元素都是 1 
				if (j==0|| j==yangangHui[i].length-1) {
					yangangHui[i][j] = 1;
				}else{//中间的元素
					yangangHui[i][j] = yangangHui[i-1][j] + yangangHui[i-1][j-1];
				}									
			}
		}
		//输出杨辉三角
		for (int[] ints : yangangHui) {
			for (int anInt : ints) {
				System.out.print(anInt + "\t");
			}
			System.out.println();//换行.
		}
	}
}