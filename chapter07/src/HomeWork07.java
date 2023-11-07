public class HomeWork07 {
	public static void main(String[] args) {
		Dog dog = new Dog("xiaomi","红色",11);
		dog.info();

	}
}
class Dog {
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
		}
	public void info(){//成员方法,输出对象的属性
		System.out.println(name + "\t" + age + "\t" + color);
	}
}