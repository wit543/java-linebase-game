package com.mygame.game;

import java.io.IOException;

import com.pictureGame.pictureCore;

public class menu {
	public static void menu() throws IOException{
		while(1>0){
			System.out.println("Menu");
			System.out.println("1) story game");
			System.out.println("2) picyure game");
			String input = keyboardInput.keyboardInString();

			if(input.equals("1")){
				storyCore.storyStart();		
				break;
			}
			if(input.equals("2")){
				pictureCore.randomPicture();
				break;
			}
			else{
				System.out.println("invalid input");
			}
		}
	}
}
