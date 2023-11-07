public class ConstructorExercise {
	public static void main(String[] args) {
		Penson01 p1 = new Penson01();//无参构造器
	System.out.println("p1 的信息 name=" + p1.name + " age=" + p1.age);
	Penson01 p2 = new Penson01("xiaomi", 13);
	//下面输出 name = xiaomi, age =13
	System.out.println("p2 的信息 name=" + p2.name + " age=" + p2.age);

	}
}
/**
* 在前面定义的 Person 类中添加两个构造器:
* 第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18
* 第二个带 pName 和 pAge 两个参数的构造器：
* 使得每次创建 Person 对象的同时初始化对象的 age 属性值和 name 属性值。
*  分别使用不同的构造器，创建对象.
*/
class Penson{
	String name;//默认值 null
	int age;//默认 0
	//第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18 
	public Penson (){
		age = 18;

	}
	//第二个带 pName 和 pAge 两个参数的构造器
	public Penson (String pName, int pAge){
		name = pName; 
		age = pAge;
	}
}