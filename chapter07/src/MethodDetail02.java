public class MethodDetail02 {
	public static void main(String[] args) {
		A a = new A();
		a.sayOk();
		a.m1();
	}
}
class A{
	//同一个类中的方法调用: 直接调用即可。比如 print(参数) 
	//案例演示:A类 sayok 调用 print()
	public void print(int n){
		System.out.println("print()方法被调用 n=" + n );
	}
	public void sayOk(){//sayok 调用 print(直接调用即可)
		print(10);
		System.out.println("继续执行sayOK()~~~~~");
	}
	//跨类中的方法A类调用B类方法:需要通过对象名调用。比如 对象名方法名(参数)  
	//案例演示: B类 sayHello 调用 print0	
	public void m1(){
		System.out.println("m1方法被调用");
		//先创建B的对象
		B b = new B();
		b.hi();
		System.out.println("继续执行");
	}
}
class B{
		public void hi(){
			System.out.println("B 类中的 hi()被执行");
		}
	}