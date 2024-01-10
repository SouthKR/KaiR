package ch5_controll;
import java.utill.Scanner;
public class ch05_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메뉴를 입력받아 가격을 출력.(switch 사용)
		// 아아 or 아이스 아메리카노: 3000
		// 라떼: 4500
		// 에스프레소 : 2500
		// 위의 메뉴로 입력하면 "입력 메뉴는 000은 000원 입니다." 출력
		// 없는 메뉴면 "000은 저희 매장에 없는 메뉴입니다 출력
		int salePrice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 주문하세요.");
		System.out.print(">>> ");
		// System.out.print(scan.nextLine);
		String menu = scanner.nextLine();
		switch(menu) {
			case "아아":
			case "아이스아메리카노":
				System.out.println("아메");
				break;
			default : 
				System.out.println("저희 매장에 없는 메뉴입니다.");
		}
		System.out.println("입");

	}

}
