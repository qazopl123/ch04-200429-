import java.util.Scanner;
public class A3_CondOp
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수 입력");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수 입력");
		int num2 = sc.nextInt();
		
		int big = (num1 > num2) ? num1 : num2; // num1 > num2가 true이면, num1
		int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		
		System.out.printf("첫 번째 수: %d \n", num1);
		System.out.printf("두 번째 수: %d \n", num2);
		System.out.printf("큰 값: %d \n", big);
		System.out.printf("큰 값: %d \n", diff);
		
		sc.close();

	}

}
