package com.mygame.game;

import java.io.IOException;

public class main {
	public static void main (String[] args) throws IOException{
		/*keyboardInput key = new keyboardInput();
		key.keyboardin();*/
		setup charsetup = new setup();
		properties prop = new properties();
		while(1>0){
			charsetup.name();
			if(charsetup.nameconfirm() == 1 ){
				break;
			}
		}
		charsetup.age();
		
		
		

	}
}