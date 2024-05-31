import java.util.Scanner;

public class YMain2 {
	public static void main(String[] args) {
		
		// 예제1)
		// 국어, 수학, 영어 점수를 각각 입력받아서 출력
		// + 총점과 평균점수까지 출력해보기!
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int korScore = keyboard.nextInt();
		System.out.printf("국어 점수 : %d점\n", korScore);
		
		System.out.print("수학 점수 : ");
		int mathScore = keyboard.nextInt();
		System.out.printf("수학 점수 : %d점\n", mathScore);
		
		System.out.print("영어 점수 : ");
		int engScore = keyboard.nextInt();
		System.out.printf("영어 점수 : %d점\n", engScore);
		
		System.out.printf("총 점 : %d점\n", korScore + mathScore + engScore);
		System.out.printf("평 균 : %.1f점\n", (double) (korScore + mathScore + engScore) / 3);
		
		// int ÷ int = int => 정수 나누기 정수는 무조건 정수값
		// 따라서 계산식 앞에 (double) 입력해주기! => 형 변환
		
		keyboard.close();
		
		
	}
}
