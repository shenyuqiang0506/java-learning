public class FloatDetail {

	public static void main (String[] args) {

     //Java 的浮点型常量默认为double型，声明float型常量，须后加'f'或'F'
		//float num1 = 1.1; //对不对;错误
		float num2 = 1.1F; //对
		double num3 = 1.1; //对
		double nmu4 = 1.1f;//对
		System.out.println(num2);
		//浮点数使用陷阱: 2.7 和 8.1 /3 比较
		//看看一段代码
		double num5 = 2.7;
		double num6 = 8.1 / 3; //2.7
		double num7 = 8.1 * 3;
		System.out.println(num5);//2.7
		System.out.println(num6);//接近2.7一个小数,不是2.7
		System.out.println(num7);
		//得到一个重要的使用点: 当我们对运算结果是小数的进行相等判断是，要小心
		//应该是以两个数的差值的绝对值,在某个精度范围类判断
		if( num5 == num6){
			System.out.println("相等");
			//正确的写法
			// if(Math.abs(num5 - num6))
			System.out.println(Math.abs(num5 - num6));
			//细节:如果是直接查询得的的小数或者直接赋值，是可以判断相等
		}
		

}
	}