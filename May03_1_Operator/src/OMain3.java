import java.util.Scanner;

// * 논리연산자 : 결과가 boolean (true / false)
//		> (초과), >= (이상), < (미만), <= (이하), ==(같다), !=(다르다)


public class OMain3 {
	public static void main(String[] args) {
		
		// 예제1)
		// 놀이공원에서 놀이기구를 타도 되는지 판정해주는 프로그램
		// 키(cm), 나이를 입력받아서 출력해보기
		
		// 나이가 10살이 넘는 사람만 탈 수 있음
		// 나이가 5살 미만만 탈 수 있음
		// 나이가 20살만 탈 수 있음
		// 나이가 1살이 아니면 탈 수 있음
		// 나이가 홀수만 탈 수 있음
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		System.out.print("나이 : ");
		int age = k.nextInt();
		
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("나이 : %d세\n", age);
		
		boolean ride1 = (age > 10);
		System.out.printf("ride1 탑승 가능 여부 : %b\n", ride1);
		boolean ride2 = (age < 5);
		System.out.printf("ride2 탑승 가능 여부 : %b\n", ride2);
		boolean ride3 = (age == 20);
		System.out.printf("ride3 탑승 가능 여부 : %b\n", ride3);
		boolean ride4 = (age != 1);
		System.out.printf("ride4 탑승 가능 여부 : %b\n", ride4);
		boolean ride5 = (age % 2 == 1);
		System.out.printf("ride5 탑승 가능 여부 : %b\n", ride5);
		
		// 업그레이드 !
		//		~고 (and)	: &&
		//		~거나 (or)	: || (shift + \)
		//		XOR			: ^ 
		//			(eXclusive(배타적) OR)
		//			=> 두 입력이 서로 다를 때 '1'(참)이라는 결과값을 출력 (둘다 참이면 X/ 한쪽은 참, 한쪽은 거짓)
		// 		NOT			: !  => 결과를 뒤집을 때
		
		// 예제2)
		// 6. 나이가 3살이 넘고, 키가 2m 넘어야 탈 수 있음
		//		95%				5%			
		//				=> 95% 이상의 확률로 2번 검사해야 함
		// 6. 키가 2m 넘고, 나이가 3살이 넘어야
		//		5%				95%
		//				=> 95% 이상의 확률로 1번만 검사해도 됨 (AND - 확률이 낮은쪽을 앞쪽으로 배치)
		
		// 키가 1.9m가 넘거나, 나이가 50살 미만이면 탈 수 있음
		// 10 < 나이 < 40 이면 탈 수 있음
		// 나이가 10살 이상이던지, 키가 1.5m이상이던지 하나만 만족해야 함
		// ride9를 탈 수 있는 사람은 놀이기구를 못타고, ride9를 탈 수 없는 사람만 탈 수 있음
		
//		boolean ride6 = ((age > 3) && (height > 200));  // 이거보다,
		boolean ride6 = ((height > 200) && (age > 3));  // 이게 더 효율적이야! 생각하고 짜봐!! (AND - 확률이 낮은쪽을 앞쪽으로 배치)
		System.out.printf("ride6 탑승 가능 여부 : %b\n", ride6);
		
//		boolean ride7 = ((height > 190) || (age < 50));  //
		boolean ride7 = ((age < 50) || (height > 190));  // 50세 미만이 더 많아 -> (OR - 확률이 높은쪽을 앞쪽으로 배치)
		System.out.printf("ride7 탑승 가능 여부 : %b\n", ride7);
		
//		boolean ride8 = ((age > 10) && (age < 40));
		boolean ride8 = ((age < 40) && (age > 10));
		System.out.printf("ride8 탑승 가능 여부 : %b\n", ride8);
		
		boolean ride9 = ((age >= 10) ^ (height >= 150));
		System.out.printf("ride9 탑승 가능 여부 : %b\n", ride9);
		
		boolean ride10 = !ride9;
		System.out.printf("ride10 탑승 가능 여부 : %b\n", ride10);
		
		
		
	}
}
