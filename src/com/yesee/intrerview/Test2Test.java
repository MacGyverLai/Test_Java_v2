package com.yesee.intrerview;

import org.junit.Assert;
import org.junit.Test;

public class Test2Test {
	
	@Test
	public void test(){
		Test2 test2 = new Test2();
		int[] expecteds = test2.test(10, 34);
		int[] actuals = {11,13,17,19,23,29,31}; 
		Assert.assertArrayEquals(expecteds, actuals);
		
		int[] expecteds2 = test2.test(78, 152);
		int[] actuals2 = {79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151}; 
		Assert.assertArrayEquals(expecteds2, actuals2);
		
		int[] expecteds3 = test2.test(6, 40);
		int[] actuals3 = {7, 11, 13, 17, 19, 23, 29, 31, 37}; 
		Assert.assertArrayEquals(expecteds3, actuals3);
	}
	
}
