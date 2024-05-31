import java.util.Random;
import java.util.Scanner;

public class PMain5 {
	// 로또(함수사용)
	// 컴퓨터가 1 ~ 45 사이의 정수 중 6개 숫자를 뽑음 (중복X)
	// 유저가 숫자 6개를 입력
	// 6개 일치 : 1등 / 5개 일치 : 2등/ 4개 일치 : 3등 / 그 외 : 꽝
	//		=> 출력
	
	
	public static void startLotto() {
		System.out.println("<<  Lotto  >>");
	}
	
	// 쌤 답
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		int num = k.nextInt();
		if (num < 1 || num > 45) {
			System.out.print("다시 입력 : ");
		}
		return (num >= 1 && num <= 45) ? num : getNum();
	}
	
	public static int[] getNums() {
		int[] myAnswer = new int[6];
		for (int i = 0; i < myAnswer.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			myAnswer[i] = getNum();
		}
		return myAnswer;
	}
	
	public static void printMyAnswer(int[] myAnswer) {
		for (int i : myAnswer) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		System.out.println("=================================");
	}
	
	public static int[] getLotto() {
		int[] lottoNum = new int[6];
		Random r = new Random();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45) + 1;
			// 앞의 배열요소와 뒤의 배열요소의 값을 구분하기 위해서 반복문 추가
			for (int j = 0; j < i; j++) { // 인덱스값이 하나 덜 나오게 해야 비교 가능
				System.out.println(lottoNum[j] + " " + lottoNum[i]);
				
				// i번째에서 뽑은거랑 이전꺼에서 뽑은 값을 비교해서
				if (lottoNum[j] == lottoNum[i]) {
					i--; // 중복된 값이 있으면 제거하고 첫번째 for문으로 가서 다시 뽑는다
				}
			}
//			System.out.printf("컴퓨터가 뽑은 정수%d : %d\n", i + 1, comNum[i]);
		}
		return lottoNum;
	}
	
	public static void printLottoNum(int[] lottoNum) {
		System.out.println("로또 번호");
		for (int i : lottoNum) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		System.out.println("=================================");
	}
	
	// 입력한 번호와 랜덤으로 뽑힌 번호를 모든 경우의 수로 값이 같은지 비교
	// 같은 경우에는 카운트 올리기
	public static int checkNum(int[] myAnswer, int[] lottoNum) {
		int count = 0;
		for (int i = 0; i < lottoNum.length; i++) {
			for (int j = 0; j < myAnswer.length; j++) {
				if (lottoNum[i] == myAnswer[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	//////////////////// 내 답
//	public static void getUser() {
//		Scanner k = new Scanner(System.in);
//		int[] userNum = new int[6];
//		for (int i = 0; i < userNum.length + 1; i++) {
//			userNum[i] = k.nextInt();
//			System.out.print("정수 입력 : ");
//			for (int j = 0; j < userNum.length; j++) {
//				System.out.println(userNum[j] + " ");
//			}
//			System.out.printf("내가 뽑은 정수%d : %d\n", i + 1, userNum[i]);
//		}
//	}
//	
	public static void printResult(int count) {
		System.out.printf("%d개 맞춰서...", count);
		if (count == 6) {
			System.out.println("1등 !");
		} else if (count == 5) {
			System.out.println("2등 !");
		} else if (count == 4) {
			System.out.println("3등 !");
		} else {
			System.out.println("꽝 !");
		}
	}
	
	public static void activate() {
		startLotto();
		int[] lottoNum = getLotto();
		int[] myAnswer = getNums();
		printMyAnswer(myAnswer);
		printLottoNum(lottoNum);
		int count = checkNum(myAnswer, lottoNum);
		printResult(count);
	}
	
	public static void main(String[] args) {
		activate();
	}
	
	
}
