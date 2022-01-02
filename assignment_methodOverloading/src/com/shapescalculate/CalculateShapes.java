package com.shapescalculate;
import java.util.*;
public class CalculateShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Square sq=new Square();
		sq.Area();
		System.out.println("Enter the side in integer type");
		sq.Area(sc.nextInt());
		System.out.println("Enter the side in float type");
		System.out.println("The area is "+sq.Area(sc.nextFloat()));
		System.out.println("Enter the side in double type");
		System.out.println("The Area is "+sq.Area(sc.nextDouble()));
	}

}
