package com.test;

import java.util.*;
import com.calculatearea.*;

public class ToCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Rectangle r=new Rectangle();
		Square sq=new Square();
		RectanglePerimeter rPerimeter=new RectanglePerimeter();
		SquarePerimeter sqPerimeter = new SquarePerimeter();
		
		System.out.println("Enter the side of square:");
		int s=sc.nextInt();
		System.out.println("The area of square is: "+sq.sArea(s));
		System.out.println("The perimeter of square is: "+sqPerimeter.sPerimeter(s));
		
		System.out.println("Enter the length of rectangle:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle:");
		int b=sc.nextInt();
		System.out.println("The area of rectangle is: "+r.rArea(l, b));
		System.out.println("The perimeter of rectangle is: "+rPerimeter.rPerimeter(l, b));
		
	}

}
