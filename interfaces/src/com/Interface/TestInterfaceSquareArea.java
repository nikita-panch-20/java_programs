package com.Interface;
import java.util.*;
public class TestInterfaceSquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Square sq=new Square();
		sq.draw();
		System.out.println("Enter the side of the square");
		
		Drawable.squareArea(sc.nextInt());
	}

}
