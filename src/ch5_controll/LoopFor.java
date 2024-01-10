package ch5_controll;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println("============for문=======");
		// for문
		// (1초기화식; 2조건식; 4증감식
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		// 1~20까지 더하기
		int sum = 0;
		for(int i = 1; i<=20; i++) {
			System.out.println(i);
			sum +=i;
		}
		System.out.println("1~20을 더하면;"+ sum);
		int sum2 = 0;
		for(int i = 21; i<=45; i++) {
			sum2 +=i;
		}
		System.out.println("21~45를 더하면:" + sum2);
		int sum3 = 0;
		//1. 1부터 40까지 짝수만 더하는 값을 출력하라
		for(int i = 1; i<=40; i++) {
			//2. 조건 짝수일 경우 더하기
			if (i%2==0){
				System.out.println(i);
				sum3 +=i;
			}
		}
		//3. 최종 출력
		System.out.println("1~40까지 중 짝수만 더하면:" + sum3);
		int sum4 = 0;
		// 2씩 증가
		for(int i =0; i<=40; i+=2) {
			System.out.println("i 값:" +i);
			sum4 +=i;
		}
		System.out.println("1~40까지 중 짝수만 더하면:" +sum4);
		System.out.println();
		//for문을 이용해서 구구단 2단을 출력하시오.
		int dan = 2;
//		int sum5 = 0; 
		System.out.printf("구구단 %d단 \n", dan);
		for(int i=1; i<=9; i++){
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		// 2~9단 출력
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단");
			for(int j= 1; j<=9; j++) {
				System.out.printf("%d x %d = %d \n", i, j, i*j);
			}
			
		}
	}
}
