// A is a B : 상속관계
// 개는 동물 '이다'
public class Dog extends Animal {	// Animal의 기능을 받아옴
	// Animal 안에 Dog이 '상속'되어있다
	// 상속 : Inheritance
	// 확장 : extends (상속 + 확장)느낌
	
	String inhabit;
	
	public Dog() {
		// TODO Auto-generated constructor 
	}

	public Dog(String sort, int age, String inhabit) {
		super(sort, age);
		this.inhabit = inhabit;
	}
	
	// @XXX : Annotation => 어떤 기능을 자동으로 연결해준다
	@Override	// 상속받아온 method의 기능을 바꾸는 것   // p + 자동완성
	public void printInfo() {
		// override를 사용하려면...
		//	상속받은 Class에서의 method명과 같아야 함
		// TODO Auto-generated method stub
		super.printInfo();	// 상위class.printInfo(); 실행
		System.out.println(inhabit);
	}
	
	// VS
	// Overloading 
	//		메소드를 만들 때 같은 기능이라면 메소드명을 같게 함
	//		파라미터의 자료형이 다르거나,
	//		파라미터의 갯수가 달라야 함
	
}
