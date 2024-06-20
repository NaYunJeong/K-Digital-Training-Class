package com.nayun.jun202.main;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

// 기능을 담당해줄 M(Model)
public class Doctor {
	public static void calculate(HttpServletRequest request) {
		
		try {
			request.setCharacterEncoding("UTF-8");
			String path = request.getServletContext().getRealPath("img");
			System.out.println(path);
			
			MultipartRequest mr = new MultipartRequest(request, path, 
					30 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy());
			
			String name = mr.getParameter("name");
			double weight = Double.parseDouble(mr.getParameter("weight"));		
			double height = Double.parseDouble(mr.getParameter("height"));		
			height /= 100;
			double bmi = weight / (height * height);
			String result = "저체중";
			if (bmi >= 40) {
				result = "고도비만";
			} else if (bmi >= 35) {
				result = "중증도비만";
			} else if (bmi >= 30) {
				result = "경도비만";
			} else if (bmi >= 25) {
				result = "과체중";
			} else if (bmi >= 18.5) {
				result = "정상";
			}
					
			String bmi2 = String.format("%.2f", bmi);
			double bmi3 = Double.parseDouble(bmi2);
			
			String image = mr.getFilesystemName("photo");
			image = URLEncoder.encode(image, "UTF-8");
			image = image.replace("+", " ");
			
			// 객체를 만들어서 한꺼번에 보내자 (Attribute) => 손님 객체 생성
			Guest g = new Guest(name, height, weight, bmi3, image, result);
			// mr.setAttribute("g", g);  => mr에는 Attribute 기능이 없음
			//	 MulltipartRequest는 단순히 form의 내용과 파일 등을 받아오기 위한 용도
			// HttpServletRequest 클래스를 활용해서만 attribute를 생성할 수 있음 !
			request.setAttribute("g", g);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
