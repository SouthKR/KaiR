package ch4_operator;
import java.util.Scanner; 

public class OpereratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자 opeaton
		// 1.증강 연산자
		int num = 10;
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		int a, b;
		a = num++; // 후
		b = ++num; // 전
		System.out.printf("a: %d b: %d", a, b);
		System.out.println("\n ===== 산술 연산자 ====");
		int c = a *b;
		int d = a+b;
		System.out.printf("c:%d d:%d", c, d);
		System.out.println("나머지: "+(5%2));
		System.out.println("====대입연산자===");
		num +=1;
		System.out.println(num);
		num *=2;
		System.out.println(num);
		System.out.println("======비교 연산자=======");
		// 비교 결과에 따라 true/false가 리턴됨.
		System.out.println("a:%d b:%d , a,d");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b); // 같지 않다
		System.out.println(a == b); // 같다
		System.out.println("====삼함 연산자======");
		// (a) ? (b)  : (c) a의 조건식이 true이면 b 아니면 c
		
		/*
		String id = "nick"; // leeapgil -> 8글자라 통과
		String check =  (id.length() >= 8)? ("통과") : ("재입력");
		System.out.println(check);
		*/
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("아이디를 입력해주세요 (8자 이상)");
		System.out.print(">>> ");
		String id = scanner.nextLine();
		String check = (id.length() >=8 ) ? ("통과") : ("재입력");
		System.out.println(check);
		System.out.println("성적을 입력하시오");
		System.out.print(">>> ");
		int score = Integer.parseInt(scanner.nextLine());
		// 60이상 통과, 미만 재시험을 클릭하라.
		// socre 값을 가지고 삼항연산자를 이용하여 위의 조건에 따른 결과를 출력하라.
		String msg = (score >= 60)? ("통과"):("재시험");
		System.out.printf("%d님은 %d점으로 %s입니다.", id, score, msg);
		// 사용자의 아이디는 8~14자리 이메일인 경우만 가능
		 */
		System.out.println("====== 논리 연산자 =====");
		// and -> && or ||
		System.out.println("아이디를 입력해 주세요. (8~14 길이 가능");
		System.out.print(">>>");
		String str = scanner.nextLine();
		String msg = (str.length() >= 8 && str.length() < 15) ? "사용 가능한 아이디 입니다." : "8~14자리로 입력하세요.";
		System.out.println(msg);
		
		// 98이상 A, 80 이상 B, 나머지 C
		System.out.println("성적을 입력해주세요.");
		System.out.print(">>> ");
		int score = Integer.parseInt(scanner.nextLine());
		Steing grade = (score >= 90)?("A"):((score >=80)?("B"):("C"));
		// ?안에서 맞냐 틀리냐를 따짐.
		System.out.println(grade);
		
		//사용자에게 이메일 주소를 입력받고
		//@가 포함되어 있는경우 (사용가능) 없을경우 (이메일형식이 아님)을 출력하시오. 
		//ex) index()f는 대상문자열이 없을경우 -1 있을경우 인덱스를 변환함.
	}
}
