//演示转义字符的使用
public class Change {
    
	public static void main (String[] args) {
         // \t:一个制表位，实现对齐的功能
		System.out.println("北京\t天津\t上海");
        // \n:换行符
		System.out.println("红楼梦\n水浒传\n三国演义");
        // \:一个\
        System.out.println("C:\\Program Files (x86)\\Java\\jre1.8.0_211");
        // \"一个"
        System.out.println("老韩说:\"要好好学习java\"");
        // \':一个'
        System.out.println("老韩说:\'要好好学习java\'");
        // \r:一个回车System.out.println(”我爱你\r北京”);
        //解读
        //1.输出 我爱
        //2.\r表示回车
        System.out.println("我爱你\r北京");//北京你
        //作业
        System.out.println("我爱你\r\n北京");//我爱你北京
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
        System.out.println("春色绿千里\n马蹄香万家");

        //示意=>可读性好
        //下面代码完成 两个数相加
        //定义变量
        int n1 = 10; 
        int n2 = 30;
        //求和
        int sum = n1 + n2;
        //输出结果
        System.out.println("结果="+ sum);
        	}
}