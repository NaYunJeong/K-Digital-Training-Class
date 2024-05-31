import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PMain1 {
	// 베스킨라빈스 31게임!
	// 유저 먼저 시작! (1 ~ 3 사이 정수)
	// main함수 사용
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Random r = new Random();
		int win = 0;
		int lose = 0;
		int selectNo = 0;
		int uNum = 0;
		int cNum = 0;
		
		a : while (true) {
			System.out.println("### 베스킨 ~ 라빈스 ~ 31 ###");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택> ");
			selectNo = k.nextInt();
			int count = 0;
			
			switch (selectNo) {
			case 1:
				while (true) {
					System.out.println("<< Your Turn >>");
					System.out.print("숫자 입력(1 ~ 3) : ");
					uNum = k.nextInt();
					for (int i = 0; i < uNum; i++) {
						count++;
						System.out.println(count + "!");
						if (count == 31) {
							System.out.println("패배");
							lose++;
							break;
						}
					}
					if (count >= 31) {
						break;
					}
					System.out.println("<< Computer Turn >>");
					cNum = r.nextInt(3) + 1;
					for (int i = 0; i < cNum; i++) {
						count++;
						System.out.println(count + "!");
						if (count >= 31) {
							System.out.println("승리");
							win++;
							break;
						}
						if (count >= 31) {
							break;
						}
					}
				}
					break;
			case 2:
				System.out.println("<< 전적 >>");
				System.out.println(" Win : " + win);
				System.out.println(" Lose : " + lose);
				break;
			case 3:
				System.out.println("종료합니다.");
				break a;
			default:
				System.out.println("error");
			}
		}
	}
}

