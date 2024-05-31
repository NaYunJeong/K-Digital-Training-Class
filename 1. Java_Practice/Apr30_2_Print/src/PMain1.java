
public class PMain1 {
	public static void main(String[] args) {
		
		// syso : 출력(Print) 기능
		// ; : 글의 마침표 기능(필수 입력)
		System.out.println();
		
		// Print의 형태
		// 1. println : Console창에 내용을 출력하고, 줄 바꿈 (가장 많이 사용 됨)
		//  => 괄호안에 값을 넣지 않으면 : 줄 바꿈 역할만 수행
		// 2. print : Console창에 내용을 출력하고, 줄 바꿈 X
		// 3. printf : Console창에 형식을 지정해서 내용을 출력 (ex: 소수점 자리수)
		
		System.out.println("println : 글자출력 + 줄바꿈기능");
		System.out.println("print : 글자 출력");
		System.out.println();
		System.out.println("printf : 이거는 이따가 자세히 볼게요!");
		System.out.println();
	
		// ??? : syso를 자동완성 하면 => println만 나오는데...
		// 왜 print랑 printf는 자동완성이 없을까요?
		// => println을 가장 많이 사용하기 때문에ㅋㅋㅋㅋㅋ하하
		
		// syso를 사용
		// 괄호안에 숫자 2개를 넣어서 사칙연산에 대한 결과를 출력해보기
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2); 
		
		// ??? : 숫자 계산할 때는 왜 큰따옴표를 사용하지 않았을까?
		// 	=> 큰따옴표 사이에 뭔가 내용을 넣으면 => '문자'로 인식 함
		System.out.println("10 + 2");
		System.out.println("10 - 2");
		System.out.println("10 * 2");
		System.out.println("10 / 2");
		// 계산이 되지 않고 10 + 2 문자 그대로 나옴
		
		System.out.println("As"	
							+ "dfasf"
							+ "ddsaf");
		System. out. println("zsdfae");
			System.out.println("dageagegawe");
System.out.println("zzzzzzzz");
		// 배열이 이상해도 수행이 잘 됨
		// 띄어쓰기, 줄바꿈, 들여쓰기 => (컴퓨터 입장) 전혀 관심 없음
		// 단순히 사람의 가독성을 위해서 사용하는 것!

		// 한 글자당 2byte의 용량을 차지
		// 이 파일을 압축 -> 띄어쓰기, 줄바꿈, 들여쓰기를 없앰 => 용량을 줄임

		// 가독성 vs 컴퓨터 자원 아끼기 ?

		// 요즘시대에 컴퓨터 사양이 엄~~~~청 좋아졌음 => 가독성 좋은 코드를 짜는게 좋겠어...
		// 일단은 코드를 짜는대로 짜는데, 
		// ctrl + shift + f (정렬 단축키)를 활용하여 정렬하자
		// 정렬 실행 후 
		System.out.println("As" + "dfasf" + "ddsaf");
		System.out.println("zsdfae");
		System.out.println("dageagegawe");
		System.out.println("zzzzzzzz");

	}
	
}
