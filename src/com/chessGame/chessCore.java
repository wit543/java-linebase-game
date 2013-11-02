package com.chessGame;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class chessCore {
	public static void startchess() throws FileNotFoundException, UnsupportedEncodingException{
		grid.gridreset();
		render.pagerefresh();
	}
}
