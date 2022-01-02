package com.employeedetail;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		employee1.setName("Rahul");
		employee1.setAge(25);
		employee1.setGender("male");
		employee1.setSalary(12000);
		
		Employee employee2=new Employee();
		employee2.setName("Rishitha");
		employee2.setAge(25);
		employee2.setGender("female");
		employee2.setSalary(12000);
		
		Employee employee3=new Employee();
		employee3.setName("Nisha");
		employee3.setAge(25);
		employee3.setGender("female");
		employee3.setSalary(12000);
		
		System.out.println("---Employee Details---");
		System.out.println("Name\tAge\tGender\tSalary");
		System.out.println(employee1.getName()+"\t"+employee1.getAge()+"\t"+employee1.getGender()+"\t"+employee1.getSalary());
		System.out.println(employee2.getName()+" "+employee2.getAge()+"  "+employee2.getGender()+"\t"+employee2.getSalary());
		System.out.println(employee3.getName()+"\t"+employee3.getAge()+"\t"+employee3.getGender()+"\t"+employee3.getSalary());
	}

}
