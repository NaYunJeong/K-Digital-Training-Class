package com.nayun.may281.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.nayun.http.client.NayunHttpClient;

// 네이버 디벨로퍼 - client Id/ secret 
// ID : 1eFvj50LoTCSGgY_S07x
// Secret : TRi3rapCOJ
// 서비스API - 검색 - 뉴스 - 하단 요청URL- XML값
// https://openapi.naver.com/v1/search/news.xml

// https://search.naver.com/search.naver?ssc=tab.news.all&where=news&sm=tab_jum
// &query=%EA%B8%B0%EC%95%84%ED%83%80%EC%9D%B4%EA%B1%B0%EC%A6%88

// 인터넷 주소 체계
//	프로토콜:// - 통신방식
//		컴퓨터의 주소/ (search.naver.com)
//		폴더명/폴더명/.../파일명 (search.naver)
//		? 다음에 나오는 
//			변수명=값&변수명=값&변수명=값...
//			=> 요청 파라미터 : 클라이언트가 서버에게 공개적으로 전달할 정보

// 주소에 한글, 특수문자가 바로 들어가면 안됨
//		ex) ㅋ => %2D (=> URL Encoding)

// 검색어 하나를 콘솔에 입력
//		=> 나오는 결과를 하나의 String 변수에 담아서 출력

public class NaverNewsMain {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색어 : ");
			String search = k.next();
			System.out.println(search);
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
		
			String address = "https://openapi.naver.com/v1/search/news.xml";
			address += "?query=" + search;
			
//			InputStream is = NayunHttpClient.download(address);
//			String result = NayunHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
			
			// 401코드 오류발생 => ID/ Secret
			// HttpURLConnection 활용 => 안에 있는 기능으로 처리해보자
			URL u = new URL(address);
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			
			// 요청 헤더 : 요청하기 전에 내부로 데이터를 전송
//			huc.addRequestProperty("X-Naver-Client-Id", "1eFvj50LoTCSGgY_S07x");
//			huc.addRequestProperty("X-Naver-Client-Secret", "TRi3rapCOJ");
//			
//			InputStream is = huc.getInputStream();
//			String result = NayunHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id", "1eFvj50LoTCSGgY_S07x");
			headers.put("X-Naver-Client-Secret", "TRi3rapCOJ");
			InputStream is = NayunHttpClient.download(address, headers);
//			String result = NayunHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
			
			// 뉴스의 title / description
			// 제목 : Naver Open API - news
			// 내용 : Naver Search Result => 안나오게
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			boolean data = false;
			String t = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("item")) {
						data = true;
					}
				} else if (type == XmlPullParser.TEXT) {
					if (data) {
						if (tagName.equals("title")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "");
							t = t.replace("&amp;", "");
							System.out.printf("제목 : %s\n", t);
						} else if (tagName.equals("description")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "");
							t = t.replace("&amp;", "");
							System.out.printf("제목 : %s\n", t);
							System.out.println("---------------");
						}
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
			
//			JSONParser jp = new JSONParser();
//			
//			JSONObject jo =  (JSONObject) jp.parse(result);
//			
//			JSONObject item = (JSONObject) jo.get("item"); 
//			String title = (String) item.get("title");
//			System.out.println(title);
//			String description = (String) item.get("description");
//			System.out.println(description);
//			
//			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
