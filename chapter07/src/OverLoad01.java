public class OverLoad01 {
	public static void main(String[] args) {
		//System.out.println(100);
		//System.out.println("Hello Word!!");
		//System.out.println('h');
		//System.out.println(1.1);
		//System.out.println(true);
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1,2));
		System.out.println(mc.calculate(1.1,2));
		System.out.println(mc.calculate(1,2.1));
		System.out.println(mc.calculate(1,2,4));
	}
}
class MyCalculator {
	//下面的四个 calculate 方法构成了重载
	//两个整数的和
	public int calculate(int n1, int n2){
		System.out.println("calculate(int n1, int n2)被调用");
	 return n1 + n2;
	}
	//一个整数，一个 double 的和
	public double calculate(int n1, double n2) {
		System.out.println("calculate(int n1, double n2)被调用");
		return n1 + n2;
	}
	//一个 double ,一个 Int 和
	public double calculate(double n1, int n2) {
		return n1 + n2;
	}
	//三个 int 的和
	public int calculate(int n1, int n2,int n3) {
		return n1 + n2 + n3;
	}
}