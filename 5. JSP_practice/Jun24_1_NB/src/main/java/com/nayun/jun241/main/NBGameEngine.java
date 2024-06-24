package com.nayun.jun241.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class NBGameEngine {
	private int t;
	private String ans;
	
	private static final NBGameEngine NGE = new NBGameEngine();
	
	private NBGameEngine() {
		// TODO Auto-generated constructor stub
	}

	public static NBGameEngine getNge() {
		return NGE;
	}

	public void pickAns() {
		int a = new Random().nextInt(976) + 12;
		String ans = String.format("%03d", a);
		if (ans.charAt(0) == ans.charAt(1)
				|| ans.charAt(0) == ans.charAt(2)
				|| ans.charAt(1) == ans.charAt(2)) {
			pickAns();
			return;	// 리퀄시브 상태라서 return 안하면 첫번째 메소드 호출했을 때의 값을 담게됨
		}
		this.ans = ans;
	}
	
	public void doNB(HttpServletRequest request) {
		System.out.println(ans);
		String userAns = request.getParameter("userAns");
		request.setAttribute("ua", "유저의 답 : " + userAns);
	
		int strike = 0;
		int ball = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (userAns.charAt(i) == ans.charAt(j)) {
					if (i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		
		t++;
		request.setAttribute("t", t + "번째 시도 !");
		request.setAttribute("s", "S : " + strike);
		request.setAttribute("b", "B : " + ball);
		if (strike == 3) {
			String result = "정답 !" + ans + " 이었습니다 !";
			t = 0;
			request.setAttribute("r", result);
			request.setAttribute("ua", null);
			request.setAttribute("s", null);
			request.setAttribute("b", null);
			request.setAttribute("btn", "<button onclick='goHome();'>다시 시작</button>");
			request.setAttribute("con", "<script>alert('ㅊㅋㅊㅋ');</script>");
		}
	}
}
