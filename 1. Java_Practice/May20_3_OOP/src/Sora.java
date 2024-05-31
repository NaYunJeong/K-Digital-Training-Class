import java.util.Random;

public class Sora {
	Random brain = new Random();
	int hand;
	
	public int fire() {
		return brain.nextInt(3) + 1;
	}
}
//	public int randomNum() {
//		int soraNum = r.nextInt(3) + 1;
//		return soraNum;
//	}
//}
