public class IfExercise01 {

public static void main(String[] args) {
	double d1 = 30.5;
	double d2 = 2.6;
	if (d1 > 10.0 && d2 < 20.0) {
		System.out.println("两个数的和=" + (d1 + d2));
		
	}else{
		System.out.println("两个数的差=" + (d1 - d2));
	}
	int num1 = 1;
	int num2 = 10;
	int sum = num1 +num2;
	if(sum % 3 == 0 && sum % 5 == 0) {
 		System.out.println("和可以被 3 又能被 5 整除");
	} else {
	System.out.println("和不能被 3 和 5 整除..");
}
}
}
