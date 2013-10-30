package com.mygame.game;

import java.io.IOException;

import com.mygame.stroy.start;
import com.pictureGame.picture;
import com.pictureGame.pictureCore;

public class main {
	public static void main (String[] args) throws IOException{
		/*keyboardInput key = new keyboardInput();
		key.keyboardin();*/
		properties prop = new properties();
		start startGame = new start();
		/*while(1>0){
			setup.getname();
			if(setup.nameconfirm() == 1 ){
				break;
			}
		}
		setup.age();
		properties.stat();
		while(1>0){
			if(continues.continueNext() == 1 ){
				break;
			}
			
		}
		start.introduction();
		*/

		//menu.menu();
		
		System.out.println(dictionary.yes(keyboardInput.keyboardInString()));
		

	}
}