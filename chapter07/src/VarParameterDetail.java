public class VarParameterDetail {
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		T t1 = new T();
		t1.f1(arr);
	}
}
class T{
	public void f1(int... nums) {
		System.out.println("长度=" + nums.length);
	}

	//可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
	public void f2 (String str, double...nums){

	}
	//错误
	//public void f3(int...nums1, double...nums2){

	//}
}