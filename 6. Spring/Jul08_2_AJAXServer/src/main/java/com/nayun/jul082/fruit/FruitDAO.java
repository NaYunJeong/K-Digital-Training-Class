package com.nayun.jul082.fruit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitDAO {

	@Autowired
	private SqlSession ss;
	
	public void getAllFruit(HttpServletRequest req) {
		
		try {
			List<Fruit> fruits = ss.getMapper(FruitMapper.class).getAllFruit();
			req.setAttribute("fruits", fruits);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Spring에서 XML 끌어오는 시스템 : XML AJAX Server (Asynchronous JavaScript And XML)
	//												Asynchronous : 비동기
	// 동기 : 사용자가 요청을 하고 서버에서 응답이 올때까지 아무것도 못하고 기다려야 함
	// 비동기 : 사용자가 요청을 보내놓고도 응답이 올 때까지 사용자가 다른 일을 할 수 있는 상황
	
	// AJAX 대표적 예시 : 검색창 자동완성 / 데이터를 끌고와서 출력없이 보여줌
	
	//	원래 : 웹페이지 전체를 새로 고쳤음
	//	페이지의 일부분만 서버에서 가지고와서 화면을 변경하는 방식
	
	//	현재] DB에 있는 과일데이터 하나를 표현할 JavaBean(Fruit.java)를 가지고 있는 상태
	//		우리가 필요한 것]
	//		1. DB에 있는 '과일테이블'을 표현할 또 하나의 JavaBean이 필요! => java class 하나 만들기(List)
	//		2. Spring이 XML로 바꿀 수 있도록 각각의 JavaBean에(Class명 위에) @XmlRootElement Annotation 달기
	//			=> Fruit / Fruits.class 에 각각 @XmlRootElement 달기
	//		3. Setter 위에 @XmlElement Annotation 달기 => Fruit / Fruits.class setter에 각각 @XmlElement 달기
	//			특정 데이터 => XML형태로 바꾸는 것 : 마샬링(Mashalling)
	
	public Fruits getXML(HttpServletRequest req) {
		List<Fruit> fruits = ss.getMapper(FruitMapper.class).getAllFruit();
		Fruits fruitss = new Fruits(fruits);
		return fruitss;
	}
	
	public Fruits searchXML(Fruit f, HttpServletRequest req) {
		return new Fruits(ss.getMapper(FruitMapper.class).searchFruit(f));
	}
	
	
	
	
	
}
