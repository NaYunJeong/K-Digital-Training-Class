import java.util.Scanner;

// Coder : 개발자 (단지 코드만 잘 짜는 사람)
// Programmer : Coder + 설계 ***

// OOD (Object Oriented Design) - 객체 지향 디자인
//	실생활을 디자인하여 코드로 나타냄

public class OMain1 {
	public static void main(String[] args) {
		// 의사 (이름, 나이)
		Doctor d = new Doctor();
		d.name = "김의사";
		d.age = 66;
		d.printDoctor();
		// 손님(이름, 나이)
		Guest g = new Guest();
		g.name = "이환자";
		g.age = 35;
		g.printGuest();
		
		d.start(g);
	}
}
