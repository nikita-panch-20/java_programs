package com.hierarchial;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese c=new Chinese();
		c.servesNoodles();
		c.useIngredients();
		c.useVegetables();
		System.out.println("\n");
		Mexican m=new Mexican();
		m.servesNachosAndPotatoes();
		m.useIngredients();
		m.useVegetables();
		System.out.println("\n");
		Italian i=new Italian();
		i.servesPasta();
		i.useIngredients();
		i.useVegetables();

	}

}
