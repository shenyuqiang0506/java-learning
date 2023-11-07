public class OverLoadExercise {
	public static void main(String[] args) {
		//在主类的 main ()方法中分别用参数区别调用三个方法 
		Methods method = new Methods();
		method.m(10);//100
		method.m(10,20);//200
		method.m("Hello Word!");//Hello Word!
		System.out.println("max");
		System.out.println(method.max(1,2));//
		System.out.println(method.max(1.9,2.2));//
		System.out.println(method.max(1.0,2.0,2.9));//
	}
}
class Methods{
	//分析
	//1  方法名 max
	//2  形参 (int,int)
	//3.int
	public int max(int n1, int n2) {
		return n1 > n2 ? n1:n2;
	}
	//分析
	//1  方法名 max
	//2  形参 (double,double)
	//3.double
	public double max(double n1, double n2) {
		return n1 > n2 ? n1:n2;
	}
	//分析
	//1  方法名 max
	//2  形参 (double,double,double)
	//3.double
	public double max(double n1, double n2, double n3) {
		//求出 n1 和	n2 的最大值 
		double max1 = n1 > n2 ? n1 : n2; 
		return max1 > n3 ? max1 : n3;

	}

	//分析
	//1  方法名 m
	//2  形参 (int)
	//3.void
	public void m(int n) {
		System.out.println("平方=" + (n * n));
	}
	//1  方法名 m
	//2  形参 (int, int)
	//3.void
	public void m(int n1, int n2) {
		System.out.println("相乘=" + (n1 * n2));
	}
	//1  方法名 m
	//2  形参 (String)
	//3.void
	public void m(String str) {
		System.out.println("传入的 str=" + str);
	}

}