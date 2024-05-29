
public class YMain {
	public static void main(String[] args) throws InterruptedException {
		// 학원오는데 얼마나 걸렸는지 (시간) : 1.5시간
		// 어제 저녁 메뉴 ? : ???
		// 어제 뭐하셨나요 ? : ???
		// 취침 시간 : ?시 ?분
		// 첫 수업 소감 : ???
		// 수업 성취도 : ?.?%
		// 출력
		
		// => 5초 정도 딜레이 걸어서 => .bat로 실행까지 해보기!
		
		System.out.printf("학원오는데 걸린 시간 : %.1f시간\n", 1.0);
		System.out.println("어제 저녁 메뉴 : 보리밥칼국수, 낙지볶음");
		System.out.printf("어제 한 일 : %s\n", "자격증시험 공부");
		System.out.printf("취침 시간 : %2d시 %2d분\n", 12, 35);
		System.out.printf("첫 수업 소감 : %s\n", "도입부분이라 수월하게 따라갈 수 있었음. 매일이 오늘과 같기를...");
		System.out.printf("수업 성취도 : %.2f%%\n" , 92.88);
		
		Thread.sleep(5000); // Tread 자동완성 => .sleep => 빨간줄 첫번째 선택

	}
}
