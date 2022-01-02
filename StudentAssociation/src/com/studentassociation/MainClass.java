package com.studentassociation;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		UndergradStudent ug=new UndergradStudent();
		System.out.println("Enter the name of student :");
		ug.setName(sc.nextLine());
		
		System.out.println("Enter the RollNo of student :");
		ug.setRollno(sc.nextInt());
		
		System.out.println("Enter the city of student :");
		ug.setCity(sc.next());
		
		System.out.println("Enter the year of student :");
		ug.setYear(sc.nextInt());
		
		ug.displayStudentDetails();
		ug.studentBranch();
		ug.studentSociety();
		
	}

}
