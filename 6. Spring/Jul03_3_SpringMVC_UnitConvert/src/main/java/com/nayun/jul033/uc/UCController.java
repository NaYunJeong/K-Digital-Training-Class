package com.nayun.jul033.uc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UCController {
	
	@Autowired
	private UCDAO ucd;	// servlet-context 의 id명 매칭해서 불러오기(26번줄)
	
	@RequestMapping(value = "/unit.convert", method = RequestMethod.GET)
	public String unitConvert(UCResult ur, HttpServletRequest req) {
		ucd.convert(ur, req);
		return "output";
	}
	
}






