package com.yesee.intrerview;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class Test6Test {
	
	@Test
	public void test(){
		Test6 test6 = new Test6();
		
		Point[] points = new Point[3];
		points[0] = new Point(1, 7);
		points[1] = new Point(3, 4);
		points[2] = new Point(5, 1);
		Point[] a = test6.test(points);
		
		Point[] ansPoints = new Point[2];
		ansPoints[0] = new Point(1, 7);
		ansPoints[1] = new Point(5, 1);
		
		Assert.assertArrayEquals(a, ansPoints);
		
		Point[] points2 = new Point[3];
		points2[0] = new Point(2, 8);
		points2[1] = new Point(4, 5);
		points2[2] = new Point(6, 2);
		Point[] a2 = test6.test(points2);
		
		Point[] ansPoints2 = new Point[2];
		ansPoints2[0] = new Point(2, 8);
		ansPoints2[1] = new Point(6, 2);
		
		Assert.assertArrayEquals(a2, ansPoints2);
		
		Point[] points3 = new Point[3];
		points3[0] = new Point(2, 8);
		points3[1] = new Point(4, 5);
		points3[2] = new Point(6, 2);
		Point[] a3 = test6.test(points3);
		
		Point[] ansPoints3 = new Point[2];
		ansPoints3[0] = new Point(2, 8);
		ansPoints3[1] = new Point(6, 2);
		
		Assert.assertArrayEquals(a3, ansPoints3);
		
		
	}
}
