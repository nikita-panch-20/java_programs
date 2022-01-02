package com.Interface;

interface Vehicle{
	void numberOfWheeler();
}
interface Max_Speed extends Vehicle{
	void speed();
}
public class Bike implements Max_Speed{
	@Override
	public void numberOfWheeler() {
		// TODO Auto-generated method stub
		System.out.println("2- wheeler Bike");
	}
@Override
public void speed() {
	// TODO Auto-generated method stub
	System.out.println("Speed : 120 kmph");
}
}
