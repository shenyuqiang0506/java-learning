public class ConstructorDetail {
	public static void main(String[] args) {
		Penson01 p1 = new Penson01("xiaomi",13);
		Penson01 p2 = new Penson01("Tom");

		Dog dog1 = new Dog();
	}
}
class Dog{
	//如果程序员没有定义构造器，
	//系统会自动给类生成一个默认无参构造器(也叫默认构造器)
	/*	
	默认构造器
	Dog(){
	
	}
	*/
	/*一旦定义了自己的构造器,默认的构造器就覆盖了，
	就不能再使用默认的无参构造器，
	除非显式的定义一下,即: Dog(){} 写(这点很重要)
	*/
	public Dog(String dName){

	}
	Dog(){
		//显式的定义一下
	}
}
class Penson{
	String name;
	int age;
	//第 1 个构造器
	public Penson(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	//第 2 个构造器
	public Penson(String pName){
		name = pName;
	}
}