import java.util.Scanner;

public class KIMain1 {
	public static void main(String[] args) throws InterruptedException {
		// Scanner : Java에 내장되어있는 기능 중 하나
		// 이 Scanner 기능을 사용하기 위해서 1번에 'import' 라는 것이 사용됨
		// 이 Scanner라는 것을 사용하려면 조건이 하나 필요한데...
		// new ~~~ : 객체
		
		// Scanner는 화면(이클립스의 콘솔창)으로부터 
		//		데이터를 입력 받는 기능
		
		Scanner keyboard = new Scanner(System.in); // Scan + 자동완성 -> 첫번째/ sys + 자동완성 -> system/ .in 
		// system.in : 시스템 안으로 집어넣겠다 (입력)
//		System.out.println( ); // system.out : 시스템 밖으로 빼내겠다 (출력)
		
		// 이름을 콘솔창에 입력받아서 출력
		System.out.print("이름 : ");
		String name = keyboard.next(); // nex + 자동완성
		System.out.printf("이름 : %s\n", name);
		
		// 예제1)
		// 키, 몸무게, 신발사이즈, 여행가고싶은곳
		// 좋아하는 숫자, 퇴근하고싶은지 유무
		// 를 입력받고 변수에 담아서 출력해보기 (힌트/ 정수, 실수 => next + 자동완성 => ~~~~)
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		System.out.printf("키 : %.1fcm\n", height);
		
		System.out.print("몸무게 : ");
		double weight = keyboard.nextDouble();
		System.out.printf("몸무게 : %.1fkg\n", weight);
		
		System.out.print("신발사이즈 : ");
		int shoesSize = keyboard.nextInt();
		System.out.printf("신발사이즈 : %dmm\n", shoesSize);
		
		System.out.print("여행 가고 싶은 곳 : ");
		String tripPlace= keyboard.next();
		System.out.printf("여행 가고 싶은 곳 : %s\n", tripPlace);
		
		System.out.print("좋아하는 숫자 : ");
		int likeNum = keyboard.nextInt();
		System.out.printf("좋아하는 숫자 : %d\n", likeNum);
		
		System.out.print("퇴근 하고 싶은지 여부 : ");
		boolean wannaGoHome = keyboard.nextBoolean();
		System.out.printf("퇴근 하고 싶은지 여부 : %b\n", wannaGoHome);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		// 예제2)
		// bat파일 생성 =>
		// '끄고 싶으면 아무거나 입력하세요 : '
		// 뭔가를 입력해서 엔터 치면
		// 1초마다 .이 나온 후 (3번)
		// '프로그램을 종료합니다' 라는 메시지가 출력되고
		// 0.5초 후에 프로그램이 종료
		System.out.print("끄고 싶으면 아무거나 입력하세요 : ");
		String quit = keyboard.next();
		keyboard.close(); // 있어도 되고... 없어도 되고...
		
		System.out.printf("끄고 싶으면 아무거나 입력하세요 : %s\n", quit);
		
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
		
		System.out.println("프로그램을 종료합니다.");
		Thread.sleep(500);
		
		
	}
}
