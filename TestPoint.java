package com.point;
import java.util.Scanner; // use this package to invoke the Scanner class.

public class TestPoint {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of point1 : "); //Taking the value of point 1
		int p1x,p1y;
		p1x = sc.nextInt();
		p1y = sc.nextInt();
		Point2D pt = new Point2D(p1x,p1y);
		
		
		System.out.println(pt.getDetails());
		
		System.out.println("Enter the values of Point2 : "); //Taking the value of point 1
		int p2x,p2y;
		p2x = sc.nextInt();
		p2y = sc.nextInt();
		Point2D pt1 = new Point2D(p2x,p2y);
		
		
		System.out.println(pt1.getDetails());
	}

}
