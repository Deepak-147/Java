package com.myPackage.oops.part5_interfaces.example1;

/** Each game implements the Gaming console actions in its own way. */
public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Move piece forward");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Move piece backward");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move piece to left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move piece to right");
	}

}
