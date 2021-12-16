package com.mypackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	//	private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	private String name;

	/**
	 * Function accepting fixed number of arguments. Works with Way1 and Way2
	 * defined in runner class.
	 */
	//	public Student(String name, int[] marks) {
	//		// TODO Auto-generated constructor stub
	//		this.name = name;
	//		this.marks = marks;
	//	}

	/**
	 * Function accepting variable number of arguments. Works with Way3 defined in
	 * runner class.
	 */
	public Student(String name, int... marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		//		this.marks = marks;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		//		return marks.length;
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
		//		int maximum = Integer.MIN_VALUE;
		//		for (int mark : marks) {
		//			if (mark > maximum) {
		//				maximum = mark;
		//			}
		//		}
		//		return maximum;
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		// TODO Auto-generated method stub
		//		int minimum = Integer.MAX_VALUE;
		//		for (int mark : marks) {
		//			if (mark < minimum) {
		//				minimum = mark;
		//			}
		//		}
		//		return minimum;
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		// TODO Auto-generated method stub
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		// TODO Auto-generated method stub
		marks.remove(index);
	}

}
