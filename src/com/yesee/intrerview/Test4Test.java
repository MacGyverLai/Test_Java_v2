package com.yesee.intrerview;

import org.junit.Assert;
import org.junit.Test;

public class Test4Test {
	
	@Test
	public void test(){
		Test4 test4 = new Test4();
		int[] test = {56,32,67,32,66,31,75,49,32,56};
		int[] a =  test4.test(test);
		int[] answer = {31,32,32,32,49,56,56,66,67,75};
		Assert.assertArrayEquals(answer, a);
		
		int[] test2 = {5,32,67,33,66,31,75,69,22,56};
		int[] a2 =  test4.test(test2);
		int[] answer2 = {5,22,31,32,33,56,66,67,69,75};
		Assert.assertArrayEquals(answer2, a2);
		
		int[] test3 = {86,12,67,42,66,31,75,59,32,56};
		int[] a3 =  test4.test(test3);
		int[] answer3 = {12,31,32,42,56,59,66,67,75,86};
		Assert.assertArrayEquals(answer3, a3);
	}
}
