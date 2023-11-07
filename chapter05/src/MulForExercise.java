import java.util.Scanner;
public class MulForExercise{
	public static void main(String[] args) {
		//统计 3 个班成绩情况，每个班有 5 名同学，
		//求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
		//先计算一个班 , 5 个学生的成绩和平均分 ,  使用 for，
		//1.1创建 Scanner 对象然后，接收用户输入
		//1.2 得到该班级的平均分 , 定义一个 doubel sum把该班级5个学生的成绩累积
		//(2) 统计 3 个班(每个班 5 个学生) 平均分
		//(3) 所有班级的平均分
		//3.1  定义一个变量，double totalScore 累积所有学生的成绩
		//3.2  当多重循环结束后，totalScore / (3 * 5)
		//(4) 统计三个班及格人数
		//4.1  定义变量 int passNum = 0;  当有一个学生成绩>=60, passNum++
		//4.2  如果 >= 60 passNum++


		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		int passNum = 0;
		for (int i = 1;i<= 3 ;i++ ) {
			
				double sum = 0; //一个班级的总分
			for (int j = 1;j<= 5 ;j++ ) {
				System.out.println("请输入第"+ i +"个班的第"+ j +"个学生的成绩");
				double score = myScanner.nextDouble();
				if (score >=60) {
					passNum++;
				}
				sum += score;//累计
				System.out.println("成绩为" + score);
			
			}
		System.out.println("sum=" + sum + "平均分" + (sum / 5));
		totalScore += sum;
		}
     	 System.out.println("三个班总分="+ totalScore+"平均分" + totalScore/ 15);
	}
}