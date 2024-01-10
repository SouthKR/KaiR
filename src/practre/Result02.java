/*
 * 2024 01 04
 * 김은혜
 * 프로젝트명: 문자열 변수. "너오구늘리뭐너먹지리"에서 너구리를 제거하여 출력.
 * 변수명: String enigma
 * 
 * 실행 결과
 * 1차 암호 해독[너 제거]:
 * 1차 암호 해독[구 제거]:
 * 1차 암호 해독[리 제거]:
 * 해독 완료!! -> 오늘 뭐 먹지
 * 
*/
package practre;

public class Result02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String enugma = "너오구늘리뭐너먹구지리";
		String enugma2 = (enugma.replace("너",""));
		String enugma3 = (enugma2.replace("구",""));
		String enugma4 = (enugma3.replace("리",""));
		System.out.println("1차 암호 해독[너 제거]:"+ (enugma.replace("너","")));
		
		System.out.println("2차 암호 해독[구 제거]:"+ (enugma2.replace("구","")));
		
		System.out.println("3차 암호 해독[리 제거]:"+ (enugma3.replace("리","")));
		
		System.out.println("해독완료!! -> " + (enugma4));
		System.out.println(enugma4);

	}

}
