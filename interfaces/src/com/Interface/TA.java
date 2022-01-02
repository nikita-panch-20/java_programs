package com.Interface;
import java.util.*;
interface Student{
	void majorSubject(int n);
	void netQualified(int n);
}

interface Teacher{
	void department();
	void salary();
}
public class TA implements Student,Teacher{
@Override
public void majorSubject(int n) {
	// TODO Auto-generated method stub
	System.out.println("The Student has "+n+" subjects");
}
@Override
	public void netQualified(int n) {
		// TODO Auto-generated method stub
		System.out.println("The total credits are "+(n*3));
	}
@Override
	public void department() {
		// TODO Auto-generated method stub
		System.out.println("The student belongs to Literature Department");
	}
@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("The Salary is 12000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TA ta=new TA();
		System.out.println("Enter the number of subjects");
		int n=sc.nextInt();
		ta.majorSubject(n);
		ta.netQualified(n);
		ta.department();
		ta.salary();
		
	}

}
