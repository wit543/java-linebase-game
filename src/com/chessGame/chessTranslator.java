package com.chessGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                /*for(int i=0;i<8;i++){
                    if("a".equals(fromY)){
                       IntfromY = 1;
                    }if("b".equals(fromY)){
                       IntfromY = 2;
                    }if("c".equals(fromY)){
                       IntfromY = 3;
                    }if("d".equals(fromY)){
                       IntfromY = 4;
                    }if("e".equals(fromY)){
                       IntfromY = 5;
                    }if("f".equals(fromY)){
                       IntfromY = 6;
                    }if("g".equals(fromY)){
                       IntfromY = 7;
                    }if("h".equals(fromY)){
                       IntfromY = 8;
                    }
                }
                */
		//List<String> out = Arrays.asList("a","b","c","d","e","f","g","h");
                //1/a-2/b
                System.out.println(fromY);
		while(IntfromY <9){
                    System.out.println(IntfromY);
                    IntfromY++;
                    if(fromY.equals(out[chessTranslator.IntfromY].toString())){
                        IntfromY++;
                        break;
                    }
		}
                while(InttoY <9){
			InttoY++;
			if(toY.equals(out[chessTranslator.InttoY].toString())){
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
