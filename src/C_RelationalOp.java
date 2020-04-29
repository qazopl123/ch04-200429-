
public class C_RelationalOp
{

	public static void main(String[] args)
	{
		System.out.println("3 >= 2 : " + (3 >= 2));
		System.out.println("3 <= 2 : " + (3 <= 2));
		
		// 비교 시 형 변환이 일어남
		// 7 --> double로 변환 --> 기계는 7.0으로 인지
		System.out.println("7.0 == 7 : " + (7.0 == 7));
		System.out.println("7.0 != 7 : " + (7.0 != 7));

	}

}
