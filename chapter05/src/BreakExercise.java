public class BreakExercise  {
	public static void main(String[] args) {
		//1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
		//1.先循环1-100 求和 sum
		//2.sum大于20时,记录当前数,然后break
		//3.在for循环外面定义一个n,然后把i>=n
		int n = 0;
		int sum = 0;
		for (int i = 1; i<= 100 ;i++ ) {
			sum += i;//累积
			if (sum >20) {
				System.out.println("和>20 时候 当前数 i=" + i);
				n = i;
					break;				
			}
		}
		System.out.println("当前数=" + n);
	}
	
}