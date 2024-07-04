package com.nayun.jul042.test;

import java.util.List;

public interface TestMapper {
	
	// 추상메소드 작성
	public abstract int regTest(Test t);
	public abstract List<Test> getAllTest();
}
