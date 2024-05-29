import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		
		// 예제1)
		// 이름을 입력 받아 
		// 그 이름이 '홍길동'이랑 같으면 true / false
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name1 = keyboard.next();
		System.out.printf("이름 : %s\n", name1);
		
		boolean name2 = (name1 == "홍길동") ;
		System.out.printf("이름이 홍길동인가? : %b\n", name2); // false
		// String 참조형 => Heap 영역의 자리번지수를 호출해 옴 (name1 의 자리번지수 == "홍길동"  => false!)
		
		// *** String 문자열이 같은지 비교
		// 대상의 값 자체를 비교하기 위해서 .equals()를 사용!
		boolean name3 = name1.equals("홍길동");
		System.out.printf("이름이 홍길동인가? : %b\n", name3);
		
		// shift (<<) : 옮기다, 이동하다.
		// ( 십진수 << 정수 )의 형태
		// << : 앞에 있는 수(십진수)를 2진수로 바꾸고, 뒤에 있는 수(정수)만큼 왼쪽으로 밀어라!
		// 비어있는(오른쪽) 칸 수를 0으로 채우고, 2진수를 다시 10진수로 바꿔라!
		
		// ex) 카페! (조건 검색)
		// 		24시간 : 1 << 0 = 1
		//		와이파이 : 1 << 1 = 2
		// 		흡연실 : 1 << 2 = 4
		//		주차장 : 1 << 3 = 8
		
		int c = (150 << 6); //  9600
		System.out.println(c);
		
		// * 연산자
		// 	- 단항 연산자 : a++, a--, !a, ...
		//	- 이항 연산자 : a + b, a > b, ...
		// 	- 삼항 연산자 : 조건을 따져서 값을 대입할 때 사용
		//			if문으로 대체가 가능함/ 문법이 길어짐
		// 			=> (조건식) ? 조건을 만족할 때 쓸 값 : 조건불성립시 쓸 값
		
		// 예제2)
		// 나이 값을 입력받아서
		// 나이가 20살 이상이면 '안녕하세요' 를 출력
		// 나이가 20살 미만이면 'NAGA!' 를 출력
		
		System.out.print("나이 : ");
		int age = keyboard.nextInt();
		System.out.printf("나이 : %d살\n", age);
		
		String result = (age >= 20) ? "안녕하세요" : "NAGA!"; // 삼항 연산자
		System.out.println(result);
		
		// 예제3)
		// 홍길동씨 : 1강의장
		// 나이가 짝수 : 1강의장
		// 나머지는 : 2강의장
		
		String classNo = (name1.equals("홍길동") || (age % 2 == 0)) ? "1강의장" : "2강의장";
		System.out.println(classNo);
		
		// 상자 하나에 야구공이 6개 들어갈 수 있습니다.
		// 공의 갯수를 입력받아서
		// 공을 모두 담을 상자의 갯수가 몇 개인지 출력
		// ex) 공이 49개 => 상자는 9개
		
		System.out.print("야구공 갯수 : ");
		int ball = keyboard.nextInt();
		int box = (ball % 6 == 0 ? ball / 6 : ball / 6 + 1);
		System.out.printf("%d개의 공을 넣는데 필요한 상자의 갯수 : %d 개\n", ball, box);
		
		
		
		
	
		
			
		
		
	
		
		
		
		
	}
}
