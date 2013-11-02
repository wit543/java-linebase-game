package com.pictureGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


import com.mygame.game.keyboardInput;

public class pictureCore {
	
	static String[] pictures= {"window","tennis ball","pizza","paintbrush","pencil","ruler","truck","car"};
	static Random r = new Random();
	static String ran;
	static List<String> picrandom = new ArrayList<String>();
	static List<String> used = new ArrayList<String>();
	public static void randomPicture() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("piclist"));
		String line = reader.readLine();		
		while( line != null ) {
			picrandom.add(line);
		    line = reader.readLine();
		}
		Random r = new Random();
		//String randomString = lines.get(r.nextInt(lines.size()));
		System.out.println("Picture Game start!!!");
		Collections.shuffle(picrandom);
		for(int i=0;i<20;i++){
			//ran = pictures[r.nextInt(pictures.length)];
			ran = picrandom.get(r.nextInt(picrandom.size( )));
			if(used.contains(ran)){
			}	
			else{
				used.add(ran);
				
				if(wrong.wrongNumber == 3){
					break;
				}picture.test();
				/*
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
				}*/
			}
		}
		point.finalPoint();
	}
}
