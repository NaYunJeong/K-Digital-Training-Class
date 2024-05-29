package com.nayun.may233.human;

import com.beaver.may233.Avengers.Avengers;

public class Human {
	private String name;
	private Avengers hero;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name) {
		super();
		this.name = name;
		System.out.println("내 이름은 " + name + " !");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pick(Avengers a) {
		hero = a;
		System.out.println("ㄷㅈ");
	}
	
	public void helpAaaaa() {
		hero.attack();
	}
}
