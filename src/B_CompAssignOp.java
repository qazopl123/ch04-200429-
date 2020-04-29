
public class B_CompAssignOp
{

	public static void main(String[] args)
	{
		short num = 10; 
		num = (short) (num + 77L); // long --> short 형 변환 필요
		
		int rate = 3;
		rate = (int) (rate * 3.5); // 실수 --> 정수 형 변환 필요
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L; // 형 변환 불필요
		
		rate = 3;
		rate *= 3.5; // 형 변환 불필요
		
		System.out.println(num);
		System.out.println(rate);

	}

}
