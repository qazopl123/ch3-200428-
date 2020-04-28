
public class C_EscapeSequence
{

	public static void main(String[] args)
	{
		System.out.println("SOO" + '\b' + "S"); // = SOS -- '\b' 왼쪽 문자 하나 지워짐
		System.out.println("GOA" + '\t' + "L"); // = GOA(탭)L -- 탭 추가 -- 실생활에 그나마 사용 가능
		System.out.println("A" + '\\' + "B");  // = A\B -- 백슬래시 추가
		System.out.println("I" + '\'' + "m"); // =I'm -- 작은 따옴표 추가
		System.out.println('\"' + "." + '\"'); // = "." -- 큰 따옴표 추가
		System.out.println("Do" + '\n' + "g"); // Do(줄바꿈)g -- '\n' 기준 행 바꿈
		System.out.println("Carr" + '\r' + "iage"); // = iage -- '\r' 기준 왼쪽 문자 삭제

	}

}
