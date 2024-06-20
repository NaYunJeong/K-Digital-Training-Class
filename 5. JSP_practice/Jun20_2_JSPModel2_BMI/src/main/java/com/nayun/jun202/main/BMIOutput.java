package com.nayun.jun202.main;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jdt.internal.compiler.parser.Scanner;

public class BMIOutput {
	public static void getInfo(HttpServletRequest request) {
		String name = request.getParameter("name");
		double weight = Double.parseDouble(request.getParameter("weight"));
		double height = Double.parseDouble(request.getParameter("height"));
		
	}
}
