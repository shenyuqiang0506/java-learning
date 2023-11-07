public class This01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("xiaomi",3);
		dog1.info();
		Dog dog2 = new Dog("xxx", 2);
		dog2.info();
	}
}
class Dog {//类
	String name;
	int age;
	//public Dog(String dName, int dAge){//构造器
		//name = dName;
		//age = dAge;
	//}
	//如果我们构造器的形参，能够直接写成属性名，就更好了
	//但是出现了一个问题，根据变量的作用域原则
	//构造器的 name 是局部变量，而不是属性
	//构造器的 age 是局部变量，而不是属性
	//==> 引出 this 关键字来解决
	public Dog(String name, int age){//构造器
		//this.name 就是当前对象的属性 name 
		this.name = name;
		//this.age  就是当前对象的属性 age
		this.age = age;
		System.out.println("this.hashCode=" + this.hashCode());
	
	}
	public void info(){//成员方法,输出对象的属性
		System.out.println(name + "\t" + age + "\t");
	}
}