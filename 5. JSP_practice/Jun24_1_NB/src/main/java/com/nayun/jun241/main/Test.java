package com.nayun.jun241.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Test {
	
	// 001 ~ 011 => 중복으로 사용X 
	// 012 ~ 987 => 가능!
	// 988 ~ 999 => 중복으로 사용X
	
	public static String pickAns() {
		int a = new Random().nextInt(976) + 12; // 0~975 + 12 => 012~987 
		String ans = String.format("%03d", a);  // "012" ~ "987"
		System.out.println(ans);
		
		// 문자열의 해당 인덱스의 값을 가져옴
		// charAt() : 해당 인덱스에 있는 문자(char)를 반환
		// char 자료형은 ascii (특정 정수값) 코드값으로 사용되기 때문에 (.equals 가 아닌 == 로 각각의 값 비교)
		if (ans.charAt(0) == ans.charAt(1) 
				|| ans.charAt(0) == ans.charAt(2)
				|| ans.charAt(1) == ans.charAt(2)) {
			return pickAns();
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String ans = pickAns();
//		System.out.println(ans);
	}
	
//	public static void getNumber(HttpServletRequest request) {
//		Random r = new Random();
//		int comNum1 = r.nextInt(10);
//		int comNum2 = r.nextInt(9) + 1;
//		int comNum3 = r.nextInt(9) + 1;
//		
//		if (comNum1 == comNum2 || comNum1 == comNum3 || comNum2 == comNum3) {
//			getNumber(request);
//		}
//		
//		request.setAttribute("comNum1", comNum1);
//		request.setAttribute("comNum2", comNum2);
//		request.setAttribute("comNum3", comNum3);
//	}
}
