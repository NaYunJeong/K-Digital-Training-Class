
public class RMain3 {
	public static void main(String[] args) {
		// 별찍기
		
		// ㅋ
		// ㅋㅋ
		// ㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		// ㅋ
		//   ㅋ
		//     ㅋ
		//       ㅋ
		//         ㅋ
		// 내 답)	
		for (int i = 1; i < 6; i++) {
			System.out.println("ㅋ");
			for (int j = 0; j != i; j++) {
				System.out.print("   ");
			}
		}
		System.out.println("---------------");
		
		// 답 1)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j) {
					System.out.println("ㅋ");
				} else {
					System.out.println("  ");
				}
			}
		}
		System.out.println("---------------");
		
		// 답 2)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "ㅋ" : "  ");
			}
		}
		System.out.println("---------------");
		
		// 답 3)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  "); // j가 i보다 작은 공간은 띄어쓰기로 매꿔줌
			}
			System.out.println("ㅋ");
		}
		System.out.println("---------------");
		
		
		// ㅋㅋㅋㅋㅋ
		// ㅎㅎㅎㅎ
		// ㅋㅋㅋ
		// ㅎㅎ
		// ㅋ
		
		// 답1)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print((i % 2 == 0) ? "ㅋ" : "ㅎ");
//				System.out.print("ㅋ");
				}
			System.out.println();
		}
		System.out.println("---------------");
		
		// 답2)
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 0) ? "ㅋ" : "ㅎ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		//                                    0  1 2 3 4 5 6 7 8 
		// ㅋ                               0 ㅋ                   i:0 / j:0
		// ㅎㅎㅎ                            1 ㅎ ㅎ ㅎ              i:1 / j:0,1,2
		// ㅋㅋㅋㅋㅋ                         2 ㅋ ㅋ ㅋ ㅋ ㅋ         i:2 / j:0,1,2,3,4   => 규칙:j = 2*i
		// ㅎㅎㅎㅎㅎㅎㅎ                      3 ㅎ ㅎ ㅎ ㅎ ㅎ ㅎ ㅎ
		// ㅋㅋㅋㅋㅋㅋㅋㅋㅋ                   4 ㅋ ㅋ ㅋ ㅋ ㅋ ㅋ ㅋ ㅋ ㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print((i % 2 == 0) ? "ㅋ" : "ㅎ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		//     *    0/5
		//    ***   1/4,5,6
		//   *****   2/3,4,5,6,7
		//  *******   3/2,3,4,5,6,7,8
		// *********   4/1,2,3,4,5,6,7,8,9
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (i + 5); j++) {
				System.out.print((j + i >= 5) ? "*" : " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		// 쌤 답)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
}
