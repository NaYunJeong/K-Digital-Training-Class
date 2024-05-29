package com.nayun.may281.main;

import java.io.InputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.nayun.http.client.NayunHttpClient;

// AJAX - JavaScript에서 XML 파싱
//	Javascript를 사용한 비동기 통신, 
//	클라이언트와 서버간에 XML 데이터를 주고받는 기술
//		=> 요새는 XML 많이 안쓰임 (old해)
//		=> Javascript에 친화된 형태가 없을까...?

// JSON (JavaScript Object Notation)
//		DB에 있는 데이터를 Javascript형태로 표현한 것

// Java 배열 : { 1, 2, 3 }
// JS배열 : [ 1, 2, 3 ]

// Java 객체 : Dog d = new Dog();
//				d.setName("갱얼쥐");	// setter 통해서 값을 집어넣음
//				d.setAge(3);
// JS 객체 : { name : "갱얼쥐", age : 3 };

// 준비물 1. mvnrepository 사이트 - json simple 검색 - 첫번째 - 1.1.1 - view all - json-simple-1.1.1.jar 다운
// 프로젝트에 다운알집파일 + 전일NayunHttpClient_v1.0알집 넣기(build path)
// 2. 서울열린데이터광장 사이트 - 지하철 탭 3페이지 - "서울교통공사 역명의 유래" - open api - 주소 가져오기
// http://openapi.seoul.go.kr:8088/sample/json/TbSeoulmetroStOrigin/1/275/
// 인증키 4f626857416f6c6c3632586a416843

// 위 내용 String 으로 출력 (인코딩 UTF-8)
public class SubwayMain {
	public static void main(String[] args) {
		try {
			String address = "http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843"
					+ "/json/TbSeoulmetroStOrigin/1/275/";
			InputStream is = NayunHttpClient.download(address);
			String str = NayunHttpClient.convert(is, "UTF-8");
//			System.out.println(str);
			
			JSONParser jp = new JSONParser();
			
			JSONObject jo = (JSONObject) jp.parse(str);
//			System.out.println(jo);
			
			JSONObject metro = (JSONObject) jo.get("TbSeoulmetroStOrigin");
//			System.out.println(metro);
			
			JSONArray row = (JSONArray) metro.get("row");
//			System.out.println(row);
			
			JSONObject data = null;
			for (int i = 0; i < row.size(); i++) {
				data = (JSONObject) row.get(i);
				System.out.println(data.get("STATION_NAME"));
				System.out.println(data.get("LINE"));
				System.out.println(data.get("ORIGIN"));
				System.out.println("-----------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
