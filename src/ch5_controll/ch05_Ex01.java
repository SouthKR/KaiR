package ch5_controll;

public class ch05_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사용자로부터 숫자를 입력받고 숫자가 짝수인지 홀수인지 판별하는 프로그램을 작성하시오.
		 * 정수만 입력하는 상황
		 * */
		
		// Scanner 에서 main이 오류남!
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.(정수)");
		System.out.print(">>> ");
		// 짝수홀수 판별 조건식 작성! (사용자입력은 문자열로 인식됨. int 형변환후 조건식 사용)
		// hit x로 나눴을때 0이면 짝수 0이아니면 홀수
		// "입력한 숫자는 짝수입니다."or" 입력한 숫자는 홀수입니다.
		int num = Integer.parseInt(scan.nextLine());
		if(num % 2 ==0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}else {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		scan.close();
	}
}
