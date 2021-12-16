package com.mypackage;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Way1: Creating array before and passing it. */
		//		int[] marks = { 99, 98, 100 };
		//		Student student = new Student("Deepak", marks);

		/** Way2: Create a new array with elements as argument. */
		//		Student student = new Student("Deepak", new int[] { 99, 98, 100 });

		/**
		 * Way3: Passing individual marks. And changing the function to accept variable
		 * number of arguments
		 */
		Student student = new Student("Deepak", 99, 98, 100);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks: " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("maximum of marks: " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("maximum of marks: " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average of marks: " + average);

		student.addNewMark(35);

		student.removeMarkAtIndex(1);

		System.out.println(student);
	}

}
