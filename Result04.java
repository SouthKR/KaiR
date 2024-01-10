package practre;

import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;

public class Result04 {

	public static void main(String[] args) {
		System.out.println("1번");
		/*
		 * 1~50사이 랜덤한 수를 5번 안에 맞춰야하는 업다운 게임
		 * 1~50 사이의 랜덤한 수가 생성되어 사용자가 입력한 숫자에 대해
		 * 업, 다운을 알려줌
		 * 5회 안에 사용자가 정답을 맞추지 못할경우 실패라는 문구를
		 * 					  맞춘다면 성공한다는 문구를 출력후 종료된다.
		 * */
		int randInt = (int)(Math.random() * 10 + 1);
		int chance = 4;

		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("숫자를 입력해주세요: ");
			int a = Integer.parseInt(scanner.nextLine());

			if (chance == 0) {
				System.out.println("실패하셨습니다.정답은"+ randInt+ "입니다.");
				break;
			} else if (randInt > a) {
				System.out.printf("업!! 기회가 %d번 남았습니다.\n", chance);
				chance--;
			} else if (randInt < a) {
				System.out.printf("다운!! 기회가 %d번 남았습니다.\n", chance);
				chance--;
			} else {
				System.out.println("정답입니다!");
				break;
			}
		}

		System.out.println("2번");
		/*
		 * 두대의 엘리베이터가 있는 빌딩에서 버튼을 눌렀을때
		 * 사용자의 위치와 가까운 엘리베이터가 이동하는 프로그램
		 * */
		int elve =10;
		int elve2 = 4;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("승강기 A의 현재 위치: "+ elve);
			System.out.println("승강기 B의 현재 위치: " + elve2);
			System.out.println("몇층에 계시나요? [종료는 q 또는 exit]: ");            
			String input = scanner.nextLine();
			// equals 주소할당 
			//IgnoreCase 대소문자 무시
			if(input.equalsIgnoreCase("q") || input.equalsIgnoreCase("exit") ){
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			int me = Integer.parseInt(input);
			
			int elve3 = Math.abs(me - elve);
			int elve4 = Math.abs(me - elve2);

			if(elve3 < elve4) {
				System.out.printf("엘리베이터A가 %d층에 도착했습니다. \n", me);
				elve = me;
			}else if(elve3 > elve4) {
				System.out.printf("엘리베이터B가 %d층에 도착했습니다. \n", me);
				elve2 = me;
			}else if(elve3 == elve4) {
				if(elve > elve2) { 
					System.out.printf("엘리베이터A가 %d층에 도착했습니다. \n", me);
					elve = me;
					}else {
					System.out.printf("엘리베이터B가 %d층에 도착했습니다. \n", me);
					elve2 = me;
				}
			}
		}
	}
}