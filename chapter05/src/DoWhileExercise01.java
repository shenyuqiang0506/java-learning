public class DoWhileExercise01 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do {
			System.out.println(i);
			sum += i;
			i++;
		}while(i <=100);
		
		System.out.println("sum=" + sum);
	}
}