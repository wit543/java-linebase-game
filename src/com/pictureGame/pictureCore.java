package com.pictureGame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.mygame.game.keyboardInput;

public class pictureCore {
	static String[] pictures= {"window","tennis ball","pizza","paintbrush","pencil","ruler","truck","car"};
	static List<String> used = new ArrayList<String>();
	public static void randomPicture() throws IOException{
		for(int i=0;i<20;i++){
			Random r = new Random();
			String ran = pictures[r.nextInt(pictures.length)];
			if(used.contains(ran)){
			}
			if(wrong.wrongNumber == 3){
				break;			
			}
			else{	
				used.add(ran);
				
				if(ran.equals("window")){
					picture.window();
				}
				if(ran.equals("tennis ball")){
					picture.tennisBall();
				}
				if(ran.equals("paintbrush")){
					picture.paintbrush();
				}
				if(ran.equals("pencil")){
					picture.pencil();
				}
				if(ran.equals("ruler")){
					picture.ruler();
				}
				if(ran.equals("truck")){
					picture.truck();
				}
				if(ran.equals("car")){
					picture.car();
				}
			}

			
		}

	}
}
