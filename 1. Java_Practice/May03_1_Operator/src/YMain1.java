import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
		
		// 예제1)
		// 오늘 기분은 어떤가요?
		// 오늘 컨디션 점수는?
		// 대중교통 몇 번 갈아타고 오셨는지?
		// 밤에 푹 주무셨는지 (잘 잤으면 true / 아니면 false)
		// 몇 시간 주무셨나요? (ex : 6.0시간)
		
		// Scanner로 입력을 받아서 출력까지 해보기!
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("오늘의 기분 : ");
		String feelings = keyboard.next();
		System.out.println("오늘의 기분 : " + feelings);
		
		System.out.print("오늘 컨디션 점수 : ");
		double conditionScore = keyboard.nextDouble();
		System.out.printf("오늘 컨디션 점수 : %.1f점 / 100점\n", conditionScore);
		
		System.out.print("대중교통 환승 횟수 : ");
		int numberOfTransfer = keyboard.nextInt();
		System.out.printf("대중교통 환승 횟수 : %d번\n", numberOfTransfer);
		
		System.out.print("숙면 여부 : ");
		boolean deepsleep = keyboard.nextBoolean();
		System.out.printf("숙면 여부 : %b\n", deepsleep);
		
		System.out.print("숙면 시간 : ");
		double sleepingHour = keyboard.nextDouble();
		System.out.printf("숙면 시간 : %.1f시간\n", sleepingHour);
		
		keyboard.close();
		
		

		
		
		
	}
}
