/*B 类中编写一个方法 test100，可以接收一个数组，在方法中修改该数组，
看看原来的数组是否变化？会变化
B 类中编写一个方法 test200，可以接收一个 Person(age,sal)对象，
在方法中修改该对象属性，看看原来的对象是否变
化？会变化.*/
public class MethodParameter02 {
	public static void main(String[] args) {
		B b = new B();
		int[] arr = {1,2,3};
		b.test100(arr);
		System.out.println("main的数组");
		for (int i = 0;i < arr.length;i++ ) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println( );
		//测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		System.out.println("main 的 p.age=" + p.age);

	}
}
class Person{
	String name;
	int age;
}
class B {
	public void test200(Person p){
		p.age = 200;
	}
	//B 类中编写一个方法 test100，可以接收一个数组，在方法中修改该数组，
	//看看原来的数组是否变化？会变化
	public void test100(int[] arr){
		arr[0] = 200;
		System.out.println("test100的数组");
		for (int i = 0;i < arr.length;i++ ) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println( );
	}
}