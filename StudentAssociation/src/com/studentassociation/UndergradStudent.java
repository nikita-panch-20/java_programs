package com.studentassociation;

public class UndergradStudent extends Student {
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayStudentDetails() {
		System.out.println("Name : "+getName());
		System.out.println("Roll Number : "+getRollno());
		System.out.println("City : "+getCity());
		System.out.println("Current Year : "+getYear());
	}
}
