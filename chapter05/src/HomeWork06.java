public class HomeWork06 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1;i<= 1000000 ;i++ ) {
			if (i % 5 != 0) {
				count++;
				System.out.print(i + "\t");
				if (count % 5 == 0) {
					System.out.println();
				}
			}
			
		}
	}
}