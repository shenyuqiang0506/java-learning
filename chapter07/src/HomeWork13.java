public class HomeWork13 {
	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject po = new PassObject();
		po.printAreas(5);
	}
}
class Circle {
	double radius;
	public Circle(){

	}
	public Circle(double radius){
		this.radius = radius;
	}
	public double findArea() {//返回面积
		return Math.PI * radius * radius;
	}
	//添加方法setRadius,修改对象的半径值
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class PassObject {
	public void printAreas(Circle c,int times) {
		System.out.println("radius\tarea");
		for (int i = 1;i<= times ;i++ ) {
			c.setRadius(i);
			System.out.println(i + "\t" + c.findArea());
			
		}
	}
}