public class VarScope {
	public static void main(String[] args) {
		
	}
}
class Cat{
	//全局变量：也就是属性，作用域为整个类体 Cat 类：cry eat 等方法使用属性
	//属性在定义时，可以直接赋值 
	int age = 10; //指定的值是 10
	/*全局变量(属性)可以不赋值，直接使用，
	因为有默认值，局部变量必须赋值后才能使用，因为没有默认值
	*/
	//
	double weight;
	public void hi(){
		int num = 1;// 错误: 可能尚未初始化变量num
		System.out.println("num=" + num);
	}
	public void cry(){
	//1. 局部变量一般是指在成员方法中定义的变量
	//2. n 和	name 就是局部变量
	//3. n  和 name 的作用域在 cry 方法中
		int n = 10;
		String name = "xiaomi";
		System.out.println("在 cry 中使用属性 age=" + age);
	}
	public void eat(){
		System.out.println("在 eat 中使用属性 age=" + age);
		//System.out.println("在 eat 中使用cry属性 name=" + name);//错误
	}
}