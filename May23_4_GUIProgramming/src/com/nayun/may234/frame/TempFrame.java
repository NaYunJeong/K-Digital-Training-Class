package com.nayun.may234.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 화씨온도 => 섭씨온도 변환기
public class TempFrame implements ActionListener {
	private JTextField field1;
	private JTextField field2;
	
	public TempFrame() {
		// TODO Auto-generated constructor stub
	}
	
	public TempFrame(JTextField field1, JTextField field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double fahrenheit = Double.parseDouble(field1.getText());
		double celcius = (double) 5 / 9 * (fahrenheit - 32);
		
		String c = new DecimalFormat("##.####").format(celcius);
		field2.setText(c);
	}
	
//	public TempFrame() {
//		pl.setSize(500, 300);
//		pl.setLayout(new BorderLayout());
//		System.out.print("화씨온도 = ");
//		Scanner k = new Scanner(System.in);
//		int fahrenheit = k.nextInt();
//		int celsius = fahrenheit
//		pl.add(new JButton("변환"));
//		
		
}
	

