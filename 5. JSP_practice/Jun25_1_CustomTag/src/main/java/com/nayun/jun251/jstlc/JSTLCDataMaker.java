package com.nayun.jun251.jstlc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class JSTLCDataMaker {
	public static void make(HttpServletRequest request) {
		int[] ar = { 123, 456, 78, 91, 234 };
		request.setAttribute("ar", ar);
		
		ArrayList<Nayun> al = new ArrayList<Nayun>();
		al.add(new Nayun("나윤", 3, 50.5, 10.1));
		al.add(new Nayun("나유", 2, 40.4, 9.9));
		al.add(new Nayun("나여", 5, 30.3, 6.6));
		al.add(new Nayun("나야", 1, 10.1, 3.3));
		request.setAttribute("al", al);
	}
}
