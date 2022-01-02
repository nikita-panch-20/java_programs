package com.Interface;

interface Drawable{
	void draw();
	static void squareArea(int s) {
		System.out.println("The area is "+(s*s));
	}
	
	
}
public class Square implements Drawable{
@Override

public void draw() {
	// TODO Auto-generated method stub
	System.out.println("This is a square");
}
}
