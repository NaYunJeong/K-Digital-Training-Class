
public class PMain2 {
	public static void main(String[] args) {
		// Escape Sequence(이스케이프 문자)
		// : 특수한 문자 or 특수한 기능을 표현할 때
		// 		역슬래시 \ 를 사용해서 
		
		// \t : Tab키 (줄 맞추는 용도)
		// \n : New Line (줄만 맞추는 용도)
		// \r : Carriage Return (커서를 맨 앞으로)
		// \r\n : Enter키 기능(줄 바꾸는 용도)
		// \b : Backspace키 기능 (1byte만 지움) => 따라서, Java에서는 사용 안함.
		// 		C언어 - 한 글자 : 1byte
		//		Java - 한 글자 : 2byte
		// \0 : Space키 기능 (빈칸)
		
		// syso 4개에 각각 문장 한개씩 생성해보기 => 중간중간에 이스케이프 문자 넣어서 출력
		System.out.println("저의이름은\t나윤정\t입니다.");
		System.out.println("저의이름은\n나윤정\n입니다.");
		System.out.println("저의이름은\r나윤정\r입니다.");
		System.out.println("저의이름은\r\n나윤정\r\n입니다.");
		System.out.println("저의이름은\b나윤정\b입니다."); // Java에서는 사용 X
		System.out.println("저의이름은\0나윤정\0입니다.");
		
		// 현재 : 가볍게 확인용도로 사용하는 콘솔창이라서
		//		\r or \n 둘 중 하나만 있어도 enter키 처리가 가능
		// 파일처리, 통신 : \r 이나 \n 중 하나만 쓰게 되면 내용이 다 뒤집어질 수도 있음!
		// => 이클랩스 안에서는 \r, \n을 구분하기는 어려움
		// => 이클랩스 사용 동안에는 \n을 엔터처리로 하고, 이후 파일처리에서 \r, \n을 보기로 하자!
		
		// \(^_^)/ 출력해보기
		System.out.println("\\(^_^)/");
		// \를 글자로 변환 => \\ 2번 입력하기
		
		// (".") 출력해보기
		System.out.println("(\".\")");
		// "를 글자로 변환 => \" 입력하기
		
	}

}
