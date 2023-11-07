public class BitOperator02 {

public static void main(String[] args) {

	int a = 1>>2;//本质 1/2/2=0
	int c = 1<<2;//本质 1*2*2=4
	int d = 4<<3;
	int e = 15>>2;
	System.out.println("a=" + a);
	System.out.println("c=" + c);
	System.out.println("d=" + d);
	System.out.println("e=" + e);
	

    }
}