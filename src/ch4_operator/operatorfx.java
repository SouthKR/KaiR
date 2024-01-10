/*
 사용자에게 이메일 주소를 입력받고
 @가 포함되어 있는경우 (사용가능) 없을경우 (이메일형식이 아님)을 출력하시오. 
 ex) indexOf()는 대상문자열이 없을경우 -1 있을경우 인덱스를 변환함.
		
 1. scanner 생성
 2. eamil입력 메시지 출력
 3. 입력받은 데이터를 가지고 바로 조건식작성
 4. 결과 출력
 */
package ch4_operator;

import java.util.Scanner;

public class operatorfx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이메일을 입력해 주세요. (@를 포함여 입력하세요.)");
		System.out.print(">>> ");
		String str = scanner.nextLine();
		int indexOfAt = str.indexOf('@');
		
		String adress = (indexOfAt > -1) ? ("사용 가능한 이메일입니다.") : ("다시 입력하세요");
		System.out.println(adress);
	}

}
