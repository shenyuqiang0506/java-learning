public class RecursionExercise01 {
	public static void main(String[] args) {
		T t1 = new T ();
		//int n = 9;
		//int res = t1.fibonacci(n);
		//if (res!= -1) {
			//System.out.println("当 n="+ n +" 对应的斐波那契数= "+ res);
		int day = 1;
		int peachNum = t1.peach(day); 
		if(peachNum != -1) {
		System.out.println("第 " + day + "天有" + peachNum + "个桃子");

			
		}
	}
}
class T {
/*
请使用递归的方式求出斐波那契数 1,1,2,3,5,8,13...给你一个整数 n，求出它的值是多 
思路分析
1. 当 n = 1 斐波那契数 是 1
2. 当 n = 2 斐波那契数 是 1
3. 当 n >= 3	斐波那契数 是前两个数的和
4.  这里就是一个递归的思路
*/
public int fibonacci(int n) { 
	if( n >= 1) {
		if( n == 1 || n == 2) { return 1;
		} else {
		return fibonacci(n-1) + fibonacci(n-2);
		}
			} else {
		System.out.println("要求输入的 n>=1 的整数"); 
			return -1;
			}
		}
/* 猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！ 
以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时，
想再吃时（即还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子？

思路分析 逆推
1. day = 10  时 有 1 个桃子
2. day = 9 时	有 (day10 + 1) * 2 = 4
3. day = 8 时	有 (day9 + 1) * 2 = 10
4.  规律就是	前一天的桃子 = (后一天的桃子 + 1) *2//就是我们的能力
5.  递归
*/
		public int peach(int day){
			if (day == 10) {
				return 1;	
			}else if (day >= 1 && day <= 9) {
				return (peach(day + 1) + 1) *2;
			}else{
				System.out.println("day在1-10天的范围");
				return 0;
			}
		}

	}
