package com.chessGame;

public class chess {
	public static String king_black ="♚";
	public static String queen_black ="♛";
	public static String knight_black ="♞";
	public static String bishop_black ="♝";
	public static String rook_black ="♜";
	public static String pawn_black1 ="♟";
	public static String pawn_black2 ="♟";
	public static String pawn_black3 ="♟";
	public static String pawn_black4 ="♟";
	public static String pawn_black5 ="♟";
	public static String pawn_black6 ="♟";
	public static String pawn_black7 ="♟";
	public static String pawn_black8 ="♟";
	
	
	public static String king_white ="♚";
	public static String queen_white ="♕";
	public static String knight_white ="♘";
	public static String bishop_white ="♗";
	public static String rook_white ="♖";
	public static String pawn_white1 ="♙";
	public static String pawn_white2 ="♙";
	public static String pawn_white3 ="♙";
	public static String pawn_white4 ="♙";
	public static String pawn_white5 ="♙";
	public static String pawn_white6 ="♙";
	public static String pawn_white7 ="♙";
	public static String pawn_white8 ="♙";
	private static int check;
	public static int chessCheck(){
		check =0;
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== rook_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== rook_white){
			chess.rook();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== bishop_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== bishop_white){
			chess.bishop();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== king_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== king_white){
			chess.king();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_white){
			chess.knight();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== queen_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== queen_white){
			chess.queen();
		}
		/*if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_white){
			chess.knight();
		}*/
		return check;
	}
	public static void pawn(){
		if( chessTranslator.InttoX - chessTranslator.IntfromX == 1){
			check =1;
		}
		if( (chessTranslator.InttoX == 4) && (chessTranslator.IntfromX <3) && (grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]==pawn_black1 ) ){
			check =1;
		}

		if( (chessTranslator.InttoY - chessTranslator.IntfromY ==1 )&&(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY] != "    ") ){
			check =1;
		}
		else{
		}
	}
	

	public static void knight(){
		if((((chessTranslator.InttoX == chessTranslator.IntfromX+2 && chessTranslator.InttoY== chessTranslator.IntfromY+1)||(chessTranslator.InttoX == chessTranslator.IntfromX+2 && chessTranslator.InttoY== chessTranslator.IntfromY-1))||
			((chessTranslator.InttoX == chessTranslator.IntfromX-2 && chessTranslator.InttoY== chessTranslator.IntfromY+1)||(chessTranslator.InttoX == chessTranslator.IntfromX-2 && chessTranslator.InttoY== chessTranslator.IntfromY-1)))||
			(((chessTranslator.InttoX == chessTranslator.IntfromX+1 && chessTranslator.InttoY== chessTranslator.IntfromY+2)||(chessTranslator.InttoX == chessTranslator.IntfromX+1 && chessTranslator.InttoY== chessTranslator.IntfromY-2))||
			((chessTranslator.InttoX == chessTranslator.IntfromX-1 && chessTranslator.InttoY== chessTranslator.IntfromY+2)||(chessTranslator.InttoX == chessTranslator.IntfromX-1 && chessTranslator.InttoY== chessTranslator.IntfromY-2)))){
			check =1;	
		}
		else{
			
		}
	}
	public static void bishop(){
		//String[][] g = new String[8][8];
		//int x=3;
		//int y=5;
		/*for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i==j || 7-j==i){
				System.out.print("X");
				}
				else{
				System.out.print("O");
				}
			}
			System.out.println();
		}*/
		/*for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if((i-j==x-y) || (i+j==x+y)){
					System.out.print("X");
					}
					else{
					System.out.print("O");
					}
			}
			System.out.println();
		}*/
		if((Math.abs(chessTranslator.IntfromX-chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX-chessTranslator.InttoY))||(Math.abs(chessTranslator.IntfromX+chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX+chessTranslator.InttoY))){
			check =1;
		}
		else{
			
		}
	}
	public static void rook(){
		if(chessTranslator.IntfromX==chessTranslator.InttoX || chessTranslator.IntfromY==chessTranslator.InttoY){
			check =1;
		}
		else{
			
		}
	}
	public static void king(){
		if(Math.abs(chessTranslator.InttoX - chessTranslator.IntfromX) == 1 || Math.abs(chessTranslator.IntfromY-chessTranslator.InttoY )==1){
			check =1;
		}
		else{
			
		}
	}
	public static void queen(){
		if(chessTranslator.IntfromX==chessTranslator.InttoX || chessTranslator.IntfromY==chessTranslator.InttoY || (Math.abs(chessTranslator.IntfromX-chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX-chessTranslator.InttoY))||(Math.abs(chessTranslator.IntfromX+chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX+chessTranslator.InttoY))){
			check =1;
		}
		else{
			
		}
	}
}
