import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RMain1 {
	
	// Up & Down 게임 (main에)
	// 1 ~ 100 사이의 숫자
	// 컴퓨터 vs 나 => 같은 숫자내면 종료
	// 		숫자가 나보다 낮으면 Down
	//		숫자가 나보다 높으면 Up
	// 		몇 턴만에 정답을 찾았는지 출력
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(100)+1;
		Scanner k = new Scanner(System.in);
		
		int myNum = 0;
		for (int turn = 1; true; turn++) { // 몇 번 반족할지 모르기 때문에
										   // 조건을 지정할 수 없음  => true로 자리 매워줌
			System.out.print("숫자 입력(1~100) : ");
			myNum = k.nextInt();
			
			if (num > myNum) {
				System.out.println("Up !");
			} else if (num < myNum) {
				System.out.println("Down !");
			} else {
				System.out.printf("%d턴만에 정답 !!\n", turn);
				break;		// 반복문을 깨버림
			}
			System.out.println("*************************");
		}
	}
}
