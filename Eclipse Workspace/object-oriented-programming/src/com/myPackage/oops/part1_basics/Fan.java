package com.myPackage.oops.part1_basics;

public class Fan {
	// state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; // 0 to 5

	// creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// behaviors or operations
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 1); // default speed when fan is turned on.
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	// Prints current state of object
	public String toString() {
		//		return "make - " + make + ", radius - " + radius + ", color - " + color + ", isOn - " + isOn + ", speed - " + speed;
		// Better way
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn,
				speed);

	}
}
