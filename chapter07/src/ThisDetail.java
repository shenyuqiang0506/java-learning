public class ThisDetail {
	public static void main(String[] args) {
		//T t1 = new T();
		//t1.f2();
		T t2 = new T();
	}
}
class T {
	String name = "jack";
	int num = 100;
	/* 访问构造器语法：this(参数列表);  
	注意只能在构造器中使用(即只能在构造器中访问另外一个构造器, 
	 必须放在第一条语句)
	*/
	public T(){
		//去访问T(String name, int age);
		this("jack",100);
		System.out.println("T() 构造器");
		
	}
	public T(String name, int age){
		System.out.println("T(String name, int age)构造器");
	}
	// this 关键字可以用来访问本类的属性、方法、构造器
	public void f3(){
		System.out.println("name=" + name + "num=" + num);
		//也可以用this访问
		System.out.println("name=" + this.name + "num=" + this.num);
	}
	//访问成员方法的语法：this.方法名(参数列表);
	public void f1() {
		System.out.println("f1()被调用");
	}
	public void f2() {
		System.out.println("f2()被调用");
		//调用本类的f1
		//1.
		f1();
		//2.
		this.f1();
	}
}
