public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
		int i1 = 1;//1
		i1= i1++;//规则:(1)会使用一个临时变量:temp=i;(2)i=i+1;(3)i=temp
		System.out.println(i1);//1

		int i2 = 1;
		i2 = ++i2;//规则:(2)会使用一个临时变量:temp=i;(1)i=i+1;(3)i=temp
		System.out.println(i2);//2

		int i3 = 10;
		int i4 = 20;
		int i = i3++;
		System.out.print("i="+i);
		System.out.println("i4="+i4);
		i = --i4;
		System.out.print("i=" +i);
		System.out.println("i4="+i4);

	}
}
