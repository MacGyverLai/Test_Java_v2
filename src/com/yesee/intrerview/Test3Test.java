package com.yesee.intrerview;

import org.junit.Assert;
import org.junit.Test;

import com.yesee.intrerview.Test3.ListNode;

public class Test3Test {

	@Test
	public void test() {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(11);
		ListNode c = new ListNode(25);
		ListNode d = new ListNode(47);
		a.next = b;
		b.next = c;
		c.next = d;

		ListNode a1 = new ListNode(2);
		ListNode b1 = new ListNode(14);
		ListNode c1 = new ListNode(26);
		ListNode d1 = new ListNode(38);
		
		a1.next = b1;
		b1.next = c1;
		c1.next = d1;
		Test3 test3 = new Test3();
		ListNode result = test3.test(a,a1);
		Assert.assertEquals(result.val, 1);
		result = result.next;
		Assert.assertEquals(result.val, 2);
		result = result.next;
		Assert.assertEquals(result.val, 11);
		result = result.next;
		Assert.assertEquals(result.val, 14);
		result = result.next;
		Assert.assertEquals(result.val, 25);
		result = result.next;
		Assert.assertEquals(result.val, 26);
		result = result.next;
		Assert.assertEquals(result.val,38);
		result = result.next;
		Assert.assertEquals(result.val, 47);

	}

}
