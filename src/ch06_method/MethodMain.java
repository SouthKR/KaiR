package ch06_method;


public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 매소드 클래스나 객체에 중속된 함수
		// 자바는 모두 클래스에 작성되기 때문에 함수를 메소드라 부름
		// 1~100까지 숫자를 더하면?
		// 1~50까지 숫다를 더하면?
		// 30~60까지 숫자를 더하면?
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum +=i;
		}
		System.out.println(sum);
		//메소드 실행
		printSum(1, 100);
		printSum(1, 50);
		printSum(30, 60);
		int res = returnSum(1, 30);
		System.out.println("리턴받은 값:" + res);
		// 매소드 생성
		// 접근제어자 static 리턴타입 메소드명: 피라미터{}
		print("hi");
		print(100);
	}
		public static void printSum(int from, int to){
			int sum = 0;
			for(int i = from; i<=to; i++) {
				sum +=i;
			}
			
			System.out.printf("from: %d부터 to: %d까디 합은:%d \n", from, to, sum);
		}
		
		public static int returnSum(int from, int to){
			int sum = 0;
			for(int i = from; i<=to; i++) {
				sum +=i;
			}
			
			return sum;
		}
		public static void print(String msg) {
			System.out.println(msg);
		}
		// 메소드 오버로딩 동일한 이름의 메소드를 다른 입력과, 리턴으로 정의할 수 있음.
		public static void print(int msg) {
			System.out.println(msg);
		}

	// 정수를 입력받아 절대값을 정수형으로 리턴하는 메소드를 작성하라.
	System.out.println(MyAds(-10));
	System.out.println(MyAds(10));
	
	// 1 input, output int		(를 작성)
	// 2 0보다 작으면 (음수)면 * -1?	(조건 및 실행문 작성
		
	public static int MyAds(int from, int to) {
		if(sum<0) {
			num*=-1;
		}
		return num;
	}
}
