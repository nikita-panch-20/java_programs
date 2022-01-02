package com.studentassociation;

public class Society {
	private String society;
	
	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public void collegeSociety() {
		
		System.out.println("The student has joined "+society+" society in college");
	}

}
