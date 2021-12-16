package com.myPackage.oops.part4_abstract_classes;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get the raw materials");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("Prepare the Dish");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("Clean up");
	}

}
