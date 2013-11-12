package com.chessGame;

public class check extends chess{
	public static int chessCheck(){
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== rook_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== rook_white){
			rook.rook();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== bishop_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== bishop_white){
			bishop.bishop();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== king_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== king_white){
			king.king();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_white){
			knight.knight();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== queen_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== queen_white){
			queen.queen();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== "♟" ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== "♙"){
			pawn.pawn();
		}
		return check;
	}
	public static void checkWinner(){
		whiteDie =0;
		blackDie =0;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(grid.gridlayout[i][j]=="♔"){
					whiteDie++;
				}
			}
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(grid.gridlayout[i][j]=="♚"){
					blackDie++;
				}
			}
		}
	}
}
