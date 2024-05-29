import java.util.Scanner;

public class RMain4 {

	// 누구 :  
	//		매니저 -> 시스템관리/ 학생관리/ 수업관련 업무
	//		강사	 -> 학생관리/ 수업관련 업무
	//		학생  -> 수업관련 업무
	//				를 반복하다가 "끝"이라고 입력하면 프로그램이 종료!
	
	public static void main(String[] args) {
		
	Scanner k = new Scanner(System.in);
	String role = null;
	a : while (true) {
		// 반복문에 이름 붙이기 => 반복문 앞에 [이름] [:]  a :
		System.out.print("누구? : ");
		role = k.next();
		switch (role) {
		case "매니저":
			System.out.println("시스템관리");
		case "강사":
			System.out.println("학생관리");
		case "학생":
			System.out.println("수업관련 업무");
			break;
		case "끝":
			System.out.println("프로그램 종료 !");
//			break;		// 무조건 가까운 위치의 문법(switch)을 종료
			break a; 	// break 뒤에 반복문의 이름을 붙이면 반복문이 종료!
		}
	}
	System.out.println("--------------------------");
	
	bb : for (int i = 0; i <3; i++) {
		aa : for (int j = 0; j < 3; j++) {
			for (int j2 = 0; j2 < 3; j2++) {
				System.out.printf("%d %d %d\n", i, j, j2);
				if (i == 1) {
					System.out.println("중단 !");
					
//					break;		// ? 000, 001, 002, ..., 010, ..., 중단!, 222
//					break aa;	// ? 000, ..., 중단!, ..., 22
					break bb; 	// ? 000, ..., 중단!
				}
			}
			
		}
	}


	
	}
}
