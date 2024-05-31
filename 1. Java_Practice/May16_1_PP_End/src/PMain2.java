import java.util.Random;
import java.util.Scanner;

// Up&Down 게임(함수 사용)
// 컴퓨터 1 ~ 100 사이의 숫자를 뽑음 (ex : 34)
// 유저가 입력
//		1트 : 50 => down!
//		2트 : 20 => up!
//		...
//		10트 : 34 => 정답 !
// 몇 번만에 맞췄는지 출력

public class PMain2 {
	public static void start() {
		System.out.println("***** Up & Down *****");
	}
	
	public static int getNum() {
		Random r = new Random();
		int comNum = r.nextInt(100) + 1;
		return comNum;
	}
}
//	public static void getUserAns() {
//		Scanner k = new Scanner(System.in);
//		int answer = 0;
//		
//		for (int i = 0; true; i++) {
//			System.out.println("----------------------");
//			System.out.printf("%d트 : ", i + 1);
//			answer = k.nextInt();
//			if (answer < 1) {
//				System.out.println("정답은 1 이상이어야 합니다.");
//			} else if (answer > 100) {
//				System.out.println("정답은 100 이하여야 합니다.");
//			}
//			return (answer >= 1 && answer <= 100) ? answer : getUserAns();
//		}
//	}
//
//	public static boolean checkAnser(int comNum, int answer) {
//		if (comNum == answer) {
//			System.out.print("정답은 ");
//			return true; 	// 정답일 때 true값을 리턴하면서 종료되게
//		} else if (comNum > answer) {
//			System.out.println("Up !");
////			return false;	// 정답이 아닐 때 false값을 리턴하면서 게임이 계속 진행되도록
//		} else {
//			System.out.println("Down !");
////			return false;
//		}
//		return (comNum == answer);	// 이 조건에 맞을 때 true값을 리턴하고,
//									// 조건에 맞지 않으면 false값을 리턴
//	}
//	
//	// 정답을 맞출때까지 반복하는 함수
//	public static void printResult() {
//		int comNum = getNum();
//		int answer = 0;
//		int turn = 0;
//		
//		while (true) {
//			turn++;
//			answer = getUserAns(comNum);
//			if (checkAnser(comNum, answer)) {
//				System.out.printf("[%d] !\n", comNum);
//				System.out.printf("%d번 만에 정답 !\n", turn);
//				break;
//			}
//		}
//	}
//			if (answer > comNum) {
//				System.out.println("down !");
//			} else if (answer < comNum) {
//				System.out.println("up !");
//			} else {
//				System.out.println("정답 !");
//				System.out.println("======================");
//				System.out.printf("총 %d번만에 정답을 맞추셨습니다!\n", i + 1);
//				System.out.println("======================");
//				break;
//			}
//		}
//	}
//	
//	public static void all() {
//		start();
//		int comNum = getNum();
//		getUserAns(comNum);
//	}
//	
//	public static void main(String[] args) {
//		all();
//	}
//}
