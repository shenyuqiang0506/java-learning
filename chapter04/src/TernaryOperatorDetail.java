public class TernaryOperatorDetail {

public static void main(String[] args) {

		int a = 3;
		int b = 8;
		int c = a > b ? a : b;
		double d = a > b ? a : b + 3;//可以的，满足 int -> double
}
	}