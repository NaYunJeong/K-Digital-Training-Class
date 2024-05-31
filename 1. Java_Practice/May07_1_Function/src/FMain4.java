
public class FMain4 {
	
	// *** 고급 기술 !!!
	// 오버로딩(Overloading)
	//	함수명 같게, 파라미터를 다르게 하는 기술
	//	호출할 때 어떤 값을 넣었느냐에 따라 함수가 불러지게 하는 기술
	
	// * 오버로딩 가능 조건
	// 1. 같은 자료형을 써도, 파라미터의 갯수가 다르면 오버로딩 O (① + ②)
	// 2. 파라미터의 갯수가 같아도, 다른 자료형을 사용하면 오버로딩 O (② + ③)
	// 		=> ** '그 함수들이 같은 기능을 하고있다' 전제조건 가지고 있어야 함 (①,②,③은 전부 더한 값 출력)
	
	// 정수 2개를 넣으면 그 합을 출력해주는 함수
	public static void printSum(int a, int b) {		// ①
		System.out.println(a + b);	
	}
	
	// 정수 3개를 넣으면 그 합을 출력해주는 함수
	public static void printSum2(int a, int b, int c) {		// ②
		System.out.println(a + b + c);
	}
	
	// 실수 3개를 넣으면 그 합을 출력해주는 함수
	public static void printSum3(double a, double b, double c) {		// ③
		System.out.println(a + b + c);
	}
	
	// 정수 1개를 넣으면 => 윽! 출력
	public static void print(int a) {
		System.out.println("윽!");
	}
	
	// 문자열 1개를 넣으면 => 악! 출력
	public static void print(String a) {
		System.out.println("악!");
	}
	
	// 실수 1개를 넣으면 => 으아아악! 출력
	public static void print(double a) {
		System.out.println("으아아악!");
	}
	
	// 아무것도 넣지 않으면 => ... 출력
	public static void print() {
		System.out.println("...");
	}
	
	public static void main(String[] args) {
		printSum(3, 10);
		printSum2(3, 10, 30);
		printSum3(5.3, 2.9, 3.7);
		System.out.println("-------");
		
		print(5);
		print("끝");
		print(5.5);
		print();
		
		// 사실 우리는 첫날부터 이 오버로딩을 사용하고 있었습니다 ! ㅇ0ㅇ!
		// System.out.println();
		
	}
}
