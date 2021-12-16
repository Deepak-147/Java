package com.myPackage.oops.part4_abstract_classes;

public class RecipeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe1 recipe = new Recipe1();
		recipe.execute();

		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();
	}
}