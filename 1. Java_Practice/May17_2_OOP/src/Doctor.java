import java.util.Scanner;

// 지역변수 (Local Variable)
//		메소드 속에서 만든 변수
//		그 행동을 하는 동안에만 필요한 임시변수로 사용...
// 메소드 파라미터(Parameter)
//		그 행동을 하는데 필요한 재료
// 리턴되는 값
//		그 행동을 한 후에 결과물
// 멤버변수 (Member Variable)
//		그 객체의 속성

public class Doctor {
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	String bmiResult;
	
	public void printDoctor() {
		System.out.println(" < 의사 > ");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("---------------");
	}
	
	// BMI(체질량지수) : 몸무게 / (키 * 키) => 키 : m 단위
	//		18.5 미만이면 저체중
	//		18.5 이상이면 정상
	//		25 이상이면 과체중
	//		30 이상이면 경도비만
	//		35 이상이면 중증도비만
	//		40 이상이면 고도비만

	// 1. 손님 부르기
	// 재료 : 불러올 대상
	public void callGuest(Guest g) {
		System.out.printf("의사 : %s씨 들어오세요~\n", g.name);
	}
	
	// 2. 키 묻기 (cm)
	// 재료 : 물어볼 대상
	// 결과 : 손님의 키
	public double askHeight(Guest g) {
		System.out.print("키(cm) : ");
		double h = g.answerHeight();
		if (h >= 1 && h <= 300) {
			System.out.println("=======");
			System.out.println("good!");
			System.out.println("=======");
		} else if (h < 1 || h > 300) {
			System.out.println("=======");
			System.out.println("다시 입력해주세요!");
			System.out.println("=======");
		}
		return (h >= 1 && h <= 300) ? h / 100 : askHeight(g);
	}
	
	// 3. 몸무게 묻기 (kg)
	// 재료 : 물어볼 대상
	// 결과 : 손님의 몸무게
	public double askWeight(Guest g) {
		System.out.print("몸무게(kg) : ");
		double w = g.answerWeight();
		if (w >= 1) {
			System.out.println("=======");
			System.out.println("good!");
			System.out.println("=======");
		} else if (w < 1) {
			System.out.println("=======");
			System.out.println("다시 입력해주세요!");
			System.out.println("=======");
		}
		return (w >= 1) ? w : askWeight(g);
	}
	
	// 4. BMI 계산
	// 재료 : 손님정보(키, 몸무게)
	// 결과 : BMI 값
	public double calcBMI(Guest g) {
		return g.weight / (g.height * g.height);
	}	
	
	// 5. 판정해서 결과내기
	// 재료 : 손님의 BMI 수치
	// 결과 : BMI 결과(ex : 비만 or 정상 or ...)
	public String judgeBMI(Guest g) {
		if (g.bmi >= 40) {
			return "고도비만";
		} else if (g.bmi >= 35) {
			return "중증도비만";
		} else if (g.bmi >= 30) {
			return "경도비만";
		} else if (g.bmi >= 25) {
			return "과체중";
		} else if (g.bmi >= 18.5) {
			return "정상";
		} else {
			return "저체중";
		}
	}
	
	// 6. 결과 알려주기 (출력하기)
	// 재료 : 손님의 이름, 몸무게, 키, BMI수치, 결과
	public void printResult(Guest g) {
		System.out.printf("%s씨의 키는 %.1fcm이고, 몸무게는 %.1fkg...\n", g.name, g.height * 100, g.weight);
		System.out.printf("체질량지수(BMI) : %.1f\n", g.bmi);
		System.out.printf("당신은 ...%s 입니다... 안녕히가세요!\n", g.bmiResult);
	}
	
	// 7. 위의 과정들을 묶기
	public void start(Guest g) {
		callGuest(g);
		g.height = askHeight(g);
		g.weight = askWeight(g);
		g.bmi = calcBMI(g);
		g.bmiResult = judgeBMI(g);
		printResult(g);
	}
}
