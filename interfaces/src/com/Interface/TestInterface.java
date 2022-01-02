package com.Interface;

interface Interface1{
	void display();
}
interface Interface2{
	void display();
}
public class TestInterface implements Interface1,Interface2{
@Override
public void display() {
	// TODO Auto-generated method stub
	System.out.println("This is the display method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 obj=new TestInterface();
		obj.display();
	}

}
