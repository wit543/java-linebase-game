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
	public static void county() throws IOException{
		double county;
		System.out.println("chooe you county");
		county =  keyboardInput.keyboardInInt();
		return county;
	}
	public static void hair() throws IOException{
		double hair-color;
		System.out.println("what you hair color?");
		System.out.println("black\gold\bronze\gray\blue\pink\yeloow\green")
		System.out.println("or hexcode")
		hair-color =  keyboardInput.keyboardInInt();
		return hair-color;
	}
	public static void body() throws IOException{
		double hair-color;
		System.out.println("what you hair color?");
		System.out.println("black\gold\bronze\gray\blue\pink\yeloow\green")
		System.out.println("or hexcode")
		body-color =  keyboardInput.keyboardInInt();
		return body-color;
	}
}

