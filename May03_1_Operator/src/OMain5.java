import java.util.Scanner;

public class OMain5 {
	public static void main(String[] args) {
		
		// 예제1)
		// 키(cm), 몸무게(kg)을 입력받아서
		//			=> 비만도 검사 프로그램
		
		// 표준체중 = (키 - 100) * 0.9
		// 비만도 = (실제 체중 / 표준 체중) * 100
		// 비만도가 120을 넘으면 "비만",
		// 그렇지 않으면 "안비만" 문구를 출력
		// 아무 키나 입력했을 때 프로그램이 종료되도록!
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		System.out.print("몸무게 : ");
		double weight = keyboard.nextDouble();
		
//		System.out.printf("키 : %.1fcm\n", height);
//		System.out.printf("몸무게 : %.1fkg\n", weight);
		
		double stdWeight = (height - 100) * 0.9;
		double bmi = (weight / stdWeight) * 100;
		String result = (bmi > 120) ? "비만" : "안비만";
		System.out.printf("당신은 키가 %.1fcm, 몸무게가 %.1fkg으로 비만도가 %.1f라서 %s입니다.\n", height, weight, bmi, result);
		
		System.out.print("아무 키나 입력하세요 : ");
		String quit = keyboard.next();
		System.out.println("프로그램을 종료합니다.");

		
	}
}
