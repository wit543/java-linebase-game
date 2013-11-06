package com.chessGame;

public class chessMove {
	public static void move(){
		String chessmove = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY];
		
		grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] = chessmove;
		//grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY];
		grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY] = "    ";
	}
}
