package com.point;

public class Point2D {
private int x,y;
	
	//Defining the parameterized constructor
	public Point2D(int x1,int y1) {
		x= x1;
		y=y1;
	}
	
	//Defining the display method
	public String getDetails()
	{
	   return "Point ("+x+","+y+")";
	}
}
