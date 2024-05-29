
public class CMain1 {
	public static void main(String[] args) {
		// 신발
		// 나이키 홈페이지
		
		// 맘에드는 신발의 객체 2개 만들기
		// 이름 : ???
		// 사이즈 : 
		// 가격 :
		// 브랜드 : 
		// 정보출력
		
		Shoes s1 = new Shoes();
		s1.name = "나이키 에어포스";
		s1.size = 250;
		s1.price = 149000;
		s1.printInfo();
		Shoes s2 = new Shoes();
		s2.name = "나이키 코르테즈";
		s2.size = 230;
		s2.price = 129000;
		s2.printInfo();
		
		// 생성자 오버로딩
		Shoes s3 = new Shoes("신발", 250, 3000);
		s3.printInfo();
		
		System.out.println("------");
		s2.test(s2.name);
		System.out.println("------");
		s2.test("zzz");
		System.out.println("------");
		
		// 커피 출력
		// 커피 이름 / 가격
		Coffee c = new Coffee("에스프레소", 4000);
		c.printInfo();
	}
}
