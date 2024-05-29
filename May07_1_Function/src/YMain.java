import java.util.Random;
import java.util.Scanner;

public class YMain {
	// 예제1)
	// 홀짝게임 만들기!
	// 		동전 10개를 쥐고 있다가! => 섞어서 동전갯수 고름
	//		내가 '홀'이라고 하면...
	// 		정답안지 아닌지 판정해서 그 결과를 출력해주는 프로그램
	public static void main(String[] args) {
		
		Random r = new Random();
		int i = r.nextInt();		// int 범위 안에 있는 랜덤한 숫자하나를 뽑아 변수에 담아내겠다
		int i2 = r.nextInt(5);		// 0 ~ 4(5개의 숫자) 중 랜덤한 정수
		int i3 = r.nextInt(5)/+1; 	// 1 ~ 5 중 랜덤한 정수
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		// 입력받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		// 랜덤하게 동전을 뽑을 준비
		Random r1 = new Random();
		
		// 지정한 갯수 중에서 랜덤한 동전 갯수를 뽑기
		int coin = r1.nextInt(10)/+1;
//		System.out.println(coin);
		
		// 동전 갯수가 홀수면 '홀', 짝수면 '짝'
		String answer = (coin % 2 == 1) ? "홀" : "짝";
//		System.out.println(answer);
		
		// 답을 맞출 수 있게 입력
		System.out.print("홀 or 짝 : ");
		String userAns = keyboard.next();
//		System.out.println(userAns);
		
		// 결과를 맞춰봐야! (컴퓨터가 뽑은 정답과 내가 입력한 정답이 같은지 확인)
		String result = (answer.equals(userAns)) ? "정답" : "땡"; 
		System.out.printf("뽑은 동전은 %d개이므로, %s!", coin, result);
		
		
	}
}
