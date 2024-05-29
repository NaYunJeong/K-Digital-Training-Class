package com.nayun.may273.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import com.nayun.http.client.NayunHttpClient;

// 미세먼지 => 파싱 => 값들을 => txt파일에 담기
// (프로그램 실행 시) 날짜, 측정구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
// 날짜형식 : 연-월-일-오전/오후-시-요일
// 단위 X

public class AirpollutionMain2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\sdedu\\Desktop\\Test1/Airpoll.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-a-hh-E");
			String nowStr = sdf.format(now);
			
			String address = "http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843"
					+ "/xml/RealtimeCityAir/1/25/";
			
			InputStream is = NayunHttpClient.download(address);
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("MSRSTE_NM")) {
						bw.write(nowStr + ",");
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("PM10")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("PM25")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("O3")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("IDEX_MVL")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}
				} else if (type == XmlPullParser.END_TAG){
					tagName = "";	// XML에서는 띄어쓰기를 텍스트로 인식하는 경우가 있어서 빈칸으로 바꿔줌
				}
				xpp.next();	// 다음걸로 넘어감
				type = xpp.getEventType();	// 다음 태그의 값을 가짐
				System.out.println("파일 생성 완료 !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
