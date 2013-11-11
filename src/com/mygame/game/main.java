package com.mygame.game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.chessGame.chessCore;
import com.mygame.stroy.start;
import com.pictureGame.picture;
import com.pictureGame.pictureCore;

import connectFour.connectFourCore;

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
		//pictureCore.randomPicture();
		//System.out.println(dictionary.yes(keyboardInput.keyboardInString()));
        //chessCore.startchess();        
		//picture.test();
		/*
		String[][] g = new String[8][8];
		int x=3;
		int y=3;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i==j || 7-j==i){
				System.out.print("X");
				}
				else{
				System.out.print("O");
				}
			}
			System.out.println();
		}
		*/
		/*for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if((((i==x+2 && j==y+1)||(i==x+2 && j==y-1))||((i==x-2 && j==y+1)||(i==x-2 && j==y-1)))||(((i==x+1 && j==y+2)||(i==x+1 && j==y-2))||((i==x-1 && j==y+2)||(i==x-1 && j==y-2)))){
					System.out.print("X");
				}
				if((i==x) && (j==y)){
					System.out.print("X");
				}
				else{
				System.out.print("O");
				}
			}
			System.out.println();
		}*/
		chessCore.startchess();
		//connectFourCore.start();

	}
}