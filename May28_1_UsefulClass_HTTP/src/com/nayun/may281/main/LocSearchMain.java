package com.nayun.may281.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.nayun.http.client.NayunHttpClient;

// 카카오 https://developers.kakao.com/ 접속 - 로그인 - 내 애플리케이션
// 앱키 - REST API 키 복사
// f8770d180132ae1c23514061344fd981
// 구글 지도 - 위치 선택 - 주소창 좌표 확인
// 37.5044498 / 127.0245716 (y / x좌표)
// 카카오 - 문서 - 로컬 - rest api - 화면 우측 '키워드로 장소 검색하기' 
// https://dapi.kakao.com/v2/local/search/keyword.json
public class LocSearchMain {
	public static void main(String[] args) {
		// 위 기준점 주변 반경 5km이내에 검색한 키워드(입력)가 포함된 가게들을
		// 거리 기준으로 정렬
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("키워드 입력 : ");
			String keyword = k.next();
			keyword = URLEncoder.encode(keyword, "UTF-8");
			System.out.println(keyword);
			
			String address = "https://dapi.kakao.com/v2/local/search/keyword.json";
			address += "?query=" + keyword;	// 검색어
			address += "&x=127.0245716&y=37.5044498";
			address += "&radius=5000";
			address += "&sort=distance";
			
			//요청헤더 Authorization: KakaoAK f8770d180132ae1c23514061344fd981
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK f8770d180132ae1c23514061344fd981");
			
			InputStream is = NayunHttpClient.download(address, headers);
			String str = NayunHttpClient.convert(is, "UTF-8");
			System.out.println(str);
			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(str);
			
			// 총 검색 결과 수
			JSONObject meta = (JSONObject) jo.get("meta");
			System.out.printf("총 검색 결과 수 : %d개\n", meta.get("total_count"));
			
			// 현재 페이지 결과 수
			System.out.printf("현재페이지 결과 수 : %d개\n", meta.get("pageable_count"));
			
			// 주소
			// 전화번호
			// 상호명
			// 기준점과의 거리
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject data = null;
			for (int i = 0; i < ja.size(); i++) {
				data = (JSONObject) ja.get(i);
				System.out.printf("주소 : %s\n", data.get("address_name"));
				System.out.printf("전화번호 : %s\n", data.get("phone"));
				System.out.printf("상호명 : %s\n", data.get("place_name"));
				System.out.printf("거리 : %s\n", data.get("distance"));
				System.out.println("---------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
