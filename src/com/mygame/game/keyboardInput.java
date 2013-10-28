package com.mygame.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class keyboardInput {
	
	public static String keyboardin() throws IOException{
		
	     BufferedReader stdin =
	             new BufferedReader (new
	                 InputStreamReader(System.in));
	     String a = stdin.readLine();

		return a;
		
	}
}
