package com.nayun.jul032.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 새로운 패키지를 만들때는 top-level-package 뒤에 추가
// com.nayun.jul032.calc - O
// com.nayun.calc - X
// com.calc - X
// calc - X

@Controller
public class CalcController {
	
	// 1. JSP 스타일 - 파일업로드, 날짜, ... => Spring을 사용한다고 거르지 않기 !
	//	요청파라미터 : String => 형변환해서 사용
//	@RequestMapping(value = "calculate.do", method = RequestMethod.GET)
//	public String calcXY(HttpServletRequest req) {
//		int x = Integer.parseInt(req.getParameter("x"));
//		int y = Integer.parseInt(req.getParameter("y"));
//		System.out.println(x);
//		System.out.println(y);
//		return "index";
//	}
	
	// GET방식 요청파라미터에(주소에..) 한글처리
	//		: Tomcat 설정 (server.xml)
	//		자동으로 인코딩할 때 어떤 방식을 쓸 지 server.xml 63번줄
	//		URIEncoding="UTF-8"
	
	// POST방식 요청파라미터에(서부내부에..) 한글처리
	//		: 프로젝트 설정
	//		JSP : 파라미터값 읽기 전에 req.setCharacterEncoding("UTF-8");
	//		Spring : web.xml에 설정
	
	// 2. Spring 스타일
//	@RequestMapping(value = "calculate.do", method = RequestMethod.POST)
//	public String calcXY(
//			@RequestParam(value="name") String name,
//			@RequestParam(value="x") int x,
//			@RequestParam(value="y") int y) {
//		System.out.println(name);
//		System.out.println(x);
//		System.out.println(y);
//		return "index";
//	}
	
	// 3. Spring 스타일2
	
	@Autowired
	private CalcDAO cDAO;	// servlet-context.xml에 등록된
							// CalcDAO객체와 자동으로 연결 !!!
	
	@RequestMapping(value = "calculate.do", method = RequestMethod.POST)
	public String calcXY(CalcResult cr, HttpServletRequest req) {
//		CalcDAO cDAO = new CalcDAO();
//		cDAO.calculate(cr, req);
		
		cDAO.calculate(cr, req);
		return "index";
	}
	
}






