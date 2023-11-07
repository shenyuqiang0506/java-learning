public class RelationalOperator {
	public static void main(String[] args) {
		int a = 9;//开发中不可以用a b n1 n2....
		int b = 8;
		System.out.println(a > b);//t
		System.out.println(a >= b);//t
		System.out.println(a <= b);//f
		System.out.println(a < b);//f
		System.out.println(a == b);//f
		System.out.println(a != b);//t
		boolean flag = a > b;
		System.out.println("flag=" + flag);
	}
}