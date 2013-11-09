package connectFour;

import com.chessGame.chess;

public class connectFourGrid {
	public static int x;
	public static int y;
	public static String space = " ";
	public static String[][] gridStandard = new String[7][6];
		public static void gridsetStandard(){
			for(int i=0;i<7;i++){
				for(int j=0;j<6;j++){
					gridStandard[i][j] =connectFourGrid.space;
				}
			}
			//gridStandard[3][2] = "0";
		}
		
}
