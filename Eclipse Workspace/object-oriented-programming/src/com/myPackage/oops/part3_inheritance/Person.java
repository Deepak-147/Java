package com.myPackage.oops.part3_inheritance;

/**
 * Parent class Person. By default every class extends Object class. Object
 * class is at the root of the inheritance hierarchy. Even if we have not
 * extended Person class, it is still doing Person extends Object. And that's
 * the reason we get access to toString() and other methods.
 */
public class Person {
	/** Properties or States. */
	private String name;
	private String email;
	private String phoneNumber;

	/**
	 * Overloading default constructor. Every Person must have a name
	 */
	public Person(String name) {
		/**
		 * Even if we comment this line. This will be executed by default. It is a call
		 * to parent class' default constructor (i.e Object class' default constructor).
		 */
		super();

		/** Rest of the constructor implementation */
		this.name = name;
	}

	/** Getters/Setters */
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	/** Overriding toString() method of Object class. */
	public String toString() {
		return String.format("name - %s, email - %s, phone number - %s", name, email, phoneNumber);
	}
}
