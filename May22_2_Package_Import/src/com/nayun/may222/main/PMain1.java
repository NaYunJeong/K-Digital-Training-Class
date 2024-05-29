package com.nayun.may222.main;

import com.nayun.may222.product.Computer; // 컴퓨터class에 있는 것들을 import했다(가져왔다)
import com.nayun.may222.product.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		// 매직스테이션, 800000원, i5-1234, 8GB, 500GB 컴퓨터
		// 출력
		Computer c = new Computer("매직스테이션", 800000, "i5-1234", 8, 500);	// 1.
		c.printInfo();
		System.out.println("-----------");
		// 멀티익스프레스, 500000원 스캐너
		// 출력
		com.nayun.may222.product.Scanner s 
			= new com.nayun.may222.product.Scanner("멀티익스프레스", 500000);	// 2.
		s.printInfo();
		System.out.println("-----------");
		
	}
}
