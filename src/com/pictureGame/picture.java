package com.pictureGame;

import com.mygame.game.keyboardInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Arrays.asList;
import java.util.List;

public class picture {
	/*public static void window() throws IOException{
		
		         _.-;;-._
          '-..-'|   ||   |
          '-..-'|_.-;;-._|
          '-..-'|   ||   |
 		  '-..-'|_.-''-._|
 		  
		System.out.println("       _.-;;-._");
		System.out.println("'-..-'|   ||   |");
		System.out.println("'-..-'|_.-;;-._|");
		System.out.println("'-..-'|_.-''-._|");
		System.out.println("What is the name of this logo?");
		if(new String(keyboardInput.keyboardInString()).equals("window")){
			System.out.println("Correct 1 point added");
			point.point = point.point + 1;
		}
		else{
			System.out.println("Wrong");
			wrong.wrongNumber = wrong.wrongNumber + 1;
		}
		
		
		
	}
	public static  void tennisBall() throws IOException{
		
		     ,-"""-.
            /\     /\
            | |   | |
            \/     \/
         	 '-...-'
 		  
		System.out.println("  ,-\"\"\"-.");
		System.out.println(" /\\     /\\");
		System.out.println(" | |   | |");
		System.out.println(" \\/     \\/");
		System.out.println("  '-...-'");
		System.out.println("What is the name of this thing?");
		if(new String(keyboardInput.keyboardInString()).equals("tennis ball")){
			System.out.println("Correct 1 point added");
			point.point = point.point + 1;
		}
		else{
			System.out.println("Wrong");
			wrong.wrongNumber = wrong.wrongNumber + 1;
		}
		
		wrong.count();
		
	}
	public static  void pizza() throws IOException{
		
               // ""--.._
              ||  (_)  _ "-._
              ||    _ (_)    '-.
              ||   (_)   __..-'
               \\__..--""
 		  
		System.out.println(" // \"\"--.._");
		System.out.println("||  (_)  _ \"-._");
		System.out.println("||    _ (_)    '-.");
		System.out.println("||   (_)   __..-'");
		System.out.println(" \\\\__..--\"\"");
		System.out.println("What is the name of this food?");
		if(new String(keyboardInput.keyboardInString()).equals("pizza")){
			System.out.println("Correct 1 point added");
			point.point = point.point + 1;
		}
		else{
			System.out.println("Wrong");
			wrong.wrongNumber = wrong.wrongNumber + 1;
		}
		
		wrong.count();
		
	}
	public static  void paintbrush() throws IOException{
		
              .------------------....___       ,;;;,
             /                      /  /'''---/;;;;;;,.,
             \                      \__\...---\;;;;;;;"
              '------------------''''           ````
 		  
		System.out.println(" .------------------....___       ,;;;,");
		System.out.println("/                      /  /'''---/;;;;;;,.,");
		System.out.println("\\                      \\__\\...---\\;;;;;;;\"");
		System.out.println(" '------------------''''");
		System.out.println("What is the name of this thing?");
		if(new String(keyboardInput.keyboardInString()).equals("paintbrush")){
			System.out.println("Correct 1 point added");
			point.point = point.point + 1;
		}
		else{
			System.out.println("Wrong");
			wrong.wrongNumber = wrong.wrongNumber + 1;
		}
		
		wrong.count();
		
	}
	public static  void pencil() throws IOException{
				_______________________
                /   //=================/`"-._
          	   |   ||=================|      D
      		    \___\\_________________\__.-"
 		  
		System.out.println("  _______________________");
		System.out.println(" /   //=================/`\"-._");
		System.out.println("|   ||=================|      D");
		System.out.println(" \\___\\\\_________________\\__.-\"");

		System.out.println("What is the name of this thing?");
		if(new String(keyboardInput.keyboardInString()).equals("pencil")){
			System.out.println("Correct 1 point added");
			point.point = point.point + 1;
		}
		else{
			System.out.println("Wrong");
			wrong.wrongNumber = wrong.wrongNumber + 1;
		}
		
		wrong.count();
		
	}
	public static  void ruler() throws IOException{
		
         _________________________________________________
         |'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|
         |___1___2___3___4___5___6___7___8___9__10__11__12_|
 		  
		System.out.println(" _________________________________________________");
		System.out.println("|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|'|");
		System.out.println("|___1___2___3___4___5___6___7___8___9__10__11__12_|");
		System.out.println("What is the name of this thing?");
		if(new String(keyboardInput.keyboardInString()).equals("ruler")){
			System.out.println("Correct 1 point added");
			point.point = point.point + 1;
		}
		else{
			System.out.println("Wrong");
			wrong.wrongNumber = wrong.wrongNumber + 1;
		}
		
		wrong.count();
		
	}
	public static  void truck() throws IOException{
		
                   _________________
           .--H--.|                 |
         _//_||  ||                 |
        [    -|  |'--;--------------'
        '-()-()----()"()^^^^^^^()"()'

 		  
		System.out.println("           _________________");
		System.out.println("   .--H--.|                 |");
		System.out.println(" _//_||  ||                 |");
		System.out.println("[    -|  |'--;--------------'");
		System.out.println("\'-()-()----()\"()^^^^^^^()\"()\'");
		System.out.println("What is the name of this thing?");
		if(new String(keyboardInput.keyboardInString()).equals("truck")){
			System.out.println("Correct 1 point added");
			point.point = point.point + 1;
		}
		else{
			System.out.println("Wrong");
			wrong.wrongNumber = wrong.wrongNumber + 1;
		}
		
		wrong.count();
		
	}
	public static  void car() throws IOException{
		              ___
               .--.      [ATM]
          .----'   '--.    |
          '-()-----()-'    |
 		
		System.out.println("     .--.    ");
		System.out.println(".----'   '--.");
		System.out.println("'-()-----()-'    |");
		System.out.println("What is the name of this thing?");
		if(new String(keyboardInput.keyboardInString()).equals("car")){
			System.out.println("Correct 1 point added");
			point.point = point.point + 1;
		}
		else{
			System.out.println("Wrong");
			wrong.wrongNumber = wrong.wrongNumber + 1;
		}
		
		wrong.count();
		
	}*/
		public static  void test() throws IOException{
                    String pic = pictureCore.ran;
                    //int linecount = 0;
                    File file;
                     file = new File("pic.txt");
                    //LineNumberReader r = new LineNumberReader(new FileReader("car.txt"));
                    Scanner scanner;
                    System.out.println(pic);
                    scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                    	String line = scanner.nextLine();                    	
                        if(line.equals(pic) /*&& linecount == 0*/ ) { 
                        	while (scanner.hasNextLine()) {
                        		//linecount = r.getLineNumber();
                        		String line1 = scanner.nextLine();
	                               if(line1.equals(pic)){ 
	                            	   break;
	                               }
                            	System.out.println(line1);
                        		}
                               }
                        	}
                        

                    if(new String(keyboardInput.keyboardInString()).equals(pictureCore.ran)){
                            System.out.println("Correct 1 point added");
                            point.point = point.point + 1;
                    }
                    else{
                            System.out.println("Wrong");
                            wrong.wrongNumber = wrong.wrongNumber + 1;
                    }

                    wrong.count();
		
	}
        
	
}
