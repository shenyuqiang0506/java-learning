public class Array01 {
	public static void main(String[] args) {
		//一个养鸡场有 6 只鸡，它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。
		//请问这六只鸡的总体重是多少?平 均体重是多少?  
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;
		// double totalweight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6 ;
		// double avgweight = totalweight / 6;
		// System.out.println("总体重="+ totalweight + "平均=" + avgweight);
		//利用数组
		double[] hens = {3, 5, 1, 3.4, 2, 50 ,7.8};
		//遍历数组 得到数组的所有元素的和 , 使用for循环
		double totalweight = 0;
		for (int i = 0; i < hens.length;i++ ) {
			System.out.println("第"+ (i+1) +"个元素的值" + hens[i]);
			totalweight += hens[i];
		}
		System.out.println("总体重="+ totalweight + "平均=" + 
			(totalweight / hens.length));
	}
}