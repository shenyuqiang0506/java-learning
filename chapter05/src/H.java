import java.util.Scanner;
public class H{
	 public static void main(String[] args) {
	 	Scanner myScanner = new Scanner(System.in);
	 	System.out.println("输入月份");
	 	int mouth = myScanner.nextInt();
	 	if (mouth>= 4 && mouth<= 10) {
	 		System.out.println("输入年龄");
	 		int age = myScanner.nextInt();
	 		if (age>=18 && age<=60) {
	 			System.out.println("价格为60元");
	 			
	 		}else if (age< 18 ) {
	 		System.out.println("价格为30元");	
	 		}else if (age> 60) {
	 		System.out.println("价格为20元");		
	 		}
	 		
	 	}else if(mouth<4 && mouth> 10){
			int age = 0;
			if (age >=18 && age <=60) {
	 			System.out.println("价格为60元");
	 			
	 		}else{
	 			System.out.println("价格为20元");
	 		}

	 	}
		
	}
}
