package com.myPackage.oops.part1_basics;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
