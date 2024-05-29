import java.util.Scanner;

// main함수에서 진행
// 1을 입력하면 학생 수 값을 입력 받을 수 있게
// 2를 입력하면 각 학생들의 점수를 입력 받을 수 있게 (점수 범위 고려 X)
// 3을 입력하면 학생들의 점수리스트를 출력할 수 있게 (ex: 1번 학생 점수 : 50점)
// 4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있게
// 5를 입력하면 프로그램 종료

public class PMain6 {
	public static void main(String[] args) {
		
		// 쌤 풀이
		Scanner k = new Scanner(System.in);
		int selectNo = 0;
		int studentNum = 0;
		int[] scores = null;	// 참조형의 기본값 = null
		
		a : while (true) {
			System.out.println("1)학생수 2)점수입력 3)점수리스트 4)분석 5)종료");
			System.out.print("선택> ");
			selectNo = k.nextInt();
			
			switch (selectNo) {
			case 1:
				System.out.print("학생 수 : ");
				studentNum = k.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%d번 학생 점수 입력 : ", i + 1);
					scores[i] = k.nextInt();
				}
				break;
			case 3:
				int index = 1;
				for (int i : scores) {
					System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i : scores) {
					sum += i;
					max = (max < i) ? i : max;
				}
				avg = (double) sum / scores.length;
				System.out.printf("최고 점수 : %d점\n", max);
				System.out.printf("평균 점수 : %.2점\n", avg);
				break;
			case 5:
				System.out.println("종료합니다.");
				System.out.println("=======================");
				break a;
			default:
				System.out.println("=======================");
				System.out.println("잘못 입력했으니 다시 입력하세요.");
				break;
			}
		}
	}
}
		
		//내 답
//		int[] num = new int[5];
//		int[] sNum = new int[0];
//		int[] score = new int[0];
//		int max = num[0];
//		int avg = num[0];
//		
//		for (int i = 0; i < args.length; i++) {
//			num[i] = k.nextInt();
//			System.out.printf("번호 입력 : %d\n", num[i]);
//			if (num[i] == 1) {
//				sNum = new int[i];
//				sNum[i] = k.nextInt();
//				System.out.printf("학생 수 : %d\n", sNum[i]);
//			}
//			if (num[i] == 2) {
//				score[i] = k.nextInt();
//				System.out.printf("학생 점수 : ", score[i]);
//			}
//			if (num[i] == 3) {
//				System.out.printf("%d번 학생 점수 : %d점", i, score[i]);
//			}
//			if (num[i] == 4) {
//				max = num[i];
//			}
//			System.out.println();
//			}
//		}
		
		
		

