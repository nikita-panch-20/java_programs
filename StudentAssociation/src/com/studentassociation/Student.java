package com.studentassociation;

public class Student {
	private String name;
	private int rollno;
	private String city;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void studentBranch() {
		Branch b=new Branch();
		b.setBranch("CSE");
		b.studiesBranch();
	}
	public void studentSociety() {
		Society s=new Society();
		s.setSociety("Literature");
		s.collegeSociety();
	}

}
