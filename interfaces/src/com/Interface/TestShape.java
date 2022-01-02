package com.Interface;

interface shape{
	 void draw();
	 void color();
}

public class TestShape implements shape {
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is the draw method");
		
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("This is the color method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape obj=new TestShape();
		obj.draw();
		obj.color();

	}

}
