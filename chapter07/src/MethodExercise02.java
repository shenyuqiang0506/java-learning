/*	1)编写类 MyTools 类，编写一个方法可以打印二维数组的数据。
	2)编写一个方法 copyPerson，可以复制一个 Person 对象，
	返回复制的对象。克隆对象， 注意要求得到新对象和原来的 
	对象是两个独立的对象，只是他们的属性相同
*/
public class MethodExercise02 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "xiaomi";
		p.age = 13;
		//创建tools
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);
		//到此 p 和 p2 是 Person 对象，但是是两个独立的对象，属性相同 
		System.out.println("p 的属性 age=" + p.age + "名字=" + p.name);
		System.out.println("p2 的属性 age=" + p2.age	 + "名字=" + p2.name);
		//提示： 可以同 对象比较看看是否为同一个对象
		System.out.println(p == p2);//false

	}
}
class Person{
	String name;
	int age;
}
class MyTools{
//编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。克隆对象，
//注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
//
//编写方法的思路
//1.  方法的返回类型 Person
//2.  方法的名字 copyPerson
//3.  方法的形参 (Person p)
//4.  方法体, 创建一个新对象，并复制属性，返回即可
	public Person copyPerson(Person p) {
		//创建一个新的对象
		Person p2 = new Person();
		p2.name = p.name; //把原来对象的名字赋给 p2.name
		p2.age = p.age;//把原来对象的年龄赋给 p2.age 
		return p2;
	}
}