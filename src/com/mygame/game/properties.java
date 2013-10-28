package com.mygame.game;

import java.io.IOException;

public class properties {
	public static double health = 100;
	static double exp = 0;
	static double difficulty = 1;
	static double level = 0;
	static double food = 100;
	static double water = 100;
	static double mood = 10;
	static double comfort = 10;
	static double money = 0;
	static double time = 0;
	public static String stat( ) throws IOException{
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
