public class HomeWork04 {
	public static void main(String[] args) {
		/*要求插入一个元素，该数组顺序依然是升序,比如:
		已知有个升序的数组，[10，12，45，90]，添加23 后, 
		数组为 [10，12，23，45，90]
		思路:扩容+定位
		*/
		int[] arr = {10,12,45,90} ;
		int insertNum = 23;
		int index = -1;//插入的位置
		//遍历arr的数组 如果发现 insertNum<=arr[i],说明 i 就是要插入的位置
		//使用 index 保留 index = i;
		//如果遍历完,没有发现 insertNum<=arr[i],说明 index = arr.length
		//添加到arr的最后

		for (int i = 0;i < arr.length ;i++ ) {
			if (insertNum <= arr[i]) {
				index = i;
				break;//找到位置后,退出			
			}
		}
		//判断index的值
		if (index == -1) {//说明没有找到位置
			index = arr.length;
			
		}
		//扩容
		/*先创建一个新的数组
		 int[] arrNew = new int[arr.length + 1];
		 准备将arr的元素拷贝到 arrNew ,并且要跳过 index位置
		分析
		int[] arr = {10,12,45,90} 
		arrnew = {10,12,index,45,90}
		 */
		int[] arrNew = new int[arr.length + 1];
		for (int i = 0,j = 0 ;i <arrNew.length;i++ ) {
			if (i != index) {//可以把arr的元素拷贝到 arrNew
				arrNew[i] = arr[j];
				j++;
			}else {//i这个位置就是要插入的数
				arrNew[i] = insertNum;
				}
			}
			//arr 指向 arrNew,原来的数组销毁
			arr = arrNew;
			System.out.println("=============新数组============");
			for (int i = 0; i< arr.length;i++) {
				System.out.print(arr[i]+ "\t");				
			}
		}
	}