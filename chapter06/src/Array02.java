import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
	//double[] scores = new double [5]; 第一种方法
		double scores[];//第二张方法
		scores = new double[5];
	Scanner myScanner = new Scanner(System.in);
	for (int i = 0; i < scores.length; i++ ) {
		System.out.println("输入"+(i+1)+"个元素的值");
		scores[i] = myScanner.nextDouble();	
		}
		System.out.println("==============");	
		for (int i = 0;i < scores.length ;i++ ) {
	System.out.println("输入"+(i+1)+"个元素的值=" + scores[i]);
		}
	}
}