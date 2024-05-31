import java.util.Arrays;
import java.util.Scanner;

// Bubble Sort : 인접한 두 항목의 값을 비교해서
//				기준에 만족하면 서로의 값을 교환하는 정렬 방법

public class PMain3 {
	// 함수 사용
	// 숫자를 입력받아서 배열에 담을 것 (숫자는 5개, 중복 X)
	// 정렬 전의 값을 출력
	// 정렬
	// 정렬 후의 값을 출력
	
	// 숫자를 입력받아서 배열에 담을 것 (숫자는 5개, 중복 X)
	public static int[] getNum() {
		Scanner k = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			num[i] = k.nextInt();
		}
		System.out.println();
		System.out.println("---------------");
		return num;
	}
	
	// 정렬 전의 값을 출력
	public static void printNum(int[] num) {
		System.out.println("<< 입력한 값 >>");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("---------------");
		}

	// 정렬
	public static int[] getResult(int[] num) {
		int t = 0;
		for (int turn = 1; turn < num.length; turn++) {
			System.out.printf("<%d턴>\n", turn);
			for (int i = 0; i < num.length - 1; i++) {
				// num.length - 1 : if문 안에서 계산을 할 때,
				// 다음 배열값을 비교하기 위해서 +1을 사용하는데
				// length 길이를 그대로 사용하면 error 발생
				if (num[i] > num[i+1]) {
					t = num[i];
					num[i] = num[i + 1];
					num[i + 1] = t;
				}
				System.out.print(num[i] + " ");
			}
			System.out.println(num[4]);
			System.out.println("정렬된 값 : " + t);
			System.out.println("---------------");
		}
		return num;
	}
	
	// 정렬 후의 값을 출력
	public static void printResult(int[] result) {
		System.out.println("<< 정렬 후 값 >>");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		System.out.println("---------------");
		}
	
//	public static void arrange1(int n1, int n2, int n3, int n4, int n5) {
//		for (int i = 1; i <= 5 ; i++) {
//			System.out.printf("%d 턴", i);
//			if (n1 > n2) {
//				System.out.printf("%d %d %d %d %d\n", n2, n1, n3, n4, n5);
//			} else if (n2 > n3) {
//				System.out.printf("%d %d %d %d %d\n", n1, n3, n2, n4, n5);
//			} else if (n3 > n4) {
//				System.out.printf("%d %d %d %d %d\n", n1, n2, n4, n3, n5);
//			} else if (n4 > n5) {
//				System.out.printf("%d %d %d %d %d\n", n1, n2, n3, n5, n4);
//			}
//		}
//	}
	public static void main(String[] args) {
		int[] num = getNum();
		printNum(num);
		int[] result = getResult(num);
		printResult(result);
		
		// 사실상 크게 의미가 없음...
		// 성능에서 효과가 없기 때문
		
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}

		// Bubble Sort : 코딩 테스트용으로만 사용됨 / 실무에서는 사용 X 
		// 선택정렬, 삽입정렬, 퀵정렬, 합병정렬, ...
	}
}
