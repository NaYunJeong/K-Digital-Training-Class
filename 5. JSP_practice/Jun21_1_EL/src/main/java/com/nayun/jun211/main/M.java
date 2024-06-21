package com.nayun.jun211.main;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class M {
	public static void multiply(HttpServletRequest request) {
		int x = Integer.parseInt(request.getParameter("x"));	// x, y 가져오기
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x * y;
		request.setAttribute("z", z);	// z를 심어주기
		
		Nayun n = new Nayun("나윤", 29, 155.8, 47.3);
		request.setAttribute("n", n);
		
		ArrayList<Nayun> ny = new ArrayList<Nayun>();
		ny.add(n);
		ny.add(new Nayun("나유", 32, 170.2, 50.2));
		ny.add(new Nayun("나여", 53, 167.5, 51.7));
		ny.add(new Nayun("나야", 18, 159.6, 48.1));
		request.setAttribute("ny", ny);
	}
}
