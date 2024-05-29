import java.util.Scanner;

public class FMain5 {
	// 쉬는날.. 방에서 게임을 하고 있는데 => 엄마가 심부름을 시켜요
	public static void makeErrand() {
		System.out.println("아들~");
		System.out.println("돈 줄테니까");
		System.out.println("슈퍼가서");
		System.out.println("라면이랑");
		System.out.println("참치 사고");
		System.out.println("남은 돈 가져와~");
		System.out.println("--------------------");
	}
	
	// 엄마가 돈을 주셨다 ! (돈 = 입력 받기)
	public static int takeMoney() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("엄마가 준 돈 : ");
		int money = keyboard.nextInt();
		System.out.printf("엄마가 %,d원을 주셨다!\n", money);
		System.out.println("--------------------");
		return money;
		// 정수(int)에 대한 값을 main함수에 return, 반환할거니까
		// return type을 int로 선택 
	}
	
	// 심부름 중에... (라면 : 3200원, 참치 : 2170원, 과자 : 1500원) 둘러보다가
	// 돈이 얼마 남는지 생각함...
	public static void doErrand(int money) {
		int ramen = 3200;
		int tuna = 2710;
		int snack = 1500;
		// 계산하는 함수
		// 계산이라는 작업을 하려면 '받아온 돈'이 필요
		// 그 돈은... 파라미터로 받아올 것!
		System.out.printf("심부름하면 %,d원이 남네...ㅎ\n", money - (ramen + tuna + snack));
		System.out.println("--------------------");
	}
	
	// 계산을 하고, 잔돈을 엄마한테 주자...
	public static int calculate(int money) {
		int ramen = 3200;
		int tuna = 2710;
		int snack = 1500;
		int bbingddang = 3000;
		
		int restMoney = money - (ramen + tuna + snack + bbingddang);
		return restMoney;
	}
	
	public static void main(String[] args) {
		makeErrand();
		int money = takeMoney();
		doErrand(money);
		int restMoney = calculate(money);
		System.out.println(restMoney);
	}
	
	// 함수를 표현하는 4가지 방식!(그림판_1.기능만 있는 함수_2.)
	
	// 왜 함수를 나누어서 사용할까요?
	// 1. 함수를 나눔으로써 보기 편하게
	// 2. 오류 발견이 쉬워
	// 3. 역할 나눔
	// 4. 다른 곳에서 사용하기 위해
	
	// main함수에 코드를 최대한 짧게 구성하기 위해서
	// 기능들을 묶어서 함수라는 것으로 사용!
	// 기능을 나눠서 효율적으로 사용!
	//	=> 하나의 함수에는 하나의 기능만 구현해야 함!
	
}
