public class HomeWork01 {
	public static void main(String[] args) {
		A01 a01 = new A01();
		double[] arr = {1,1.0};  //{};
		Double res = a01.max(arr);
		if (res != null) {
			System.out.println("arr的最大值" + res);
		}else {
			System.out.println("arr输入有误");
		}
	}
}
//先完成基本,在考虑健壮性
class A01 {
	public Double max(double[] arr) {
		//保证arr至少有一个元素
		if (arr != null && arr.length > 0) {
		double max = arr[0];//假定第一个为最大值
		for (int i = 1;i< arr.length ;i++ ) {
			if (max < arr[i]) {
				max = arr[i];
				}
			}
		return max;
		}else {
			return null;
		}
	}
}