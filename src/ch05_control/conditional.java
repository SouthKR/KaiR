package ch05_control;

/**
 * Class Name   : conditional
 * Author       : KimEunHye
 * Created Date : 2024. 1. 4.
 * Version      : 1.0
 * Purpose      : 
 * Desciption   : 
 */

public class conditional {
	// 전역변수
	//class 중괄호 안에 어디서든 사용가능.
	static String subject = "조건문";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 30000;
		int myMoney = 10000;
		// 조건문 if
		if(myMoney < price) {
			System.out.println("돈이 부족함.");
		}
		System.out.println("==");
		
		// 변수의 사용 범의(scope)
		// 중괄호 블록{} 내부에 선언된 변수는 중괄호 바깥에서 사용할 수 없음.
		String msg;	// 지역변수 (해당 지역(범위)안에서만 사용가능)
		if(myMoney < price) {
			//String msg = "돈이 부족함"; 중괄호 안에서 선언된 변수는 밖에서 사용못함.
			msg = "돈이 부족함";
		}else {
			msg = "돈이 충분함";
		}
		
		System.out.println(msg);
		// 조건이 1개 이상일 경우
		int score = 85;
		String grade = "";
		if (score >= 90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";
		}else{
			grade = "E";
		}
		System.out.println(grade);
		
		// 순서에 주의해야함.
		score = 92;
		if (score >= 80) {
			grade="B";
		} else if (score >= 90) {
			grade = "A";
		}
		System.out.println(grade);
		if (score >= 80 && score >= 90) {
			grade="B";
		} else if (score >= 90) {
			grade = "A";
		}
		System.out.println(grade);
		Boolean flag = true;
		if(flag) {
			msg ="if문 1번째 조건식";
		} else {
			msg = "그밖에";
		}
		System.out.println(msg);
		// 중첩 if문 (if안에 if)
		// 조건1: 이름은 1글자 이상
		// 조건2: 전화번호는 10 or 11자리
		// 조건3: 나이는 14세 이상
		String nm = "펭수";
		String phone ="01012345678";
		int age = 20;
		// dlfmawhrjs
		if(nm.length() >=1 ) {
			//전화번호조건
			if(phone.length() == 10 ||phone.length() == 1){
				//나이조건
				if(age >= 14) {
					// System.out.println("회원가입 성공");
					msg = "환영합니다.";
				}else {
					//System.out.println("회원가입 실패");
					msg = "나이 조건이 만족하지 않습니다.";
				}
			}else {
				msg = "전화번호 조건이 만족하지 않습니다.";
				//System.out.println("회원가입 실패");
			}
		}else {
			msg = "이름이 조건이 만족하지 않습니다.";
			//System.out.println("회원가입 실패");
		}
		System.out.println(msg);
		System.out.println("종료");
		
		int num = 1;
		switch(num){
			case 0:
				System.out.println("수강등록");
				break;
			case 1:
				System.out.println("기초 프로그래밍");
				break;
			case 2:
				System.out.println("데이터베이스");
				break;
			default : 
				System.out.println("취업관련!");
		}
	}
}

