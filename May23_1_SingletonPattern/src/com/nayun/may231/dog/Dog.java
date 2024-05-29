package com.nayun.may231.dog;

public class Dog {
	private String name;
	private int age;
	private String nickname;
	
	private static final Dog DOG = new Dog("비숑", 3, "자두");
	
	public static Dog getDog() {
		return DOG;
	}

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age, String nickname) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickname);
	}
}
