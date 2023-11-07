//演示
public class ArithmeticOperator {
	public static void main(String[] args) {
		//
		System.out.println(10 / 4);//数学中是2.5,java中是2
		System.out.println(10.0 / 4);//2.5精度提升
		double d = 10 / 4;
		System.out.println(d);
		//
		//取模的使用%
		//在%的本质看一个公式,a % b = a-a / b*b
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1
		//
		//++的使用
		int i = 10; 
		i++;//自增 等价与 i = i + 1
		++i;//自增 等价与 i = i + 1
		System.out.println("i=" + i);//11

		/*作为表达式使用
		前++ : ++i先自增后赋值
		后++ : i++先赋值后自增
		*/
		int j = 8;
		int k = ++j;//等价于 j= j+1 k=j
		//int k = j++;//等价与 k =j j= j+1
		System.out.println("k=" + k + "j=" + j ); //9 9
		//System.out.println("k=" + k + "j=" + j ); //8 9 


      }
   }
