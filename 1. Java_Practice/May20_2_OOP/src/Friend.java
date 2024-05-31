import java.util.Random;
//import java.util.Scanner;

public class Friend {
	Random brain = new Random();
//	Scanner k = new Scanner(System.in);
	
	public int writeFriAns() {
		int think = brain.nextInt(100) + 1;
		System.out.println("친구가 답을 정했다!");
		return think;
//		return k.nextInt();
	}
}
