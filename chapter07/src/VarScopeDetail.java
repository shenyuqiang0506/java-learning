public class VarScopeDetail {
	public static void main(String[] args) {
		Penson01 p1 = new Penson01();
		/*属性生命周期较长伴随着对象的创建而创建，伴随着对象的死亡而死亡。
		局部变量，生命周期较短，伴随着它的代码块的执行而创建，
		伴随着代码块的结束而死亡即在一次方法调用过程中
		*/
		p1.say();//p1.say();//当执行 say 方法时，say 方法的局部变量比如 name,会创建，当 say 执行完毕后
		//name 局部变量就销毁,但是属性(全局变量)仍然可以使用
		T t1 = new T();
		t1.test();//第 1 种跨类访问对象属性的方式
		t1.test2(p1);//第 2 种跨类访问对象属性的方式

	}
}
class T {
	//全局变量/属性：可以被本类使用，或其他类使用（通过对象调用) 
	public void test() {
		Penson01 p1= new Penson01();
		System.out.println(p1.name);
	}
	public void test2(Penson01 p) {
		System.out.println(p.name);
	}
}
class Penson{
	//细节:  属性可以加修饰符(public protected private..)
	//局部变量不能加
	private int age = 20;
	String name = "xiaomi";

	public void say(){
		//细节
		//属性和局部变量可以重名，访问时遵循就近原则
		 String name = "shen";
		System.out.println("say方法中name=" + name);
	}
	public void hi(){
		//在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名
		String address = "安徽";
		//String address = "福建";// 错误: 已在方法 hi()中定义了变量 address
		String name = "xiaomi";//可以

	}
}