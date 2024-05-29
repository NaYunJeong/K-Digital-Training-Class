package com.nayun.may272.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

// Java에 HTTP통신이 생겼음 ! => HttpClinet 필요없음 ㅎㅎㅎ;;;

// http 
// https
public class HMain2 {
	public static void main(String[] args) {
		try {
			String address = "https://www.naver.com";
			URL u = new URL(address);
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();	// 빨간줄 1번째- 형변환
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
