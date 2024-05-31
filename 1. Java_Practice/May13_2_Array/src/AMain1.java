// 변수
//		변수 1 : 데이터 1

// 배열(Array)		" [  ] "
//		변수 1 : 데이터 n

// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
//		배열 속 각각의 데이터를 '요소'라고 부름
// 		이 요소마다 붙여진 일련번호가 있는데 각 요소를 구별하는데 사용
//						=> 인덱스(Index) : 시작은 0부터 !!!

// 배열 생성
//		자료형[] 변수명; // 배열 선언
//		변수명 = new 자료형[배열의 길이 갯수]; // 배열 생성
//			=> 자료형[] 변수명 = new 자료형[배열의 길이 갯수];

public class AMain1 {
	public static void main(String[] args) {
		int[] eng = new int[3];		// 1.
		eng[0] = 100;
		eng[1] = 70;
		eng[2] = 50;
//		eng[3] = 10;				// 배열의 지정된 범위가 아니면 에러! (int[3] 3개의 요소의 갯수를 벗어나면 error)
		for (int i = 0; i < eng.length; i++) {
			// .length : 이 배열에 요소가 몇 개가 있는지 알려줌
			System.out.println(eng[i]);
		}
		System.out.println("--------------------");
		
		int[] math = new int[] { 10, 30, 60 };		// 2.
		
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		System.out.println("--------------------");
		
		int[] kor = { 20, 40, 60 }; 	// 3. 약식 	// 약식을 못쓰는 경우가 있기에
		for (int i = 0; i < kor.length; i++) {		// 이 방법을 알아 둘 필요가 있음
			System.out.println(kor[i]);
		}
		System.out.println("--------------------");
		
		int a = 10;
		int[] b = {10, 20};		// 참조형
		System.out.println(a);
		System.out.println(b);	// 참조형 번지값(주소값)
//		b[2] = 200;				   // #배열의 단점 1.
//		System.out.println(b[2]);  // 배열의 지정된 범위에 들어가지 않아서 error!
		System.out.println("--------------------");
		
		// 2차원 배열... 거르세요;
		int[][] score = { { 50, 30 }, { 30, 50 }, { 100, 80 } }; 
		System.out.println(score); 		// 주소값(전체에 대한)
		System.out.println(score[0]);	// 주소값(0번째 학생에 대한)
		System.out.println(score[1][0]);// 1번째 학생의 국어 점수
		// #배열의 단점 2.
		// 주석없이도 해설할 수 있는지 ?
		// students.get.getKorScore(); 가 더 보기 좋음
	}
}
// *Java를 잘 하는 사람 ?
//	조건문
//	반복문
//	배열 : ???
//		배열을 만들때 사이즈가 고정
//			=> 사이즈를 모르면 배열을 못만든다...
//		Java에서는 배열 NO! => '컬렉션'(Java단점 보안) 으로 해결 가능
