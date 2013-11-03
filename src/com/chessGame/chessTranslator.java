package com.chessGame;

public class chessTranslator {
	public static int IntfromX;
	public static int IntfromY;
	public static int InttoX;
	public static int InttoY;
	public static void StringToCode(String Input){
		String[] parts = Input.split("-");
		String part1 = parts[0];
		String part2 = parts[1];
		System.out.println(part1);
		System.out.println(part2);
		String[] out1 = part1.split("/");
		String[] out2 = part2.split("/");
		String fromX = out1[0];
		String fromY= out1[1];
		String toX = out2[0];
		String toY = out2[1];
		System.out.println(fromX);
		System.out.println(fromY);
		System.out.println(toX);
		System.out.println(toY);
		IntfromY = 0;
		InttoY = 0;
		String[] out = {"a","b","c","d","e","f","g","h"};
		while(IntfromY <8){
			IntfromY++;
			if(fromY.equals(out[IntfromY])){
				IntfromY++;
				break;
			}
		}
		while(InttoY <8){
			InttoY++;
			if(toY.equals(out[InttoY])){
				InttoY++;
				break;
			}
		}
		IntfromX = Integer.parseInt(fromX);
		InttoX = Integer.parseInt(toX);
		System.out.println(fromX);
		System.out.println(fromY);
		System.out.println(toX);
		System.out.println(toY);
		System.out.println(IntfromY);
		System.out.println(InttoY);
	}
}
