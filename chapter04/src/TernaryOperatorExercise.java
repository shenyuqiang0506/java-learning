public class TernaryOperatorExercise {

public static void main(String[] args) {

	int n1 = 55;
	int n2 = 33;
	int n3 = 123;
	//思路
	//1.  先得到 n1  和 n2  中最大数 ,  保存到 max1
	//2.  然后再 求出 max1 和	n3 中的最大数，保存到 max2
	int max1 = n1 > n2 ? n1 : n2;
	int max2 = max1> n3 ? max1 : n3;
	System.out.println("最大数=" + max2 );


	// //一个语句实现
	// int max = (n1 > n2 ? n1 : n2)> n3 ? (n1 > n2 ? n1 : n2) : n3;
	// System.out.println("最大数=" + max);
 }
	}	
