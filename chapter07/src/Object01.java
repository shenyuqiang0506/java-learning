public class Object01 {
	public static void main(String[] args) {
/*张老太养了两只猫猫:一只名字叫小白,今年 3 岁,白色。
还有一只叫小花,今年 10岁,花色。
请编写一个程序，当用户输入小猫的名字时， 就显示该猫的名字，年龄，颜色。
如果用户输入的小猫名错误，则显示 张老太没有这只猫猫。*/	
		//单独变量来解决 => 不利于数据的管理(你把一只猫的信息拆解)
		//第一只
		// String cat1Name = "小白";
		// int cat1Age = 3;
		// String cat1Color = "白色";
		//第二只
		// String cat2Name = "小花";
		// int cat2Age = 10;
		// String cat2Color = "花色";

		//数组 ===>
		//(1)数据类型体现不出来
		//(2) 只能通过[下标]获取信息，造成变量名字和内容不明确
		//(3)不能体现猫的一个行为
		// String[] cat1 = {"小白","3","白色"};
		// String[] cat2 = {"小花","10","花色"};

		//使用 OOP 面向对象解决
		//实例化一只猫[创建一只猫对象]
		//1.new Cat() 创建一只猫
		//2.Cat cat1 = new Cat();把创建的猫赋给cat1
		//3.Cat1就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10;
		//创建第二只猫
		//Cat2是一个猫对象
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 10;
		cat2.color = "花色";
		cat2.weight = 20;

		//怎么访问对象的属性
		System.out.println("第一只猫的信息" + " 名字="+ cat1.name + " 年龄="+cat1.age+" 颜色="
			+ cat1.color+" 体重= "+cat1.weight);
		System.out.println("第二只猫的信息" + " 名字="+ cat2.name + " 年龄="+cat2.age+" 颜色="
			+ cat2.color+" 体重= "+cat2.weight);
	}	
}
//使用 OOP 面向对象解决
//实例化一只猫[创建一只猫对象]
//定义一个猫类
class Cat{
	//属性
	String  name;//名字
	int age;//年龄
	String color;//颜色
	double weight;//体重
	//行为
}