public class HomeWork03 {
	public static void main(String[] args) {
		Book book = new Book("笑傲江湖", 300);
		book.info();
		book.updateprice();
		book.info();
	}
}
class Book {
	String name;
	double price;
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}
	public void updateprice(){
		if (this.price >150) {
			this.price = 150;
		}else if (this.price > 100) {
			this.price = 100;
		}
	}
	//显示书籍情况
	public void info(){
		System.out.println("书名=" + this.name + "价格=" + this.price);
	}
}