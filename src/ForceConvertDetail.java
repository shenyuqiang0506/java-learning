public class ForceConvertDetail {
	public static void main (String[] args) {
		//int x = (int)10 * 3.5 + 6 * 1.5;// 错误: 不兼容的类型: 
		                                  //从double转换到int可能会有损失
		int y = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(y);


	}
}