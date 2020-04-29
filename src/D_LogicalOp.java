
public class D_LogicalOp
{

	public static void main(String[] args)
	{
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		// Q1. 1초과 100미만인가?
		result = ((1 < num1) && (num1 < 100));
		System.out.println("1초과 100미만 : " + result);
		
		// Q2. 2 또는 3의 배수인가?
		result = (((num2 % 2) == 0) || (num2 % 3) == 0);
		System.out.println("2또는 3의 배수: " + result);
		
		// Q3. 참인가?
		result = !(num1 != 0);
		System.out.println("(결과적으로) 참이 아니다. : " + result);
		
	}

}
