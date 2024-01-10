package ch06_method;

public class RecyrsionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Func(5);
		System.out.println(factorial(4));
		System.out.println(factorial(10));
		System.out.println(factorial(15));
		
		System.out.println(racfocrial(4));
		System.out.println(racfocrial(10));
		System.out.println(racfocrial(15));
		moreCard("팽수", 90, 80, 75);
	}
	public static void Func (int num) {
		if(num == 0) {
			return;
		}else {
			System.out.println("hi");
			// 자신을 호출
			Func(num - 1);
		}
	}
	// factorial
	public static long factorial(int num) {
		long sum = 1;
		for(int i = 1; i <= num; i++) {
			sum *=i;
		}
		return sum;
}
	public static long racfocrial(int num) {
		if(num == 1) {
			return 1;
		}
		/* 3을 입력받았다면
		 * 3*ractorial(2)
		 * 3*2*ractorial(1)
		 */
		return num * racfocrial(num -1);
	}
	
	//이름, 국어점수ㅡ 수학점수, 영어점수를 입력받아
	// 평균과 등급을 출력하는 메소드를 작성하라
	// input: Strung, int, int, int
	// output : X없음
	// 평균이 90이상 A, 80 이상 B, 나머지 C
	// x님의 평균은 (소수점 2자리까지 출력)으로 y등급 입니다. 출력
	public static void makeCard(String nm, int kor, int math, int eng) {
		System.out.println("이름: " + nm);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		double avg = (kor + math + eng) / 3.0;
		String grade = "c";
		if (avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}
		System.out.printf("%d님의 평균은 %.4으로 %s등급입니다.", nm, avg, grade);
	}
}
