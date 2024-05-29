import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PMain7 {
	// 거스름돈 환전 프로그램
	// 함수 사용 
	
	// <입력>
	// 구매한 물건 가격 : 35000
	// 낸 돈 : 41530
	// ------------------------------
	// 거스름돈 : 6530 을
	//		50000 : 0
	//		10000 : 0
	//		5000 : 1
	//		1000 : 1
	//		500 : 1
	//		100 : 0
	// 		50 : 0
	//		10 : 3
	//		0개짜리는 출력 X!
	
	// 1. 물건 가격 입력 함수
	public static int getPrice() {
		Scanner k = new Scanner(System.in);
		System.out.print("물건 가격 : ");
		int price = k.nextInt();
		return price;
	}
	
	// 2. 지불한 돈 입력 함수
	public static int payMoney(int price) {
		Scanner k = new Scanner(System.in);
		System.out.print("지불한 돈 : ");
		int money = k.nextInt();
		if (money < price) {
			System.out.println("돈이 부족합니다. 다시 입력하세요.");
		}
		return (money >= price) ? money : payMoney(price);
	}		
	
	// 3. 거스름돈 계산 함수
	public static int getChange(int price, int money) {
		return money - price;
	}
	
	// 4. 위에 3개 출력
	public static void printResult(int price, int money, int change) {
		System.out.println("--------------------");
		System.out.printf("물건 가격 : %,d원\n", price);
		System.out.printf("낸 돈 : %,d원\n", money);
		System.out.printf("거스름돈 : %,d원\n", change);
		System.out.println("--------------------");
	}
	
	// 거스름돈을 화폐에 따라 어떻게 줄 것인지
	public static void printChange(int change) {
		// 2가지 방법
		//	1. 
//		int[] currency = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		for (int i = 0; i < currency.length; i++) {
//			if (change >= currency[i]) {
//				System.out.printf("%d원권 : %d개\n", currency[i], (change / currency[i]));
//				change %= currency[i];
//			}
//		}
		
		//	2.
		int currency2 = 100000;
		while (true) {
			currency2 /= 2;
			if (change >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2, (change / currency2));
				change %= currency2;
			}
			
			currency2 /= 5;
			if (change >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2, (change / currency2));
				change %= currency2;
			}
			
			if (currency2 == 10) {
				break;
			}
		}
	}
	
//	public static void countBill(int change) {
//		if (change / 50000 > 1) {
//		}
//	}
	public static void main(String[] args) {
		int price = getPrice();
		int money = payMoney(price);
		int change = getChange(price, money);
		printResult(price, money, change);
		printChange(change);
		
	}
}
