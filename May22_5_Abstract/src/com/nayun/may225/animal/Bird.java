package com.nayun.may225.animal;

import com.nayun.may225.bite.Bite;

// Java에서 클래스끼리는 다중상속 X (1대 1로만 상속 가능)
// 클래스 + 인터페이스는 다중상속 O
public class Bird extends Animal implements Bite /*, fly, eat, ... */ {
	private int leg;
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String sort, int age, int leg) {
		super(sort, age);
		this.leg = leg;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(leg);
	}
	
	@Override
	public void roar() {
		System.out.println("으아 ~ 짹짹이에요 ~");
	}
	
	@Override
	public void bite() {
		System.out.println("새는 부리로 찢어");
	}
}
