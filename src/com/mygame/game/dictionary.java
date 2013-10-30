package com.mygame.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Arrays.asList;
import java.util.List;

public class dictionary {
	static List<String> yes = asList("yep","all right","affirmative","amen","aye","beyond a doubt","by all means","certainly","definitely","even so","exactly","fine","gladly","good","good enough","granted","indubitably","just so","most assuredly","naturally","of course","okay","positively","precisely","sure thing","surely","true","undoubtedly","unquestionably","very well","willingly","without fail","yea");
	static File file = new File("yes.txt");
	private static Scanner scanner;
	public static int yes(String Input) throws FileNotFoundException{
		int answer = 0 ;	
		scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		    if(line.equals(Input)) { 
		        System.out.println("correct");
		        answer=1;
		    }
		}
		/*
		if(yes.contains(Input)){
			System.out.println("correct");
			answer = 1;
		}*/
		/*
		 * System.out.println(new java.io.File("").getAbsolutePath());
		 * check directory
		 * */

		/*if(((List<String>) file).contains(Input)){
			System.out.println("correct");
			answer = 1;
		}
		else{
			System.out.println("wron");
		}*/
		return answer;
	}
	public static int no(String Input){
		int answer = 0;
		if(Input.equals("all right") ){
			answer= 1;
		}
		return answer;
	}

}
