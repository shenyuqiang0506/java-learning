public class Constructor01 {
	public static void main(String[] args) {
		//当我们 new 一个对象时，直接通过构造器指定名字和年龄
		Penson01 p1 = new Penson01("xiaomi",13);
		System.out.println("p1 的信息如下"); 
		System.out.println("p1 对象 name=" + p1.name);//xiaomi
		System.out.println("p1 对象 age=" + p1.age);//13
	}
}
//在创建人类的对象时，就直接指定这个对象的年龄和姓名
class Penson01 {
	String name; 
	int age;
	//构造器
	//1.  构造器没有返回值,  也不能写 void
	//2. 构造器的名称和类 Person 一样
	//3. (String pName, int pAge) 是构造器形参列表，规则和成员方法一样

	public Penson01(String pName, int pAge){
		System.out.println("构造器被调用:)完成对象的属性初始化");
		name = pName;
		age = pAge;
	}
}