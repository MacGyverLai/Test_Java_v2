package com.yesee.intrerview;

import org.junit.Test;

public class Test1Test {

	@Test
	public void test() {
		Test1 test1 = new Test1();
		org.junit.Assert.assertTrue(233  == test1.test(13));
		org.junit.Assert.assertTrue(28657  == test1.test(23));
		org.junit.Assert.assertTrue(832040 == test1.test(30));
		
	}

}
