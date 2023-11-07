public class DoWhile01 {
	public static void main(String[] args) {
		int i = 1;//循环变量初始化
		do {
			//循环执行语句
			System.out.println("Hello Wolrd!" + i);
			//变量迭代
			i++;
		}while(i <= 10);
		System.out.println("退出do...while" + i);
	}
}