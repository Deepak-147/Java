package com.myPackage.oops.part5_interfaces.example1;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		MarioGame game = new MarioGame();
		//		ChessGame game = new ChessGame();

		GamingConsole game = new MarioGame();
		//		GamingConsole game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
