
public class VMain2 {
	public static void main(String[] args) {
		// 예제1)
		// 이름, 오늘 날짜 (연도.월.일), 사는 곳(지역)
		// 시력, java경험의 유무(%b) 를 변수에 담아서 출력

		String myname = "나윤정";
		int year = 2024;
		int month = 5;
		int day = 2;  // String date = "2024.05.02";(x)
		String location = "서울";
		double sight = 0.5;
		boolean experienced = false;
		
		System.out.println("이름 : " + myname);
		System.out.printf("날짜 : %d.%02d.%02d\n", year, month, day);
		System.out.println("사는 곳 : " + location);
		System.out.printf("시력 : %.1f\n", sight);
		System.out.printf("자바 경험 유무 : %b\n", experienced); // true, false => %b
		
		System.out.println("////////////////////////");
		
		// 예제2)
		// 섬유향수
		// 가격 : 1000원
		// 용량 : 80ml
		// 향 : 체리블라썸
		// 향균 : 99.9%
		// 색 : 무색
		// 구매처 : 다이소
		// 공병 : 재활용 해야함 (true / false)
		
		String name = "섬유향수";
		int price = 1000;
		int volume = 80;
		String smell = "체리블라썸";
		double antibacterial = 99.9;
		String color = "무색"; // char color = '무'
		String company = "다이소";
		boolean recycle = true;
		
		System.out.println("이름 : " + name);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("용량 : %dml\n", volume);
		System.out.println("향 : " + smell);
		System.out.printf("향균 : %.1f%%\n", antibacterial);
		System.out.println("색 : " + color); // char은 %c => system.out.printf("색 : %c\n", color);
		System.out.println("회사 : " + company);
		System.out.printf("공병 재활용 여부 : %b\n", recycle);
			
		
		
	}
}
