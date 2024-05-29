import java.util.Scanner;

public class User {
	int coin;
	String result;
	Scanner mouth = new Scanner(System.in);
	
	public int answerHowManyCoin() {
		return mouth.nextInt();
	}
	
	public String answerOOE() {
		return mouth.next();
	}
	
}
