import java.util.Scanner;

public class I {
	String name;
	Scanner mouth = new Scanner(System.in);
	
	public void iInfo() {
		System.out.println(name);
	}
	
	public int tellMyAns() {
		System.out.print("정답은 : ");
		return mouth.nextInt();
	}
}
