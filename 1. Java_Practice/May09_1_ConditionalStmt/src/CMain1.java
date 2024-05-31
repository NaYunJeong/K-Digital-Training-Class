import java.util.Scanner;

public class CMain1 {
	// 국어 시험 점수를 입력해서 받아오는 함수
	public static int getKorean() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = keyboard.nextInt();
		// 점수에는 (-)점수가 없기 때문에
		return (kor >= 0 && kor <= 100) ? kor :getKorean();
	}
	
	// * 조건문
	// 작성한 코드를 조건에 따라 코드의 실행 흐름을 다르게 동작하도록 제어하는 문법
	// - if문 : 조건식의 결과가 true, false로 실행문을 결정
	// 조건문 작성 시 조건 순서 생각하면서 작성
	
//	if (조건 A) {
//		=>조건 A가 성립했을때(true일 때), {} 중괄호 안쪽 이 부분을 실행
//	} else if (조건 B) {
//		=>조건 A(false) => 조건 B가 성립했을때 {} 이 부분을 실행
//	} else if (조건 C) {
//		=>조건 A(false), 조건 B(false) => 조건 C가 성립했을때 {} 이 부분을 실행
//	} else {
//		=>맞는 조건이 하나도 없으면 이 부분을 실행
//	}
	
	public static void main(String[] args) {
		int kor = getKorean();
		System.out.println(kor);
		
		// 예제1)
		// 국어점수가...
		// 60점 미만이면 '가'
		// 60점 이상이면 '양'
		// 70점 이상이면 '미'
		// 80점 이상이면 '우'
		// 90점 이상이면 '수' 출력
		if (kor >= 90) {
			System.out.println("국어 성적 평가 : 수");
		}
		else if (kor >= 80) {
			System.out.println("국어 성적 평가 : 우");
		}
		else if (kor >= 70) {
			System.out.println("국어 성적 평가 : 미");
		}
		else if (kor >= 60) {
			System.out.println("국어 성적 평가 : 양");
		}
		else {
			System.out.println("국어 성적 평가 : 가");
		}
		System.out.println("================");
		
		// 예제2)
		// 국어 점수가 50점이 안되면 욕, 아니면 칭찬
		//  + 점수가 50점 이상 60점 미만이면 아쉬운 소리
		//  + 점수가 30점 미만이면 퇴학처리
		// if문 안에 if문을 또 사용하는 것이 가능!
	
		// if - if문   vs   if - else문 차이
		
		// if - if : 각각 다른 조건문으로 해석해서 수행하게 됨 (비효율적)
		if (kor < 50) {
			System.out.println("욕");
		}
		if (kor >= 50) {
			System.out.println("칭찬");
		}
		
		// if - else : 하나의 조건이 만족되면 나머지 부분은 수행하지 않음 (효율적)
		if (kor < 50) {
			System.out.println("XXXXX!");
			if (kor < 30) {
				System.out.println("퇴학");
			}
		}
		else {
			System.out.println("Good♥!");
			if (kor < 60) {
				System.out.println("조금만 더 열심히 하지 그랬니?");
			}
		}
	}
}
