package com.myPackage.oops.part3_inheritance;

/** Every Student IS A Person */
public class Student extends Person {
	private String college;
	private int year;

	/**
	 * Overloading default constructor. Every Student must have a name and a college
	 * name.
	 */
	public Student(String name, String collegeName) {
		/**
		 * Explicitly calling parent class' (Person) default constructor with overloaded
		 * arguments. If this line is not present, then by default a call to super()
		 * will be made, which will not find the implementation for Person class'
		 * default constructor since it is overloaded in this case, and it will fail
		 */
		super(name);

		/** Rest of the constructor implementation */
		this.college = collegeName;
	}

	/** Getters/Setters */
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	/** Overriding toString() method of Object class. */
	public String toString() {
		/**
		 * We can use parent class' properties using super keyword.
		 */
		return String.format(
				"STUDENT OBJECT: \n student name - %s \n student email - %s \n student phone number - %s \n college - %s \n year - %s\n",
				super.getName(), super.getEmail(), super.getPhoneNumber(), college, year);

		/** Even better directly print whole parent class */
		//		return String.format(
		//				"STUDENT OBJECT: \n %s \n college - %s \n year - %s \n", super.toString(), college, year);
	}
}
