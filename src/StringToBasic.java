public class StringToBasic {
	public static void main (String[] args) {
		//基本数据类型->String
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
	System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
	//String->基本数据类型
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long  num4 = Long.parseLong(s5);
		Byte  num5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);

		System.out.println("=================");
		System.out.println(num1);//123
		System.out.println(num2);//123.0
		System.out.println(num3);//123.0
		System.out.println(num5);//123
		System.out.println(num6);//123
		System.out.println(num6);//123
		System.out.println(b);//ture



	}
}