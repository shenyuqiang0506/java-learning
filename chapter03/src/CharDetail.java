public class CharDetail {

	public static void main (String[] args) {
		//在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		char c1 = 97;
		System.out.println(97);//a

		char c2 = 'a';//输出对应'a'的数字
		 System.out.println((int)c2);

	    char c3 = '申';//输出对应'a'的数字
		System.out.println((int)c3);

		//char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码 
		System.out.println('a' + 10);//107

		char c5 = 'b' + 1;
		System.out.println((int)c5);
		System.out.println(c5);

	}

 
	}