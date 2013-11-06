package com.chessGame;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class chessCore {
	public static void startchess() throws IOException{
		grid.gridreset();
		render.pagerefresh();
		while(1>0){
		chessTranslator.StringToCode(chessInput.keyboardInString());
		if(chess.chessCheck() == 1){
			chessMove.move();
			render.pagerefresh();
			}
		else{
			System.out.println("invalid move");
		}
		}
	}
}
