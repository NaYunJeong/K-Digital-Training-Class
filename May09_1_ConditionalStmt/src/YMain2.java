import java.util.Scanner;

public class YMain2 {
	// 예제1)
	// 정수 2개를 입력받아서 (각각의 함수에)
	// 그 정수 2개를 더했을 때 짝수면 결과 리턴, 아니면 값을 재입력
	
	public static int getNum() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num = keyboard.nextInt();
		return num;
	}
	public static int getNum2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("정수2 : ");
		int num2 = keyboard.nextInt();
		return num2;
	}
	public static int getResult(int num, int num2) {
		int result = num + num2;
		System.out.printf("두 수의 합 : %d\n", result);
//		return (result % 2 == 0) ? result : getResult(num, num2);
											// 원하는 값이 들어오지 않으면 무한 루프가 돌아감
											// => 처음 홀수를 입력한 값이 계속해서 계산되고 있기 때문
		return (result % 2 == 0) ? result : getResult(getNum(), getNum2());
	}
	public static void main(String[] args) {
		int num = getNum();
		int num2 = getNum2();
		int result = getResult(num, num2);
	}
}
