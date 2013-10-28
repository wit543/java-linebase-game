package com.mygame.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class keyboardInput {
	
	public static String keyboardInString() throws IOException{
		
	     BufferedReader stdin =
	             new BufferedReader (new
	                 InputStreamReader(System.in));
	     String a = stdin.readLine();

		return a;
		
	}
	public static double keyboardInInt() throws IOException{
		
	     BufferedReader stdin =
	             new BufferedReader (new
	                 InputStreamReader(System.in));
	     String a = stdin.readLine();
	     double b = Double.parseDouble(a);
		return b;
		
	}
}
