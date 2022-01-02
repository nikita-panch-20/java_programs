package com.association;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda hondaAmaze=new Honda();
		
		hondaAmaze.setColor("blue");
		hondaAmaze.setSpeed(160);
		hondaAmaze.carDetails();
		
		hondaAmaze.hondaStartEngine();
		hondaAmaze.hondaMusicPlayer();
		
		Honda hondaJazz=new Honda();
		hondaJazz.setColor("black");
		hondaJazz.setSpeed(180);
		hondaJazz.carDetails();
		
		hondaJazz.hondaStartEngine();
		hondaJazz.hondaMusicPlayer();
		

	}

}
