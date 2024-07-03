package com.nayun.jul033.uc;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class UCDAO {
	
	private HashMap<String, String> unit;	// HashMap으로 단위 받아올거야
	
	public void setUnit(HashMap<String, String> unit) {	// setter만 받아오기
		this.unit = unit;
	}

	public void convert(UCResult ur, HttpServletRequest req) {
		double n1 = ur.getN1();
		String what = req.getParameter("what");
		double n2 = n1 * 1.61;
		if (what.equals("length")) {
			n2 = n1 * 0.39;
		} else if (what.equals("width")) {
			n2 = n1 * 0.3;
		} else if (what.equals("temp")) {
			n2 = n1 * 1.8 + 32;
		}
		
		// 단위들은 어떻게 받아올 것인가?
		System.out.println(unit);
		System.out.println(unit.get(what));
		
		String[] u = unit.get(what).split(",");
		
		ur.setN2(n2);
		ur.setU1(u[0]);
		ur.setU2(u[1]);
		
		
		req.setAttribute("ur", ur);
	}
}
