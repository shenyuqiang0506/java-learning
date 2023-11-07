public class ArithmeticOperatorExercise02 {
	public static void main(String[] args) {
		//假如还有59天就放假,合多少个星期多少天
		//分析
		//代码
		//使用int变量
		//一个星期7天,多少天 days % 7
		int days = 5900000;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天 合" + weeks  + "星期零" + 
			leftdays + "天");

		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为
		// :5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度
		//分析
		//代码
		Double huashi = 234.6;
		Double sheshi = 5.0 / 9 * (huashi - 100);
		System.out.println("华氏温度" + huashi + "对应的摄氏温度=" + sheshi );



	}
}