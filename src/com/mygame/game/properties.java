package com.mygame.game;

import java.io.IOException;

public class properties {
	public static double health = 100;
	public static double exp = 0;
	public static double difficulty = 1;
	public static double level = 0;
	public static double food = 100;
	public static double water = 100;
	public static double mood = 10;
	public static double comfort = 10;
	public static double money = 0;
	public static double time = 0;
	public static String stat( ) throws IOException{
		System.out.println("");
		System.out.println("=======================");
		System.out.println("        statistic      ");
		System.out.println("=======================");
		System.out.println("health = "+health);
		System.out.println("exp = "+exp);
		System.out.println("difficulty = "+difficulty);
		System.out.println("level = "+level);
		System.out.println("food = "+food);
		System.out.println("water = "+water);
		System.out.println("mood = "+mood);
		System.out.println("comfort = "+comfort);
		System.out.println("money = "+money);
		System.out.println("time = "+time);
		System.out.println("health = "+health);
		return null;
		
		
	}
}
