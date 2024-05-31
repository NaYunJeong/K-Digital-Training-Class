import java.util.Random;
import java.util.Scanner;

public class FMain3 {
	// 홀짝 게임 (함수.ver)
	
	// 랜덤한 동전 갯수 가져오기
	public static int shackCoin() {
//		Random r = new Random();			>>> 3줄을 아래 1줄로 요약가능!
//		int coin = r.nextInt(10) + 1;		>>> 처음에는 순차적으로 하고 나중에 요약해보자!!
//		return coin;
		return new Random().nextInt(10) + 1;
	}
	// 질문 & 답 입력
	public static String askUserAns() {
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("홀 or 짝 : ");
//		String userAns = keyboard.next();
//		return userAns;
		return new Scanner(System.in).next();
	}
	// 동전 갯수가 홀수면 '홀', 짝수면 '짝'
	public static String getAnswer(int coin) {
//		String answer = (coin % 2 == 1) ? "홀" : "짝";
//		return answer;
		return (coin % 2 == 1) ? "홀" : "짝";
	}
	// 비교해서 결과 내기
	public static String getResult(String userAns, String answer) {
//		String result = (userAns.equals(answer)) ? "정답" : "땡";
//		return result;
		return (userAns.equals(answer)) ? "정답" : "땡";
	}
	// 출력
	public static void printResult(int coin, String userAns, String answer, String result) {
		System.out.printf("동전은 %d개 !\n", coin);
		System.out.printf("내가 입력한 답 : %s !\n", userAns);
		System.out.printf("결과 : %s이라서 %s !\n", answer, result);
	}
	// 함수들 모으기
	public static void start() {
		int coin = shackCoin();
		String userAns = askUserAns();
		String answer = getAnswer(coin);
		String result = getResult(userAns, answer);
		printResult(coin, userAns, answer, result);
	}
	public static void main(String[] args) {
		start();	
	}
	

	
}
