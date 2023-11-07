import java.util.Scanner;
public class IfExercise02 {

public static void main(String[] args) {

	//判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
//(1)年份能被 4 整除，但不能被 100 整除；(2)能被 400 整除
//
//思路分析
//1.  定义 int year 保存年
//2. 年份能被 4 整除，但不能被 100 整除,
//	=> year % 4 == 0 && year % 100 != 0
//3. 能被 400 整除 => year % 400 == 0
//4.  上面的 2 和	3  是 或的关系
//代码实现
Scanner myScanner = new Scanner(System.in);
System.out.println("请输入年份");
int year = myScanner.nextInt();
if( (year % 4 == 0 && year % 100 != 0) ||	year % 400 == 0 ) { 
	System.out.println(year + "  是 闰年");
} else {
	System.out.println(year + "  不是 闰年");
	}
}
	}
