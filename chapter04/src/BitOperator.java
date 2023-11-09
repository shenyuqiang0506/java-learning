public class BitOperator {

public static void main(String[] args) {
	//1.先得到2的补码=>2的原码 00000000 00000000 00000000 00000010
	//2的补码 00000000 00000000 00000000 00000010
	//2.3的原码 00000000 00000000 00000000 00000011
	// 3的补码 00000000 00000000 00000000 00000011
	//按位$ 
	// 00000000 00000000 00000000 00000010
	// 00000000 00000000 00000000 00000011
	// 00000000 00000000 00000000 00000010(补码)
	// 结果 00000000 00000000 00000000 00000010(2)
	System.out.println(2&3);

	System.out.println(~-2);
	//1.先得到-2的补码=>-2的原码 10000000 00000000 00000000 00000010
	// -2的补码 =>-2的补码  11111111 11111111 11111111 11111101
	//-2 的补码            11111111 11111111 11111111 11111110 
	// 按位~				   00000000 00000000 00000000 00000001(补码)
	// 原码				    00000000 00000000 00000000 00000001//1
	System.out.println(~2);
	//1.先得到2的补码=>2的原码 00000000 00000000 00000000 00000010
	//2 的补码           	00000000 00000000 00000000 00000010
	// 按位~				   	11111111 11111111 11111111 11111101(补码)
	// 运算后的反码 			11111111 11111111 11111111 11111100  
	// 运算后的原码  			10000000 00000000 00000000 00000011//-3
	}
}