public class HomeWork05 {
	public static void main(String[] args) {
		Cilcle cilcle = new Cilcle(3);
		System.out.println("面积=" + cilcle.area());
		System.out.println("周长" + cilcle.len());
 	}
}
class Cilcle {
	double radius;

	public Cilcle(double radius){
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
	public double len () {
		return 2 * Math.PI * radius;
	}
}