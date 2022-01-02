package com.shapescalculate;

public class Square {
	public void Area() {
		System.out.println("This method prints the area of square");
	}
	public void Area(int s) {
		System.out.println("The area is "+(s*s));
	}
	public float Area(float s) {
		return s*s;
	}
	public double Area(double s) {
		return s*s;
	}
}
