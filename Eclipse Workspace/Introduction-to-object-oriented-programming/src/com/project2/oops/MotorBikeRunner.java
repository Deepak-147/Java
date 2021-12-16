package com.project2.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100); // This will use our own constructor
		MotorBike honda = new MotorBike(80); // This will use our own constructor
		MotorBike bmw = new MotorBike(); // To use default constructor now, we need to explicitly provide it.

		ducati.start();
		honda.start();

		/**
		 * Incorrect way: Directly accessing member variables outside its class.
		 * Encapsulation: Is the solution of the above problem which enables that member
		 * variables are not directly accessible outside its class. They should be
		 * accessible only through methods or actions. So we create getters and setters
		 * to access member variables outside its class.
		 **/
		// ducati.speed = 200;
		// honda.speed = 100;

		/**
		 * Correct way: Using getters and setters to access member variable of the
		 * class.
		 */
		ducati.setSpeed(200);
		honda.setSpeed(100);

		System.out.println(ducati.getSpeed()); // 200
		System.out.println(honda.getSpeed()); // 100
		System.out.println(bmw.getSpeed()); // 5

		// Bad code will not be able to set -ve speed, because we have added logic to
		// handle that in the setter.
		ducati.setSpeed(-100);
		System.out.println(ducati.getSpeed()); // 200

		ducati.increaseSpeed(50);
		honda.increaseSpeed(50);
		System.out.println(ducati.getSpeed()); // 250
		System.out.println(honda.getSpeed()); // 150

		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(50);
		System.out.println(ducati.getSpeed()); // 200
		System.out.println(honda.getSpeed()); // 100
	}

}
