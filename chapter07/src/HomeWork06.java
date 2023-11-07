public class HomeWork06 {
	public static void main(String[] args) {
		Cale cale = new Cale(2,0);
		System.out.println("和=" + cale.sum());
		System.out.println("减=" + cale.minus());
		System.out.println("乘=" + cale.mul());
		Double divRes = cale.div();
		if (divRes != null) {
			System.out.println("除=" + divRes);
		}	
	}
}
class Cale {
	double num1;
	double num2;
	public Cale(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public double sum (){
		return num1 + num2; 
	}
	public double minus (){
		return num1 - num2; 
	}
	public double mul (){
		return num1 * num2; 
	}
	//除法
	public Double div (){
		//判断
		if (num2 == 0) {
			System.out.println("不能为0");
			return null;		
		}else {
			return num1 / num2; 
		}

	}
}