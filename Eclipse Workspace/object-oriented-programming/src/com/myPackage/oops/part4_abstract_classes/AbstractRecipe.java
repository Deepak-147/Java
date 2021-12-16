package com.myPackage.oops.part4_abstract_classes;

/**
 * Abstract class has its own methods plus some empty methods. These empty
 * methods should be implemented by the sub classes.
 */
public abstract class AbstractRecipe {
	/** Non abstract methods. */
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	/** Abstract methods. */
	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
}
