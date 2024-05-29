import java.util.Scanner;

public class PMain2 {

	// ATM기능을 하는 프로그램
	//	1을 고르면 입금 / 2를 고르면 출금 / 3을 고르면 잔액 확인 / 4번을 고르면 프로그램 종료
	//	입금, 출금 돈 값을 입력 받을 것!
	// main 함수에 만들기
	
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		int money = 0;
		int choice = 0;
		
		while (true) {
			System.out.print("메뉴 : 1)입금액 2)출금액 3)잔액확인 4)프로그램종료\n");
			System.out.print("메뉴선택 : ");
			choice = k.nextInt();
			
			if (choice == 1) {
				System.out.print("예금액 : ");
				int plusMoney = k.nextInt();
				System.out.printf("\t%,d원을 예금합니다.", plusMoney);
				money += plusMoney;
			} else if (choice == 2) {
				System.out.print("출금액 : ");
				int minusMoney = k.nextInt();
				System.out.printf("\t%,d원을 출금합니다.", minusMoney);
				money -= minusMoney;
				if (money < 0) {
					System.out.println("잔고가 모자랍니다. 출금에 실패했습니다.");
					money += minusMoney;
				}
			} else if (choice == 3) {
				System.out.printf("\t%,d원이 남아있습니다.");
			} else if (choice == 4) {
				System.out.println("\t프로그램 종료 !");
				break;
			}
		}
	}
}