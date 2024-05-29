// ① => 진행 순서 확인
public class FMain3 {
	public static void test(int q) { // ④ q (blue) : 파라미터
		System.out.println(q);	// ⑤ 10 (q/blue)
		q = 20;
		System.out.println(q);	// ⑥ 20 (q/blue)
		// ⑦ test 영역으로 넘어온 이상
		// ⑦ 이쪽 내용을 다 끝내고 다시 main 영역으로 돌아감
	}
	
	public static void main(String[] args) {
		int q = 10;		// ① q(메모장_red) : 지역변수
		System.out.println(q);	// ② 10 (q/red)
		test(q);	// ③ test함수가 호출, q(메모장_blue) 변수 생성
					// ③ q (blue)에 q (red)에 있는 값을 복사해서 넣어주기
		
		System.out.println(q);	// ⑧ 10 (q/red)
		// ⑨ 더 이상 내용이 없으니 프로그램이 종료 !
		
	}
}
