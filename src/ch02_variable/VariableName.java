package ch02_variable;

public class VariableName {

	public static void main(String[] args) {
		// 변수명, 클래스명 명명 규칙 
		
		// 여러줄 주석 		
		/*  
		 *  프로젝트,클래스명 이름은 앞에 대문자를 씀.(JavaStudy..)
		 *  
		 *  패키지(폴더) 이름은 전부 소문자로 작성
		 *  필요하다면 단어 사이에 언더바(_)를 넣어서 사용 (ch01_start..)
		 * 
		 *  변수명( or 함수명)
		 *  카멜 표기법(Camel, 낙타 표기법이라함.)
		 *  첫글자는 소문자, 다음 단어들은 대문자로 시작 
		 *  ex) todayIsHappy 
		 *  
		 *  python은 스네이크 표기법사용
		 *  ex) today_is_happy
		 *  
		 * */
		//[데이터 타입] [변수명]		
		// 정수타입
		int todayIsHappy = 0;
		todayIsHappy = todayIsHappy + 10;
		todayIsHappy = todayIsHappy + 1;
		System.out.println(todayIsHappy);
		
		byte byteVar = 1;
		System.out.println(byteVar);
		short shortVar = 2;
		System.out.println(shortVar);
		int intVar = 3;
		System.out.println(intVar);
		long longVar = 30000000000L;   // long 은 L이 붙음
		System.out.println(longVar); //ctrl + alt + 아래방향
		// 정수 이면서 문자에 해당
		char charVar = 44032; // '가'와 같음
		char ga = '가';
		// 소수 타입
		float floatVar = 3.14f;
		double doubleVar = 3.14;
		// 불리언 타입(참/거짓, ture/false)
		boolean boolVar = false;
		// 문자열 타입
		String strToday = "오늘은 1월 2일";
	
	}

}
