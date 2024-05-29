import java.util.Scanner;

public class CMain4 {
	
	// switch-case (ex: 권한 설정 _ 할때 일반적으로 사용)
	
	// 예제1)
	// Scanner로 입력 받을 것!
	// "이병" 입력 => 눈치, 관등성명, 훈련, 잠
	// "일병" 입력 => 관등성명, 훈련, 잠
	// "상병" 입력 => 훈련, 잠
	// "병장" 입력 => 잠
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("계급 : ");
		String grade = keyboard.next();
		System.out.println(grade);
		
		switch (grade) {
		case "이병":
			System.out.println("눈치보기");
//			break;							=> break를 지우면 break 걸릴때까지 아래방향으로 계속 실행됨
		case "일병":
			System.out.println("관등성명");
//			break;
		case "상병":
			System.out.println("훈련");
//			break;
		case "병장":
			System.out.println("잠");
			break;
		default:
			System.out.println("계급은 모르겠고.. 돈많은 백수가 꿈입니다..");
			break;
		}
	}
}
