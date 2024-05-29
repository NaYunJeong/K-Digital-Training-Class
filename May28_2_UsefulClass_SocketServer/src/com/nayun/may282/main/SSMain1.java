package com.nayun.may282.main;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 2인 1조 예제
// 짝꿍 - server(28_2 프로젝트)
// 나 - client(28_3 프로젝트)

public class SSMain1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(1528);	// 서버가 번호 입력 
											// 콘솔창 연결되면 = 1900,0
											// 영어 (소문자)l 입력 
			System.out.println("...");
			
			Socket s = ss.accept();
			System.out.println("연결됨 !");
			
			Scanner k = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while (true) {
				System.out.print("나] ");
				String msg = k.next();
				bw.write(msg + "\r\n");
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				ss.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
