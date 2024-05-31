
public class Referee {
	String[] rulebook = new String[] {" ", "가위", "바위", "보"};
	
	public void startGame() {
		System.out.println("<< 가위/바위/보 Game >>");
	}
	
	// 룰북 읽어주기
	public void readRulebook() {
		System.out.println("=======================");
		for (int i = 1; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("=======================");
	}
	
	// sora 뭐낼지 물어보기
	public int askAns(Sora s) {
		System.out.print("sora 뭐낼래 ? : ");
		int soraAns = s.fire();
		if (soraAns < 1 || soraAns > 3) {
			System.out.println("1~3 정수 입력");
		}
		return (soraAns >= 1 || soraAns <= 3) ? soraAns : askAns(s);
	}
	
	// sally 뭐낼지 물어보기
	// 오버로딩 사용
	public int askAns(Sally ss) {
		System.out.print("sally 뭐낼래 ? : ");
		int sallyAns = ss.fire();
		if (sallyAns < 1 || sallyAns > 3) {
			System.out.println("1~3 정수 입력");
		}
		return (sallyAns >= 1 || sallyAns <= 3) ? sallyAns : askAns(ss);
	}
	
	// 누가 뭐 냈는지
	public void printHand(Sora s, Sally ss) {
		System.out.printf("Sora : %s\n", rulebook[s.hand]);
		System.out.printf("Sally : %s\n", rulebook[ss.hand]);
	}
	
	//소라1(가위) => 샐리1(가위)/ 2(바위)/ 3(보)
	//				0(비김)	-1(이김)	-2(짐)
	//소라2(바위) =>  1(짐) 	0(비김) 	-1(이김)
	//소라3(보)   =>  2(이김)	1(짐)	0(비김)
	// 판정
	public boolean judgeWin(Sora s, Sally ss) {
		int result = s.hand - ss.hand;
		if (result == 0) {
			System.out.println("비겼다!");
			ss.draw++;
		} else if (result == 2 || result == -1) {
			System.out.println("샐리가 이겼다!");
			ss.win++;
		} else {
			System.out.println("소라가 이겼다!");
		}
		return (result == -1 || result == 2);
	}
	
	public void saySallyWin(Sally ss) {
		System.out.printf("Sally는 %d번 비겼고, %d번 이겼어 !\n", ss.draw, ss.win);
	}
	
//	public int judge(int sora, int sally) {
//		int game = sora - sally;
//		if (game == 0) {
//			System.out.println("무승부!");
//			return 0;
//		} else if (game == 2 || game == -1) {
//			System.out.println("이겼다!");
//			return 1;
//		} else {
//			System.out.println("졌다!");
//			return -1;
//		}
//	}
	
	public void start(Sora s, Sally ss) {
		startGame();
		readRulebook();
		while (true) {
			s.hand = askAns(s);
			ss.hand = askAns(ss);
			printHand(s, ss);
			System.out.println("=======================");
			if (judgeWin(s, ss)) {
				saySallyWin(ss);
				break;
			}
			System.out.println("=======================");
		}
	}
	
}