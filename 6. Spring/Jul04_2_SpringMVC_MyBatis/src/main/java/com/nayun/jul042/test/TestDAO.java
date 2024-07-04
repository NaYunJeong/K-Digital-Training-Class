package com.nayun.jul042.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestDAO {

	@Autowired		// DB관련 불러오기
	private SqlSession ss;
	
	public void regTest(Test t, HttpServletRequest req) {
		
		try {
			// View(input.jsp)에 파라미터 3개(t_y, t_m, t_d -> t_when 합쳐줄리없지??)
			// DAO에서 처리
			String t_y = req.getParameter("t_y");
			
			// 2024 1 1 => SimpleDateFormat
			// 202411 => 2024년 11월 ? / 2024년 1월 1일 ?
			int t_m = Integer.parseInt(req.getParameter("t_m"));
			int t_d = Integer.parseInt(req.getParameter("t_d"));
			
			String t_when2 = String.format("%s%02d%02d", t_y, t_m, t_d); // 20240101
			SimpleDateFormat sdg = new SimpleDateFormat("yyyyMMdd");
			
			Date t_when = sdg.parse(t_when2);
			t.setT_when(t_when);
			
			if (ss.getMapper(TestMapper.class).regTest(t) == 1) {
				req.setAttribute("r2", "시험 접수 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r2", "시험 접수 실패");
		}
	}
	
	public void getAllTest(HttpServletRequest req) {
		try {
			List<Test> tests = ss.getMapper(TestMapper.class).getAllTest();
			req.setAttribute("tests", tests);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
