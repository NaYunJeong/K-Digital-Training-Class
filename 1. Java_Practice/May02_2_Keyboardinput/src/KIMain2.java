import java.util.Scanner;

public class KIMain2 {
	public static void main(String[] args) throws InterruptedException {
		// 예제1)
		// 메뉴판 (분식집)
		// 떡볶이, 순대, 어묵, 튀김, ...
		// 가격을 입력받아서 
		// 메뉴판 모양으로 예쁘게 출력해보기
		System.out.println("=====================");
		System.out.println("\t메뉴판\t\t");
		System.out.println("=====================");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("§떡볶이 : ");
		int ddukbokyee = keyboard.nextInt();
		System.out.printf("§떡볶이\t: %,7d원\t\n", ddukbokyee);
		System.out.print("§순대 : ");
		int soondae = keyboard.nextInt();
		System.out.printf("§순대\t: %,7d원\t\n", soondae);
		System.out.print("§어묵 : ");
		int umok = keyboard.nextInt();
		System.out.printf("§어묵\t: %,7d원\t\n", umok);
		System.out.print("§튀김 : ");
		int fried = keyboard.nextInt();
		System.out.printf("§튀김\t: %,7d원\t\n", fried);
		System.out.print("§쿨피스 : ");
		int coolpis = keyboard.nextInt();
		System.out.printf("§쿨피스\t: %,7d원\t\n", coolpis);
		
		
		System.out.println("=====================");
		System.out.println("     ♥감사합니다♥     ");
		System.out.println("=====================");
		
		keyboard.close();
		
		Thread.sleep(5000);
		


		
	}
}
