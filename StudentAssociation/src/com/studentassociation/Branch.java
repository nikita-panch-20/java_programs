package com.studentassociation;

public class Branch {
	private String branch;
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void studiesBranch() {
		System.out.println("Student has taken admission in "+branch+" branch");
	}

}
