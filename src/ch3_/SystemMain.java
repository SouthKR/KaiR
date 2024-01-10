package ch3_;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hi"); // 이어서 출력
		System.out.print("hi"); // 이어서 출력
		System.out.println("hi");// 이어서 출력
		System.out.println("hi");// 이어서 출력
		System.out.println("오류입니다.");
		// 자동 정렬: 전체 선택후 ->  ctrl + shift +f
		
		//에스케이프 문자사용
		// \n줄 개형, \t 탭
		System.out.println("중간에 \n 넣으면 개형이됨.");
		System.out.println("중간에 \t 넣으면 탭 효과 ");
		System.out.println("중간에 특수문자 사용 \"어떻게\" ");
		// printf()포멧 문자열 형태로 사용
		System.out.printf("원주율 %.2f \n", 3.141592);
		// 여러개 출력가능 ("대상문자열", 값 1, 값 2, ...
		System.out.printf("%d 명이 %s를 들고 있습니다.", 21, "java 수업");
		
		System.out.println("=====표준입력=====");
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		System.out.print(">>> ");
		// 키보드 입력을 기다림
		String nm = scan.nextLine();
		// 입력받은 내용을 출력
		System.out.println(nm + "님 환영합니다.");
		System.out.println("나이 입력해주세요.");
		System.out.print(">>> ");
		int age = Integer.parseInt(scan.nextLine());
		System.out.printf("%s 님 나이는 %d 이군요.", nm, age);
		scan.close();
	}
}