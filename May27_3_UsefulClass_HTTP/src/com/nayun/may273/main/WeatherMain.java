package com.nayun.may273.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.nayun.http.client.NayunHttpClient;

// 기상청 홈페이지 - 하단 오른쪽 RSS 클릭 - 사는 동네(시도- 선택 -> 구군- 선택 -> 읍면동- 선택 => 3시간별 RSS) 골랐을 때의 주소값

// http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1121581000

// 주소값에 요청을 해서 
// 시간 : hour
// 온도 : temp
// 날씨 : wfKor
// 바람 방향 : wdKor
// 콘솔 출력

public class WeatherMain {
	public static void main(String[] args) {
		try {
			String address = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1121581000";
			
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
					if (tagName.equals("hour")) {
						System.out.printf("시간 : ~%s시, ", xpp.getText());
					} else if (tagName.equals("temp")) {
						System.out.printf("온도 : %s℃, ", xpp.getText());
					} else if (tagName.equals("wfKor")) {
						System.out.printf("날씨 : %s, ", xpp.getText());
					} else if (tagName.equals("wdKor")) {
						System.out.printf("풍향 : %s\n", xpp.getText());
						System.out.println("===============================================");
					}
				} else if (type == XmlPullParser.END_TAG){
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
