
// 가위바위보
//	1. 등장인물 누구 ? => 심판 / sora / sally
//		=> 다 같이 한자리에 있음
//		=> 심판한테는 룰북이 있음
//		1을 입력하면 가위 / 2를 입력하면 바위/ 3을 입력하면 보
//	2. 각 객체들 속성? 행동?
//	3. 2명이 대결하고 심판이 판정해줌(1명 입력받기, 1명 랜덤)
//	4. 입력받은 1인이 한 판 질동안 몇승 / 몇무 했는지

public class OMain1 {
	public static void main(String[] args) {
		Referee r = new Referee();
		Sora s = new Sora();
		Sally ss = new Sally();
		r.start(s, ss);
	}
}
