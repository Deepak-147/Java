package com.myPackage.oops.part3_inheritance;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * When a subclass object is created, it calls sub class' default constructor,
		 * which implicitly calls parent class' default constructor (like super();). So
		 * basically parent class' default constructor is called first, then it
		 * continues remaining implementation part of sub class' default constructor.
		 * But if the parent class' default constructor is overloaded, then sub class'
		 * default constructor is unable to find parent class' default constructor. So
		 * we need to explicitly call parent class' default constructor with overloaded
		 * arguments.
		 */
		Student student = new Student("Deepak", "VIT, Vellore");

		/** Setting parent class' (Person) properties. */
		student.setEmail("deepaklaxkar11@gmail.com");
		student.setPhoneNumber("9784319436");

		/** Setting sub class' (Student) properties. */
		student.setYear(3);

		/**
		 * Printing sub class object. It calls student.toString() method. The toString()
		 * method is available in Student class because every class extends Object
		 * class.
		 */
		System.out.println(student);

		/**
		 * When a subclass object is created, it calls sub class' default constructor,
		 * which implicitly calls parent class' default constructor (like super();). So
		 * basically parent class' default constructor is called first, then it
		 * continues remaining implementation part of sub class' default constructor.
		 * But if the parent class' default constructor is overloaded, then sub class'
		 * default constructor is unable to find parent class' default constructor. So
		 * we need to explicitly call parent class' default constructor with overloaded
		 * arguments.
		 */
		Employee employee = new Employee("Deepak", "Programmer");

		/** Setting parent class' (Person) properties. */
		employee.setEmail("deepaklaxkar11@gmail.com");
		employee.setPhoneNumber("9784319436");

		/** Setting sub class' (Student) properties. */
		employee.setEmployerName("NetApp");
		employee.setSalary(new BigDecimal("1000000"));
		employee.setEmployeeGrade('A');

		/**
		 * Printing sub class object. It calls employee.toString() method. The
		 * toString() method is available in Employee class because every class extends
		 * Object class.
		 */
		System.out.println(employee);
	}

}
