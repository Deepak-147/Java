package com.project2.oops;

public class MotorBike {
	// state/data/member variables
	private int speed; // 'private' modifier makes it not accessible outside the class.

	// Constructor, a special method to assign initial values. No return type. And
	// name is same as class name
	MotorBike(int speed) {
		this.speed = speed;
	}

	// Default constructor
	MotorBike() {
		// Good way of calling our own constructor from default constructor.
		this(5); // It is optional. It will set default initial value as 5. Leave it blank if not
					// required to set initial value
	}

	// behaviors/actions/methods
	void start() {
		System.out.println("Bike started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// Advantage of using setter, is that we can restrict bad operations (like
		// setting -ve speed here) and have some control over data.
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

}
