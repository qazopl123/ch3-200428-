
public class A_Constants
{

	public static void main(String[] args)
	{
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		
		CONST_ASSIGNED = 10;
		
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
		
		/*
		 * final 값은 다시 정의 불가능
		CONST_ASSIGNED = 20;
		System.out.println(CONST_ASSIGNED);
		*/
		
	}

}
