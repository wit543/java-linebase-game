package com.mygame.game;

import java.io.IOException;

public class setup {
	public static String name;
	

	public static String getname( ) throws IOException{
		System.out.println("whatyourname");
		name = keyboardInput.keyboardInString();
		return name;
	}
	public static double nameconfirm() throws IOException{
		 double confirm;
		System.out.println("confirm(yes/no)");
		if(new String(keyboardInput.keyboardInString()).equals("yes") ){
			confirm = 1;
		}
		else{
			confirm = 0;
		}
		return confirm;

	}
	public static double age() throws IOException{
		double age;
		System.out.println("how old are you?");
		age =  keyboardInput.keyboardInInt();
		return age;
		
	}
}
