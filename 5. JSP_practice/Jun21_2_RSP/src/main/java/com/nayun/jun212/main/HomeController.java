package com.nayun.jun212.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Java + JSP + CSS + Servlet
//	가위바위보 게임 페이지를 만들 것
//	디자인은 알아서 (가위/바위/보 중에 하나를 누르면 게임 한판 진행)
//	WAS 종료할 때까지 전적은 쌓이게 => 매판 진행할 때마다 전적이 보이도록(바뀌도록)

// 문제 : GET방식 요청을 할 때마다 전적이 안쌓임
//		해결책 : 엔진 하나!!! => Singleton Pattern!

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			request.getRequestDispatcher("RSP.jsp").forward(request, response);
			request.setAttribute("uh", "");
			request.setAttribute("ch", "");
		} else {
			// RSPGameEngine rge = new RSPGameEngine();
			RSPGameEngine rge = RSPGameEngine.getRge();
			rge.doRSP(request);
		}
		request.getRequestDispatcher("RSP.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RSPGameEngine rge = RSPGameEngine.getRge();
		rge.reset(request);
		request.setAttribute("uh", "");
		request.setAttribute("ch", "");
		request.getRequestDispatcher("RSP.jsp").forward(request, response);
	}
}
