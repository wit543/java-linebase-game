package connectFour;

public class dot {
	public static String black="●";
	public static String white="○";
	public static int move(int Input,int to){
		int i;
		for( i =0;i<6;i++){
			if(connectFourGrid.gridStandard[to-1][i] == connectFourGrid.space){
				if(Input == 0){
					
					connectFourGrid.gridStandard[to-1][i] = black;
				break;
				}
				if(Input == 1){
					connectFourGrid.gridStandard[to-1][i] = white;
				break;
				}
			}
		}
		return i;
	}
	public static int check(int inputx, int inputy){
		//System.out.println(inputx);
		//System.out.println(inputy); 
		//System.out.println(connectFourGrid.gridStandard[inputx-1][inputy]); 
		int check =0;
		String[] a = new String[7];
		int up;
		int down;
		int left;
		int right;
		for(int i =0;i<inputy&&i<4;i++){

			if(connectFourGrid.gridStandard[inputx-1][inputy] == connectFourGrid.gridStandard[inputx-1][inputy-i] ){
				check ++;

				
				
			}
		}
		/*for(int i = 0;i<4;i++){
			if(i==inputx ||i ==inputy||i ==6-inputy){
				break;
			}
			if(connectFourGrid.gridStandard[inputx-1][inputy] != connectFourGrid.gridStandard[inputx-1-i][inputy-i]){
				check ++;
			}
			if(connectFourGrid.gridStandard[inputx-1][inputy] != connectFourGrid.gridStandard[inputx-1+i][inputy-i]){
				check ++;
			}
			if(connectFourGrid.gridStandard[inputx-1][inputy] != connectFourGrid.gridStandard[inputx-1-i][inputy+i]){
				check ++;
			}
			if(connectFourGrid.gridStandard[inputx-1][inputy] != connectFourGrid.gridStandard[inputx-1+i][inputy+i]){
				check ++;
			}
		}
		/*int i;
		int check =1;
		for( i = 0;i<4;i++){
			if(connectFourGrid.gridStandard[input-1][i] = connectFourGrid.space ){
				break;
			}
		}
		for(int y=0;y<4;y++){
			System.out.println(y);
			System.out.println(i);
			System.out.println();
			if(connectFourGrid.gridStandard[input-1][i] != connectFourGrid.gridStandard[input-1][Math.abs(i-y)] ){
				check =0;
			}
		}
		for(int y=0;y<4;y++){
			System.out.println(y);
			System.out.println(i);
			System.out.println();
			if(connectFourGrid.gridStandard[input-1][i] != connectFourGrid.gridStandard[input-1][Math.abs(i+y)] ){
				check =0;
			}
		}
		for(int y=0;y<4;y++){
			if(connectFourGrid.gridStandard[input-1][i] != connectFourGrid.gridStandard[input-1-y][Math.abs(i-y)] ){
				check =0;
			}
		}
		for(int y=0;y<4;y++){
			if(connectFourGrid.gridStandard[input-1][i] != connectFourGrid.gridStandard[input-1+y][Math.abs(i-y)] ){
				check =0;
			}
		}
		for(int y=0;y<4;y++){
			if(connectFourGrid.gridStandard[input-1][i] != connectFourGrid.gridStandard[input-1-y][Math.abs(i+y)] ){
				check =0;
			}
		}
		for(int y=0;y<4;y++){
			if(connectFourGrid.gridStandard[input-1][i] != connectFourGrid.gridStandard[input-1+y][Math.abs(i+y)] ){
				check =0;
			}
		}
		for(int y=0;y<4;y++){
			if(connectFourGrid.gridStandard[input-1][i] != connectFourGrid.gridStandard[input-1-y][Math.abs(i)] ){
				check =0;
			}
		}
		for(int y=0;y<4;y++){
			if(connectFourGrid.gridStandard[input-1][i] != connectFourGrid.gridStandard[input-1+y][Math.abs(i)] ){
				check =0;
			}
		}*/
		System.out.println(check);
		return check;
	}
}
