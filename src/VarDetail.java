public class VarDetail {

	public static void main (String[] args) {
		//变量必须先声明,后使用,即有顺序
		int a = 50;
		System.out.println(a);//50
		//该区域的数据可以在同一类型范围内不断变化
		a = 88;
		//a = "jack"×
		System.out.println(a);//88

		//变量在同一个作用域不能重名
		//int a = 77; //错误

	}
}
class Dog {
	public static void main(String[] args) {
		int a = 666;//对
	}
}