import java.util.Scanner;

// BMI 검사 프로그램 (함수.ver)

// 이름, 키(cm), 몸무게(kg) 입력
// BMI(체질량지수) : 몸무게 / (키 * 키) => 키 : m단위
//	18.5 미만이면 저체중
// 	18.5 이상이면 정상
// 	25 이상이면 과체중
// 	30 이상이면 경도비만
// 	35 이상이면 중증도비만
// 	40 이상이면 고도비만
// 결과를 출력 (각 결과에 따른 코멘트 작성) 하고,
// Y를 입력하면 프로그램이 종료

public class CMain8 {
	
	// 프로그램 시작을 알려주는 함수
	public static void startBMI() {
		System.out.println("※※※※  BMI 검사 프로그램  ※※※※");
	}
	// 이름을 입력하는 함수
	public static String getName() {
//		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
//		String name = k.next();
//		return name;
		return new Scanner(System.in).next();
	}	
	// 키를 입력하는 함수
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키(cm) : ");
		double height = k.nextDouble();
		return height;
	}
	// 몸무게를 입력하는 함수
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		return weight;
	}
	// BMI를 계산해주는 함수
	public static double calcBMI(double height, double weight) {
		double BMI = weight /((height/100) * (height/100));
		return BMI;
	}
	// 결과를 판단(판정)해주는 함수
	public static String judgeBMI(double BMI) {
		if (BMI >= 40) {
			return "고도비만";
		} else if (BMI >= 35) {
			return "중증도비만";
		} else if (BMI >= 30) {
			return "경도비만";
		} else if (BMI >= 25) {
			return "과체중";
		} else if (BMI >= 18.5) {
			return"정상";
		} else {
			return "저체중";
		}
		
//		String result = "저체중";
//		if (BMI >= 40) {
//			result = "고도비만";
//		} else if (BMI >= 35) {
//			result = "중증도비만";
//		} else if (BMI >= 30) {
//			result = "경도비만";
//		} else if (BMI >= 25) {
//			result = "과체중";
//		} else if (BMI >= 18.5) {
//			result = "정상";
//		}
//		return result;
		}
	
	// 결과를 출력해주는 함수 + 각 결과에 따른 코멘트 작성
//	public static void printResult(String n, double h, double w, double b, String r) {
//		System.out.printf("%s님의 키는 %.1fcm, 몸무게는 %.1fkg이고..\n", n, h * 100, w);
//		System.out.printf("체질량지수(BMI) : %.1f입니다.\n", b);
//		
//		try {
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("*********************");
//		System.out.printf("/t%s님은 %s입니다 !\n", n, r);
//		switch (r) {
//		case "저체중":
//			System.out.println("\t하루에 5끼 챙겨드시면");
//			break;
//		case "정상":
//			System.out.println("\t드시던 대로 드시면 됩니다.");
//			break;
//		case "과체중":
//			System.out.println("\t먹는 양을 줄이시는게 어떨까요?");
//			break;
//		case "경도비만":
//			System.out.println("\t하루에 5끼 챙겨드시면");
//			break;
//		case "중증도비만":
//			System.out.println("\t하루에 5끼 챙겨드시면");
//			break;
//		case "고도비만":
//			System.out.println("\t하루에 5끼 챙겨드시면");
//			break;
//		default:
//			break;
//		}
//	}
	// Y를 입력했을 때 프로그램을 종료해주는 함수 (ex: 종료하시겠습니까(Y/N))
	public static void exit() {
		Scanner k = new Scanner(System.in);
		System.out.print("종료 하시겠습니까(Y/N)?");
		String answer = k.next();
		if (answer.equals("Y") || answer.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			k.close();
		}
		else {
			System.out.println("무조건 종료해야하는데요?");
			exit();
		}
	}
	
//	public static void start() {
//		startBMI();
//		String name = getName();
//		double height = getHeight();
//		double weight = getWeight();
//	}
	public static void main(String[] args) {
		startBMI();
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double BMI = calcBMI(height, weight);
		
		System.out.println("*************************");
		System.out.printf("* 이름\t:\t%s\t*\n", name);
		System.out.printf("* 키\t:\t%.1f\t*\n", height);
		System.out.printf("* 몸무게\t:\t%.1f\t*\n", weight);
		System.out.printf("* BMI\t:\t%.1f\t*\n", BMI);
		System.out.printf("* %s님은 BMI 판정 결과 ", name);
		judgeBMI(BMI); System.out.println(" 입니다*");
		exit();
	}
}
