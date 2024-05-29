import java.util.Random;
import java.util.Scanner;

public class FMain4 {
	// 동전 맞추기 게임
	
	// 동전 10개 섞기
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10) + 1;
//		return coin;
		return new Random().nextInt(10) + 1;
	}
	// 질문 & 답 입력
	public static int askUserAns() {
//		Scanner keyboard = new Scanner(System.in);
		System.out.print("동전 개수는? : ");
//		int userAns = keyboard.nextInt();
//		return userAns;
		return new Scanner(System.in).nextInt();
	}
	// 답 맞춰보기
	public static String getResult(int userAns, int coin) {
//		String result = (userAns == coin) ? "정답" : "땡";
//		return result;
		return (userAns == coin) ? "정답" : "땡";
	}
	// 결과 출력
	public static void printResult(int userAns, int coin, String result) {
		System.out.printf("랜덤 동전 개수 : %d개\n", coin);
		System.out.printf("내가 입력한 동전 개수 : %d개\n", userAns);
		System.out.printf("그래서 결과는... [%s]입니다.\n", result);
	}
	public static void start() {
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(userAns, coin);
		printResult(userAns, coin, result);
	}
	public static void main(String[] args) {
		start();
	}
}
