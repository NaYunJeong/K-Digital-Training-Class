import java.util.Scanner;

public class YMain1 {
	
	// 예제1)
	// (3보다 작은) 정수를 하나 입력받는 함수
	// 3보다 크거나 같을  때 => 정수를 다시 입력 받을 수 있도록!
	public static int getNum() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("3보다 작은 정수 입력 : ");
		int num = keyboard.nextInt();
		return (num < 3) ? num : getNum();
//		int answer = (a < 3) ? a : (getNum());
//		return answer;
	}
	
	// 홀수만 입력 받을 수 있는 함수
	// 	=> 짝수를 입력하면 다시 입력 받을 수 있도록!
	public static int getNum2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("홀수 입력 : ");
		int num = keyboard.nextInt();
		return (num % 2 == 1) ? num : getNum2();
//		int answer2 = (b % 2 == 1) ? b : (getNum2());
//		return answer2;
	}
	
	// 정수를 입력받는 함수 => 0 ~ 100
	//	=> 범위안의 정수가 아니라면 다시 입력 받을 수 있도록!
	public static int getNum3() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("0 이상 100이하의 정수 입력 : ");
		int num = keyboard.nextInt();
		return ((num >= 0) && (num <= 100)) ? num : getNum3();
//		int answer3 = ((c >= 0) & (c <= 100)) ? c : (getNum());
//		return answer3;
	}
	
	public static void main(String[] args) {
		int num1 = getNum();
		System.out.println(num1);
		int num2 = getNum2();
		System.out.println(num2);
		int num3 = getNum3();
		System.out.println(num3);
	}
}
