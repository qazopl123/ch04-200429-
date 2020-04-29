
public class F_UnaryAddMin
{

	public static void main(String[] args)
	{
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);
		
		short num2 = 7;
		int num3 = (short)(+num2);
		short num4 = (short)(-num2);
		/* 앞에 (short)를 안붙이면 안됨.
		 * short는 계산 불가능, int만 가능
		 * 그래서, 연산을 하기 위해서 int로 바뀌게 됨
		 * 그래서 short num3 = 처럼 short로 정의하려면
		 * (short) 붙여줘야 함
		 */
		System.out.println(num3);
		System.out.println(num4);

	}

}
