package com.nayun.may234.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.nayun.may234.frame.TempFrame;

public class GMain3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jf.add(jp);
		
		JLabel label1 = new JLabel("화씨온도 : ");
		JTextField field1 = new JTextField(15);
		JLabel label2 = new JLabel("섭씨온도 : ");
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");
		
		jp.add(label1);
		jp.add(field1);
		jp.add(label2);
		jp.add(field2);
		jp.add(button);
		
		TempFrame tFrame = new TempFrame(field1, field2);
		button.addActionListener(tFrame); // 버튼 눌렀을 때 기능 동작하게!
		
		jf.setSize(300, 150);
		// 프레임을 종료하면 프로그램을 종료!
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("온도 변환기");
		jf.setVisible(true);
		
	}
}
