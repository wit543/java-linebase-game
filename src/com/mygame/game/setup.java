package com.mygame.game;

import java.io.IOException;

public class setup {
	static String name;

	public static String name( ) throws IOException{
		System.out.println("whatyourname");
		name = keyboardInput.keyboardin();
		return name;
	}
	public static double nameconfirm() throws IOException{
		double confirm;
		System.out.println("confirm(yes/no)");
		if(new String(keyboardInput.keyboardin()).equals("yes") ){
			confirm = 1;
		}
		else{
			confirm = 0;
		}
		return confirm;
		
		
		
	}
}
