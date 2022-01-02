package com.calculate;
import java.util.*;
public class ToCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Subtraction sub=new Subtraction();
		Addition add=new Addition();
		Multiplication mul=new Multiplication();
		
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The Addition of two numbers is: "+add.add(a,b));
		System.out.println("The Subtraction of two numbers is: "+sub.subtract(a,b));
		System.out.println("The Multiplication of two numbers is: "+mul.multiply(a,b));
		
	}

}
