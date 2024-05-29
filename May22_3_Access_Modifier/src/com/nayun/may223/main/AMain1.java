package com.nayun.may223.main;

import com.nayun.may223.dog.Dog;

public class AMain1 extends Dog { // Dog가 상위클래스, AMain1이 하위클래스임..
	public static void main(String[] args) {
		Dog dog = new Dog();
		
//		dog.a = 1;		// 제한 X
//		dog.b = 2;		// dog는 상위 class
//		dog.c = 3;		// 다른 package
//		dog.d = 4;		// 다른 class
		
		AMain1 amain = new AMain1();
		amain.a = 1;	// 'a'는 public, 접근 가능!
		amain.b = 2;	// 'b'는 protected, 접근 가능!
		// Amain1이 Dog의 하위 클래스이고, AMain1의 인스턴스를 통해 protected 멤버변수에 접근 O
//		amain.c = 3;	// 'c'는 default, 접근 불가능!(다른 패키지)
//		amain.d = 4;	// 'd'는 private, 접근 불가능!(다른 클래스)
		
		// 접근 범위 순서대로 나열
		// private < default < protected < public
		
	}
}
