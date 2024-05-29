import java.util.Scanner;

public class CMain7 {
	// f1 : 정수를 하나 입력 받아서
	// 그게 양수면 "양" / 0이면 "0" / 음수면 "음" 출력
	
	// f2 : 정수를 하나 입력 받아서
	// 	3의 배수면 "3의 배수"
	// 	4의 배수면 "4의 배수" => 공배수 생각
	// 	둘 다 아니면 "몰라!!!"
	// 	를 판정해주는 함수
	
	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.print("f1 : ");
		int f1 = k.nextInt();
		
		if (f1 > 0) {
			System.out.println("f1은 양");
		}
		else if (f1 == 0) {
			System.out.println("f1은 0");
		}
		else {
			System.out.println("f1은 음");
		}
	}
	
	public static void f2() {
		Scanner k = new Scanner(System.in);
		System.out.print("f2 : ");
		int f2 = k.nextInt();
	
//		if (f2 % 12 == 0) {
//			return "3의 배수 + 4의 배수";
//		} else if (f2 % 3 == 0) {
//			return "3의 배수";
//		} else if (f2 % 4 == 0) {
//			return "4의 배수";
//		}
//		return "몰라!!!!!!!!";
	}
	public static void main(String[] args) {
		f1();
//		Scanner k = new Scanner(System.in);
//		int f2 = k.nextInt();
//		if (f2 % 12 == 0) {
//			System.out.println("f2는 3, 4의 공배수");
//		}
//		else if (f2 % 3 == 0) {
//			System.out.println("f2는 3의 배수");
//		} 
//		else if (f2 % 4 == 0) {
//			System.out.println("f2는 4의 배수");
//		} 
//		else {
//			System.out.println("몰라!!!");
//		}
//		}
	}
}
