
public class PMain3 {
	public static void main(String[] args) {
		// print
		System.out.print("lasdf");
		System.out.print("33asdg");
		System.out.println();
		// ln(줄바꿈) => \n(줄 바꾸는 용도) 모양 비슷하잖아?
		
		// printf (Formatting - 형식 지정)
		// System.out.printf("%??", 값); 의 형태
		
		// 정수 (decimal)
		// %d : 정수데이터가 들어올 자리(decimal, 10진수)
		// %xd : 빈자리가 띄어쓰기로 채워져서 출력(x=숫자)
		// %0xd : 빈자리를 0으로 채워서 x자리의 숫자로 만들어서 출력
		System.out.printf("%d\n", 1); 
		System.out.printf("%3d\n", 1); // 3자리 표현 중 빈자리 공백처리 => _ _ 1
		System.out.printf("%010d\n", 1); // 10자리 표현 중 빈자리 0처리 => 0000000001
		
		// 실수 (float)
		// %f : 실수데이터가 들어올 자리
		// %.xf : 소수점 이하의 자릿수
		//			잘리는 부분은 반올림처리, 빈자리는 0으로 채워줌
		System.out.printf("%f\n", 123.456789);
		System.out.printf("%.3f\n", 123.456789); // 소수점 셋째자리까지 표현(반올림) => 123.457
		System.out.printf("%.10f\n", 123.456789); // 소수점 열째자리까지 표현(빈자리 0처리) => 123.4567890000
		
		// 문자열 (string)
		// %s : 글자데이터가 들어올 자리
		// 숫자 : 그냥 입력하면 됨
		// 문자 : 그냥 입력하게 되면 Java의 문법으로 해석하기에 => 오류 발생
		//		=> "내용" (큰 따옴표 안에 문자 넣기!)
		System.out.printf("%s\n", "헉? 내일 휴일이라고요?");
		System.out.println("-------------");
		
		// 실습해보기!
		// 오늘 날까 기준으로 연도 => xxxx년
		System.out.printf("%4d년\n", 2024);
		// 월 => xx월
		System.out.printf("%02d월\n", 4);
		// 일 => xx일
		System.out.printf("%02d일\n", 30);
		// 연-월-일의 형태로 붙여서 ex) 날짜 : xxxx-xx-xx
		System.out.printf("날짜 : %4d-%02d-%02d\n", 2024, 4, 30);
		// 날씨 : 더움
		System.out.printf("날씨 : %s\n" , "더움");
		// 기온 : 23도
		System.out.printf("기온 : %s도\n", 23);
		// 습도 : 20.21%
		System.out.printf("습도 : %.2f%%\n", 20.21);
		// %% : %를 글자로 표현하고 싶을 때 (printf에서만!)
	
		
	}
}
