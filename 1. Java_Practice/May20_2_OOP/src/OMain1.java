
public class OMain1 {
	public static void main(String[] args) {
		Referee r = new Referee();
		Friend f = new Friend();
		I ii = new I();
		ii.name = "포도";
		r.start(f, ii);
	}
}

// Up Down 게임 (1~100)
// 심판 / 친구 / 나
// 주도적으로 끌고 갈 인물
// 등장인물이 다 등장해야!
//		상황 설정은 제각각
//		심판과 친구는 자리에 나와있고 => 심판이 나를 불러내는 상황
//		심판 => 친구 답 요구 : 종이에 답을 적어서 제출
//		심판 => 나 답 요구 : 말로 대답을 할 것!
//		판정 
//		내가 친구의 답을 맞출 때까지 진행 => 몇번째 시도만에 정답을 맞췄는지
