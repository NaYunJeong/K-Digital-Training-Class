
public class Referee {
	String name;
	String result;
	int count;
	
	public void startGame() {
		System.out.println("<< Up Down Game Start!>>");
	}
	
	public I callMe(I ii) {
		System.out.println("Referee : " + ii.name + "님 입장해주세요.");
		System.out.println("I : 네, 안녕하세요.");
		return new I();
	}
	
	// 친구에게 답 요구
	public int askFriAns(Friend f) {
		int friAns = f.writeFriAns();
		return friAns;
	}
	
//	public int askFriendNum(Friend f) {
//		System.out.print("친구가 적은 숫자(1~100) : ");
//		friendNum = f.writeNum();
//		if (friendNum < 1 || friendNum > 100) {
//			System.out.println("다시 적어주세요.");
//		}
//		return (friendNum >= 1 && friendNum <= 100) ? friendNum : askFriendNum(f);
//	}
	
	// 나에게 답 요구
	public int askMyAns(I ii) {
		int myAns = ii.tellMyAns();
		if (myAns < 1 || myAns > 100) {
			System.out.println("다시 말해주세요.");
		}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMyAns(ii);
	}

	// 판정
	public boolean judge(int answer, int myAnswer) {
		if (answer == myAnswer) {
			System.out.println("정답 !");
		} else if (answer > myAnswer) {
			System.out.println("Up !");
		} else {
			System.out.println("Down !");
		}
		return (answer == myAnswer);
	}
	
//	public void judgeResult(int friendNum, int myNum) {
//		for (int i = 0; true ; i++) {
//			if (myNum == friendNum) {
//				System.out.printf("%d번만에 정답 !", count);
//				break;
//			} else if (myNum > friendNum) {
//				System.out.println("Up !");
//				count++;
//			} else {
//				System.out.println("Down !");
//				count++;
//			}
//		}
//	}
	// 시도 횟수
	public void countTry(int turn) {
		System.out.println("====================");
		System.out.printf("%d번째 시도만에 정답 !\n", turn);
		System.out.println("====================");
	}
	
	public void start(Friend f, I i) {
		startGame();
		I ii = callMe(i);
		int answer = askFriAns(f);
		int myAnswer = 0;
		boolean endGame = false;
		int turn = 0;
		while (true) {
			myAnswer = askMyAns(ii);
			turn++;
			endGame = judge(answer, myAnswer);
			if (endGame) {
				countTry(turn);
				break;
			}
		}
	}
}
