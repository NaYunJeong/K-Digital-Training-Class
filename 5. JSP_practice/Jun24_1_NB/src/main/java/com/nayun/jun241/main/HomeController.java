package com.nayun.jun241.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 숫자 야구
//	3자리 숫자 (백의자리 숫자는 0 가능), 중복 숫자 X
//	입력 하는 부분(input)
//		1. 숫자 아닌 것은 입력 못하게 (값이 안넘어가게)
//		2. 중복 숫자 입력 시 다시 입력하도록
//		3. 무조건 3자리 숫자여야 함
//		유효성 검사!

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			NBGameEngine.getNge().pickAns();
		} else {
			NBGameEngine.getNge().doNB(request);
		}
		request.getRequestDispatcher("nb.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
