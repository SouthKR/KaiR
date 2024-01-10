/*
 * 프로젝트명: 월리를 찾아라!!
String findWally =
“윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월
리월리윌리울리윌리울리일리울리울리윌리일리”;
위의 문자열 변수 findWally 중에 월리가 몇개 들어있는지 콘솔에 출력
 */
package practre;
import java.util.Scanner;
public class Result03 {
	String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
	int all = findWally.length();
//	int after = findWally.repeat		index = findWally.indexOf("월리", index);
//			((all - after)/2);
//	
	int wallyCount = 0;
	int index = 0;
	while (index != -1) {
		index = findWally.indexOf("월리", index);
		if (index != -1) {
			wallyCount++;
			index += "월리".length();
		}
	}
	System.out.println(wallyCount);
}