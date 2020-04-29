
public class H_PrefixOp
{

	public static void main(String[] args)
	{
		int num = 5;
		
		// 숫자를 먼저 쓰고
		// 더해진 값을 대입
		System.out.print((num++) + " ");
		System.out.print((num++) + " ");
		System.out.print(num + "\n");
		
		System.out.print((num--) + " ");
		System.out.print((num--) + " ");
		System.out.print(num);

	}

}
