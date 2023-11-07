
public class SwithExercise01 {
	public static void main(String[] args) {
		double score = 88.5;
		if( score >= 0 && score <= 100) {
switch ((int)(score / 60)) { case 0 :
System.out.println("不合格");
break; case 1 :
System.out.println("合格");
break;
// default :
//	System.out.println("输入有误");
}
} else {
System.out.println("输入的成绩在 0-100");
}
}
}

