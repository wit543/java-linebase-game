package com.chessGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class chess {
	public static String space = "    ";
	static List<String> black = new ArrayList<String>(Arrays.asList("♜","♞","♝","♛","♚","♟"));
	static List<String> white = new ArrayList<String>(Arrays.asList("♖","♘","♗","♕","♔","♙"));
	public static String king_black ="♚";
	public static String queen_black ="♛";
	public static String knight_black ="♞";
	public static String bishop_black ="♝";
	public static String rook_black ="♜";
	public static String pawn_black1 ="♟";
	public static String pawn_black2 ="♟";
	public static String pawn_black3 ="♟";
	public static String pawn_black4 ="♟";
	public static String pawn_black5 ="♟";
	public static String pawn_black6 ="♟";
	public static String pawn_black7 ="♟";
	public static String pawn_black8 ="♟";
	
	
	public static String king_white ="♚";
	public static String queen_white ="♕";
	public static String knight_white ="♘";
	public static String bishop_white ="♗";
	public static String rook_white ="♖";
	public static String pawn_white1 ="♙";
	public static String pawn_white2 ="♙";
	public static String pawn_white3 ="♙";
	public static String pawn_white4 ="♙";
	public static String pawn_white5 ="♙";
	public static String pawn_white6 ="♙";
	public static String pawn_white7 ="♙";
	public static String pawn_white8 ="♙";
	private static int check;
	public static int chessCheck(){
		check =0;
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== rook_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== rook_white){
			chess.rook();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== bishop_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== bishop_white){
			chess.bishop();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== king_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== king_white){
			chess.king();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== knight_white){
			chess.knight();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== queen_black ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== queen_white){
			chess.queen();
		}
		if(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== "♟" ||grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]== "♙"){
			chess.pawn();
		}
		return check;
	}
	public static void pawn(){
		if((chessTranslator.InttoX - chessTranslator.IntfromX == 1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]==space)){
			if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){

			}else{
				check =1;
			}
		}
		if( (((chessTranslator.InttoX == 3) && (chessTranslator.IntfromX <3) && (grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]=="♟"))||((chessTranslator.InttoX == 4) && (chessTranslator.IntfromX >4) && (grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]=="♙")))&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]==space)){
			if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){

			}else{
				check =1;
			}
		}

		if( (Math.abs(chessTranslator.InttoY - chessTranslator.IntfromY) ==1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] != space)){
			if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){

			}else{
				check =1;
			}
		}
		else{
			check =0;
		}
	}
	

	public static void knight(){
		if((((chessTranslator.InttoX == chessTranslator.IntfromX+2 && chessTranslator.InttoY== chessTranslator.IntfromY+1)||(chessTranslator.InttoX == chessTranslator.IntfromX+2 && chessTranslator.InttoY== chessTranslator.IntfromY-1))||
			((chessTranslator.InttoX == chessTranslator.IntfromX-2 && chessTranslator.InttoY== chessTranslator.IntfromY+1)||(chessTranslator.InttoX == chessTranslator.IntfromX-2 && chessTranslator.InttoY== chessTranslator.IntfromY-1)))||
			(((chessTranslator.InttoX == chessTranslator.IntfromX+1 && chessTranslator.InttoY== chessTranslator.IntfromY+2)||(chessTranslator.InttoX == chessTranslator.IntfromX+1 && chessTranslator.InttoY== chessTranslator.IntfromY-2))||
			((chessTranslator.InttoX == chessTranslator.IntfromX-1 && chessTranslator.InttoY== chessTranslator.IntfromY+2)||(chessTranslator.InttoX == chessTranslator.IntfromX-1 && chessTranslator.InttoY== chessTranslator.IntfromY-2)))){
			if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){

			}else{
				check =1;
			}	
		}
		else{
			check =0;
		}
	}
	public static void bishop(){
		//String[][] g = new String[8][8];
		//int x=3;
		//int y=5;
		/*for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i==j || 7-j==i){
				System.out.print("X");
				}
				else{
				System.out.print("O");
				}
			}
			System.out.println();
		}*/
		/*for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if((i-j==x-y) || (i+j==x+y)){
					System.out.print("X");
					}
					else{
					System.out.print("O");
					}
			}
			System.out.println();
		}*/
		if((Math.abs(chessTranslator.IntfromX-chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX-chessTranslator.InttoY))||(Math.abs(chessTranslator.IntfromX+chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX+chessTranslator.InttoY))){
			//if(chessTranslator.IntfromX-chessTranslator.IntfromY ==chessTranslator.InttoX-chessTranslator.InttoY){
				check =0;
				//System.out.println(chessTranslator.InttoX-chessTranslator.IntfromX);
				//System.out.println(chessTranslator.InttoY-chessTranslator.IntfromY);
				int countX =(chessTranslator.InttoX-chessTranslator.IntfromX);
				
				int count = 0;
				String[] inbetween =  {space,space,space,space,space,space,space,space};
				
				if((chessTranslator.InttoX-chessTranslator.IntfromX<0)&&(chessTranslator.InttoY-chessTranslator.IntfromY<0)){
					while(count < Math.abs(countX)){
						count ++;
						inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY-count];
					}	
				}
				if((chessTranslator.InttoX-chessTranslator.IntfromX<0)&&(chessTranslator.InttoY-chessTranslator.IntfromY>0)){
					while(count < Math.abs(countX)){
						count ++;
						inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY+count];
					}	
				}
				if((chessTranslator.InttoX-chessTranslator.IntfromX>0)&&(chessTranslator.InttoY-chessTranslator.IntfromY<0)){
					while(count <countX){
						count ++;
						inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY-count];
					}	
				}
				if((chessTranslator.InttoX-chessTranslator.IntfromX>0)&&(chessTranslator.InttoY-chessTranslator.IntfromY>0)){
					while(count <countX){
						count ++;
						inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY+count];
					}	
				}
				String checking;
				for(int i=0;i<8;i++){
					//System.out.println("ok");
					//System.out.println(inbetween[i]);
					if(inbetween[i]== space && inbetween[i]==grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]){
						if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
						}else{
						//System.out.println("ok3");
						check =1;
						
					}
					}
					if(inbetween[i]!= space){
						checking = inbetween[i];
						//System.out.println(checking);
						if(checking == grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]){
							if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
								}else{
								//System.out.println("ok3");
								check =1;
								
							}

						}
						break;
					}

				}
				
		}
		else{
			check =0;
		}
	}
	public static void rook(){
		if(chessTranslator.IntfromX==chessTranslator.InttoX || chessTranslator.IntfromY==chessTranslator.InttoY){
			int x= chessTranslator.InttoX-chessTranslator.IntfromX;
			int y= chessTranslator.InttoY-chessTranslator.IntfromY;
			String[] inbetween =  {space,space,space,space,space,space,space,space};
			int count = 0;
			if(x>0){
				while(count <Math.abs(x)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY];
				}	
			}
			if(x<0){
				while(count <Math.abs(x)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY];
				}	
			}
			if(y>0){
				while(count <Math.abs(y)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY+count];
				}	
			}
			if(y<0){
					while(count <Math.abs(y)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY-count];
				}	
			}
			String checking;
			for(int i=1;i<8;i++){
				//System.out.println("ok");
				System.out.println(inbetween[i]);

				int h=0;
				int t=1;
				int d=0;
				for (d=0;d<8;d++){
					if(white.contains(inbetween[d])||black.contains(inbetween[d])){
						h++;
					}
				}
				//System.out.println(h);
				//System.out.println(Math.abs(y));
				if(inbetween[i]== space && inbetween[i]==grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] &&h==0){
					for (d=0;d<8;d++){
						if(white.contains(inbetween[d])||black.contains(inbetween[d])){
							h++;
						}
					}
					if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
					}else{
					//System.out.println("ok3");
					check =1;
					}
				}
				if(inbetween[i]!= space){
					checking = inbetween[i];
					//System.out.println("ok");
					System.out.println(checking);
					for (d=0;d<8;d++){
						if(white.contains(inbetween[d])||black.contains(inbetween[d])){
							h++;
						}
					}
					if((checking == grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])){
						//System.out.println();
						/*for(t=1;t<x;t++){
							
							System.out.println(t);
							if(inbetween[i-t] != space){
							h++;
							}
						}*/
						System.out.println("ok");
						
						if((h==Math.abs(y)+1||h==Math.abs(x)+1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]!= space)){
								if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
									}else{
									//System.out.println("ok3");
									check =1;
									
								}
						}
					}
					break;
				}
			
			}
		}
		else{
			
		}
	}
	public static void king(){
		if(Math.abs(chessTranslator.InttoX - chessTranslator.IntfromX) == 1 || Math.abs(chessTranslator.IntfromY-chessTranslator.InttoY )==1){
			check =1;
		}
		else{
			
		}
	}
	public static void queen(){
		if(chessTranslator.IntfromX==chessTranslator.InttoX || chessTranslator.IntfromY==chessTranslator.InttoY || (Math.abs(chessTranslator.IntfromX-chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX-chessTranslator.InttoY))||(Math.abs(chessTranslator.IntfromX+chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX+chessTranslator.InttoY))){
			
			int countX =(chessTranslator.InttoX-chessTranslator.IntfromX);
			
			int count = 0;
			String[] inbetween =  {space,space,space,space,space,space,space,space};
			if((Math.abs(chessTranslator.IntfromX-chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX-chessTranslator.InttoY))||(Math.abs(chessTranslator.IntfromX+chessTranslator.IntfromY)==Math.abs(chessTranslator.InttoX+chessTranslator.InttoY))){

			if((chessTranslator.InttoX-chessTranslator.IntfromX<0)&&(chessTranslator.InttoY-chessTranslator.IntfromY<0)){
				while(count < Math.abs(countX)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY-count];
				}	
			}
			if((chessTranslator.InttoX-chessTranslator.IntfromX<0)&&(chessTranslator.InttoY-chessTranslator.IntfromY>0)){
				while(count < Math.abs(countX)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY+count];
				}	
			}
			if((chessTranslator.InttoX-chessTranslator.IntfromX>0)&&(chessTranslator.InttoY-chessTranslator.IntfromY<0)){
				while(count <countX){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY-count];
				}	
			}
			if((chessTranslator.InttoX-chessTranslator.IntfromX>0)&&(chessTranslator.InttoY-chessTranslator.IntfromY>0)){
				while(count <countX){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY+count];
				}	
			}
			String checking;
			for(int i=0;i<8;i++){
				//System.out.println("ok");
				//System.out.println(inbetween[i]);
				if(inbetween[i]== space && inbetween[i]==grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]){
					if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
					}else{
					//System.out.println("ok3");
					check =1;
					
				}
				}
				if(inbetween[i]!= space){
					checking = inbetween[i];
					//System.out.println(checking);
					if(checking == grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]){
						if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
							}else{
							//System.out.println("ok3");
							check =1;
							
						}

					}
					break;
				}
			}
			}
			if(chessTranslator.IntfromX==chessTranslator.InttoX || chessTranslator.IntfromY==chessTranslator.InttoY){
			String checking;
			int x= chessTranslator.InttoX-chessTranslator.IntfromX;
			int y= chessTranslator.InttoY-chessTranslator.IntfromY;
			if(x>0){
				while(count <Math.abs(x)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX+count][chessTranslator.IntfromY];
				}	
			}
			if(x<0){
				while(count <Math.abs(x)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX-count][chessTranslator.IntfromY];
				}	
			}
			if(y>0){
				while(count <Math.abs(y)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY+count];
				}	
			}
			if(y<0){
					while(count <Math.abs(y)){
					count ++;
					inbetween[count] = grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY-count];
				}	
			}
			
			for(int i=1;i<8;i++){
				//System.out.println("ok");
				
				check = 0;
				int h=0;
				int t=1;
				int d=0;

				for (d=0;d<8;d++){
					if(white.contains(inbetween[d])||black.contains(inbetween[d])){
						h++;
					}
				}
				//System.out.println(h);
				if(inbetween[i]== space && inbetween[i]==grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY] &&h==0){
					//System.out.println("ok0");
					//System.out.println(h);
					if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
					}else{
					//System.out.println("ok3");
					check =1;
					}
					break;
				}
				if((inbetween[i]!= space)&&grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]!=space){
					checking = inbetween[i];
					//System.out.println("ok");
					//System.out.println(checking);

					if((checking == grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])){

						//System.out.println("ok");
						
						if((h==Math.abs(y)+1||h==Math.abs(x)+1)&&(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY]!= space)){
							//System.out.println("ok");
								if(((black.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(black.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))||((white.contains(grid.gridlayout[chessTranslator.IntfromX][chessTranslator.IntfromY]))&&(white.contains(grid.gridlayout[chessTranslator.InttoX][chessTranslator.InttoY])))){
									}else{
									//System.out.println("ok3");
									check =1;
									
								}
						}
					}
					break;
				}
		
			}
		}
		else{
			
		}
		}
	}
}
