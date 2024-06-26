
public class VMain1 {
	public static void main(String[] args) {
		// 컴퓨터의 장치 !!
		// CPU / HDD(하드디스크) / RAM / GPU(그래픽카드)
		
		// CPU : 연산장치 (Intel : i5-xxxx, / AMD : RyzenX)
		// HDD(SSD) : 파일 형태로 저장(장치) => 영구 저장
		// RAM : 변수 형태로 저장(장치) => 임시 저장
		// GPU : 그래픽처리용 (CPU + HDD + RAM)
		
		// 데이터를 임시보존 => RAM에 변수로 저장!
		// 데이터를 영구보존 => HDD에 파일로 저장!
		//		=> 그래서 변수가 뭐야?!?!
		
		// syso로 글자나 숫자를 출력했을 때 -> 휘발성(1회용)임 => 재사용이 안됨!
		System.out.println("ㅋ" + "ㅎ" + "ㅁㄴㅇㄹㄴㅇㅁㅇ");
		System.out.println(3 + 2 + 5 - 2 / 10 * 20 + 15 + 79);
		// 계산을 하다가 ... 그 결과 값이 100줄 뒤에 필요하다면...? 그럴때 사용하는 것이 바로,
		
		// 변수! (Variable) : 데이터를 저장하는 공간(그릇)
		
		// 왜? (X) 보다는 언제? (O) 만들어졌는지를 유의해서 보자. (사과는 영어로 apple => 왜? 라고 하지마...)
		
		// * 변수 문법 (어떻게 사용하는지)
		// 1. 변수 선언 - RAM에 공간을 확보해서 무언가를 담을 수 있는 공간을 만든다!
		// 		=> (자료형 변수명;)의 형태를 변수를 '선언' 했다 라고 표현
		// 		=> (그릇종류 그릇이름;)
		
		// 2. 변수 초기화
		
		// 변수에 값을 넣어줘야 하는데...
		//		=> (변수명 = 값;)의 형태로 표현
		//	- 자료형 : 변수가 어떤 값으로 저장할지 그 형태
		//	- 변수명 : 말 그대로 변수의 이름
		//		String s; : 문자열(String)을 담을 그릇 s
		// 		int i; : 정수(int)를 담을 그릇 i
		
		// 변수 선언과 초기화를 동시에 하는 것도 가능 ~
		// (자료형 변수명 = 값;)의 형태
		// ===>>> 이 형태를 변수로 만든다! 라고 표현하기로 합시다~
		
		// * 변수명 짓는 규칙
		// 1. 숫자로 시작하면 에러 발생
		// int i = 3;
		// int 10 = 3; (X)
		// int 10i = 3; (X)
		// int i10 = 3;
		
		// 2. 특수문자, 띄어쓰기가 들어가면 에러 발생
		// String s = "ㅋㅋ";
		// String ★ = "ㅋㅋ"; (X)
		// String u u = "ㅋㅋ"; (X)
		
		// 3. 자바문법(예약어)을 사용하면 에러 발생
		// int int = 3; (X)
		int _int = 3; // '_ 아래하이픈'을 써서 에러를 방지할 수 있음
		
		// (Java 문화)
		// 4. 변수명을 누가봐도 뭔지 알 수 있게 작성
		int ajsldjglajljeljgljwsl = 2;
		int age = 2;
		
		// 5. 가독성을 위해서 (띄어쓰기가 필요할 경우에)
		// int price of computer = 1000000; 를 사용하고 싶을 때
		//	- 뱀체 ('_ 아래하이픈' 사용)
		int price_of_computer = 1000000;
		//	- 낙타체 (띄어쓰기 다음 첫글자 대문자로)
		int priceOfComputer = 1000000;
		
		// 6. 한글은 사용 X !
		/////////////////////////////////////////////////////
		
		// * 변수를 만들었을 때, ' = '에 대해 한번 살펴보자!
		// = : 대입연산자
		//	A = B
		//	현실) A는 B랑 같다.
		//	프로그래밍전반) A에 B라는 값을 넣어라.
		
		// * 자료형
		// 		Bit(Binary Didit _ 이진수) : 데이터를 나타내는 최소 단위
		//		(모든 데이터 0, 1의 조합으로 구성되는데, 0 or 1이 하나의 Bit가 됨)
		//		이때 0, 1의 값이 하나의 Bit가 됨
		// 		(8 bits = 1 byte)
		//		모든 데이터는 0,1 로 기록되는데
		
		// * 기본형
		// 		정수
		//		- byte : -128 ~ 127
		//		- short : 약 -3만 ~ 3만
		// 		- int : 약 -21억 ~ 21억 (V, 우리는 int를 메인으로 사용)
		//		- long : int를 벗어나는 범위 전체
		//		실수
		//		- float
		//		- double(V)
		//		- 다른언어 : float / Java 한정 : double
		//		문자
		//		- char
		// 		논리
		//		- boolean : 참 / 거짓 (true / false)
		//		없음
		//		- void : '없음' (나중에 알아보자!)
		
		// * 참조형
		//		기본형이 아닌 것들은 전부 다 참조형!!
		//		문자열
		//		 - String : 문자열(여러글자)를 저장, 앞에 대문자 S
		
		// char vs String
		char cc = 'ㅋ'; // 값이 한 글자를 담는 char / 작은 따옴표 사용!
		// char cc = "ㅋㅋㅋㅋㅋㅋㅋ"; => 여러글자, 큰 따옴표(X)
		String ss = "ㅋㅋㅋㅋㅋㅋㅋ";
		
		// 6층
		// 손가락이 10개
		// 	=> 각각 변수를 선언한 후 => 변수 초기화까지!
		
		int floor;
		floor = 6;
		
		int finger;
		finger = 10;
				
		// 변수 선언과 초기화를 동시에 설정 O
		int num = 10;
		// int num2 = "ten"; (X)
		// int num2 = "ten"; 자료형에 맞지 않는 값 넣으면 에러
		
		int subway = 9;
		double subway2 = 9;
		System.out.println(subway2);
		// double에 int 값을 넣는게 가능!
		// 넓게 보면 9는 9.0으로도 표현이 가능하기 때문
		/////////////////////////////////////////////////
		
		// 자료형을 쓰면 변수 만드는거까지 포함
		int a = 10; // a라는 이름을 가진 정수형 변수를 만들기
					// + a에 10을 넣기
		// int a;
		// a = 10;
		
		// 자료형을 쓰지 않으면 값을 수정
		a = 20;
		
		// Python : 자바보다 고급언어(개발자가 X, 언어가 자동)
		//  자료형을 Python이 알아서 선택
		// a = 10; => 변수가 없으면(int a; 가 없으면) a를 만들어서 10을 넣고
		// a = 10; => 변수가 있으면 a의 값을 바꾸는 형태
		a = 10;
		
		// 변수끼리도 계산이 가능 O
		System.out.println(floor + finger);
		
		// 메모리의 영역
		
		// 1. ??? (나중에)
		
		// 2. Stack
		//	프로그램이 종료되면 자동으로 정리
		//  밑에서부터 차곡차곡 쌓이는... <기본형>
		// 	Heap영역을 가져올 때 이름이 아닌 자리를 가져옴(#3)
		
		// 3. Heap
		//  프로그램이 종료되어도 여전히 남아있음 (수동 정리)
		//  컴퓨터가 적당하다고 판단한 어떠한 위치에 만들어버림 (번지)
		
		// Garbage Collection : Heap영역을 자동으로 정리해주는 시스템
		//  => 현재는 직접 수동 정리할 필요 없음.
		
		int price = 7000; // int는 기본형
		String menu = "짜장면"; // string은 참조형
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
