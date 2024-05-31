// function (Java내에서 function(함수)라는건 없어... => 메소드(함수) 임!) 
//		- Class 밖에 만든 것 (사실상 Java에는 function이라는 용어가 없음)
//		public static void test() {  (X -> Class블록 안에서만 작성할 수 있음)
// method
//		- Class 속에 만든 것 (Class에 종속적인 함수라고도 표현)
//		- 여태까지 써왔던건 다 method였던거임...!!! ㅇ0ㅇ !!!

// Class : 객체를 찍어내는 틀 (ex: 붕어빵 틀, 도장)
public class Bus {
		// 멤버변수 (Member Variable)	- 속성 (= attribute, field, 전역변수)
		//							- 객체의 데이터가 저장되는 공간
	
		// 버스번호
		int no;
		// 버스차종
		String brand;
		// 버스회사
		String company;
		// 버스 운전사
		String driver;
		// 버스 출발점
		String startPoint;
		
		public void printInfo() {
			// this : 객체 자기 자신을 말한다 (this. : 생략 가능 O)
			System.out.println(this.no);
			System.out.println(brand);
			System.out.println(company);
			System.out.println(driver);
			System.out.println(startPoint);
		}
		
		// method - 액션, 프로그램상 필요한 기능
		//			- 객체의 동작에 해당하는 실행 블록
		public void go() {
			System.out.println("부릉부릉~");
		}
		
	}
