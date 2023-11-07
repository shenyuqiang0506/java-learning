import java.util.Scanner; 
public class SeqSearch {
	public static void main(String[] args) {
		/*有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
		从键盘中任意输入一个名称，判断数列中是否 包含此名称【顺序查找】
		要求: 如果找到了，就提示找到，并给出下标值。
		 */
		//定义一个字符串数组
		String[] names = {"shen", "li", "紫衫龙王", "青翼蝠王"}; 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字"); 
		String findName = myScanner.next();
		int index = -1;
		for (int i = 0;i<names.length ;i++ ) {
			if (findName.equals(names[i])) {
				System.out.println("恭喜你找到 " + findName);
				System.out.println("下标为="+ i );
				//把 i 保存到 index 
				index = i; 
				break;//退出
			}
		}
		if(index == -1) { //没有找到
		System.out.println("sorry ,没有找到 " + findName);
		}

	}	
}