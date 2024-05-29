package com.nayun.may225.avengers;

import com.nayun.may225.driver.Driver;
import com.nayun.may225.smoker.Smoker;

public class Ironman extends Avengers implements Smoker, Driver {
	int property;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, int property) {
		super(name, age);
		this.property = property;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(property);
	}
	
	@Override
	public void attack() {
		System.out.println("비이이이이이이이임!");
	}
	
	@Override
	public void smoke() {
		System.out.println("담배ㄱ");
	}
	
	@Override
	public void drive() {
		System.out.println("운전ㄱ");
	}
}
