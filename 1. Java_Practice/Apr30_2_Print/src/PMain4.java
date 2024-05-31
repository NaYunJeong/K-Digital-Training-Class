
public class PMain4 {
	
	// 명함 만들기
	// 이름 / 나이 / 성별 / 키 / 사는 지역 / 별명
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.printf("이름\t\t %s\n", "나윤정");
		System.out.printf("나이\t\t %d\n", 29);
		System.out.printf("성별\t\t %s\n", "여");
		System.out.printf("키\t\t %.1f\n", 155.5);
		System.out.printf("사는지역\t\t %s\n", "서울");
		System.out.printf("별명\t\t %s\n", "꿀맘");
		
		System.out.println("*************************");
		System.out.println("*\t♥자기소개♥\t*");
		System.out.println("*************************");
		System.out.printf("* 이름\t: %s\t\t*\n", "나윤정");
		System.out.printf("* 성별\t: %s\t\t*\n", "여자");
		System.out.printf("* 키\t: %.1fcm\t*\n", 155.5);
		System.out.printf("* 사는곳\t: %s\t\t*\n", "서울");
		System.out.printf("* 별명\t: %s\t\t*\n", "꿀맘");
		System.out.println("*************************");
		System.out.println("*\t♥감사합니다♥\t*");
		System.out.println("*************************");
		
		Thread.sleep(10000); //10000ms(약 10초) 머무르겠다. => 이후 콘솔박스 밑에 <terminated> 표시.
		
		
	}

}
