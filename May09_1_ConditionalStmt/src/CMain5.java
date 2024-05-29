import java.util.Scanner;

public class CMain5 {
	// 예제1)
	// 직업 : 
	//		DBA(상위 데이터베이스 관리자)
	//			전원관리
	//			백업/복구
	//			명령어로 CRUD
	//			서비스 활용
	//		DBP(데이터베이스 프로그래머)
	//			명령어로 CRUD
	//			서비스 활용
	//		DBU(사용자)
	//			서비스 활용
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("직업 : ");
		String job = keyboard.next();
		System.out.printf("[%s]\n", job);
		
		switch (job) {
		case "DBA":
			System.out.println("전원 관리");
			System.out.println("백업/복구");
		case "DBP":
			System.out.println("명령어로 CRUD");
		case "DBU":
		case "dbu":
			System.out.println("서비스 활용");
			break;
		default:
			System.out.println("DB ~ 손해보험 ~");
			break;
		}
	}
}
