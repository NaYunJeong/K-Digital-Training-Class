import java.util.Scanner;

public class Sally {
	Scanner brain = new Scanner(System.in);
	int hand;	// 가위바위보 낼 손
	int win;
	int draw;
	
	public int fire() {
		return brain.nextInt();
	}
}

//	public int writeNum() {
//		int sallyNum = brain.nextInt();
//		return sallyNum;
//	}
//}
