package com.chessGame;

public class king extends chess {
	public static void king(){
		if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
			}else{
				if(Math.abs(chessTranslator.InttoX - chessTranslator.IntfromX) == 1 || Math.abs(chessTranslator.IntfromY-chessTranslator.InttoY )==1){
					check =1;
			}
		}
	}
}
