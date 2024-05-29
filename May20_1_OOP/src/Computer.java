import java.util.Random;
import java.util.Scanner;

public class Computer {
	int coin = 20;
	Random cpu = new Random();
	int uCoin;
	int cCoin;
	String answer;
	String cOOE;
	
	public void startGame() {
		System.out.println("<<< 홀짝 맞추기 게임 >>>");
	}
	
	public int askHowManyCoin(User u) {
		System.out.print("동전 몇 개?(2~20) : ");
		coin = u.answerHowManyCoin();
		if (coin < 2 && coin > 20) {
			System.out.println("범위 내에서 다시 말해주세요.");
		}
		return (coin >= 2 && coin <= 20) ? coin : askHowManyCoin(u);
	}
	
	public int shakeCoin(int userCoin) {
		return cpu.nextInt(userCoin) + 1;
	}
	
	public String askOOE(User u) {
		System.out.print("홀 or 짝 ? ");
		String userAns = u.answerOOE();
		return (userAns.equals("홀") || userAns.equals("짝")) ? userAns : askOOE(u);
	}
	
	public String judgeCoin(int shakeCoin) {
		return (shakeCoin % 2 == 0) ? "짝" : "홀";
	}

	public String getResult(String userAns, String comAns) {
		return userAns.equals(comAns) ? "정답" : "오답";
	}
	
	public void printResult(int shakeCoin, String result) {
		System.out.printf("동전은 %d개 뽑았고, %s이야!\n", shakeCoin, result);
	}
	
	public void start(User u) {
		startGame();
		int userCoin = askHowManyCoin(u);
		int shakeCoin = shakeCoin(userCoin);
		String userAns = askOOE(u);
		String comAns = judgeCoin(shakeCoin);
		String result = getResult(userAns, comAns);
		printResult(shakeCoin, result);
	}
	
}
