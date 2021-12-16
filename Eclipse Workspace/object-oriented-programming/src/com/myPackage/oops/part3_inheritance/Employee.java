package com.myPackage.oops.part3_inheritance;

import java.math.BigDecimal;

/** Every Employee IS A Person */
public class Employee extends Person {
	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	/**
	 * Overloading default constructor. Every Employee must have a name and a title.
	 */
	public Employee(String name, String title) {
		/**
		 * Explicitly calling parent class' (Person) default constructor with overloaded
		 * arguments. If this line is not present, then by default a call to super()
		 * will be made, which will not find the implementation for Person class'
		 * default constructor since it is overloaded in this case, and it will fail
		 */
		super(name);

		/** Rest of the constructor implementation */
		this.title = title;
	}

	/** Getters/Setters */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	/** Overriding toString() method of Object class. */
	public String toString() {
		/**
		 * We can use parent class' properties using super keyword.
		 */
		return String.format(
				"EMPLOYEE OBJECT: \n employee name - %s \n employee email - %s \n employee phone number - %s \n employee title - %s \n employer name - %s \n employee grade - %c \n employee salary - %s \n",
				super.getName(), super.getEmail(), super.getPhoneNumber(), title, employerName, employeeGrade, salary);

		/** Even better directly print whole parent class */
		//		return String.format(
		//				"EMPLOYEE OBJECT: \n %s \n employee title - %s \n employer name - %s \n employee grade - %c \n employee salary - %s \n",
		//				super.toString(), title, employerName, employeeGrade, salary);
	}

}
