package com.nayun.may272.main;

import java.io.InputStream;

import com.nayun.http.client.NayunHttpClient;

public class HMain3 {
	public static void main(String[] args) {
		try {
			InputStream is = NayunHttpClient.download("https://www.naver.com");
			String result = NayunHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// 만든 파일을 다른 프로젝트에서도 사용해야하니 Export
// NayunHttpClient 우클릭 - Export - jar file - 클라스 잘 선택 후  저장경로 