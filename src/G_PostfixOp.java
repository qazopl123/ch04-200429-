
public class G_PostfixOp
{

	public static void main(String[] args)
	{
		int num = 7;
		
		// 먼저 더해진 값을 대입
		// 첫 대입값은 안씀
		System.out.print(++num); // 7에서 1증가 값
		System.out.print(++num); // 8에서 1증가 값
		System.out.println(num); // 9
		
		System.out.print(--num); // 9에서 1감소 값
		System.out.print(--num); // 8에서 1감소 값
		System.out.print(num); // 7

	}

}
