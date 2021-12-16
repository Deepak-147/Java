package com.myPackage.oops.part5_interfaces.example1;


/** Each game implements the Gaming console actions in its own way. */
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Goes into a hole");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move Backward");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move Forward");
	}

}
