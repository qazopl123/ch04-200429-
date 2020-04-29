
public class E_SCE
{

	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 +=10) > 0);
		System.out.println("result : " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');
		// '\n' -- 줄바꿈
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// SCE: Short-Circuit Evaluation
		//		최단거리 연산: 효율성을 위해 뒤 쪽은 계산을 하지 않는다.
		
	
		
	}

}
