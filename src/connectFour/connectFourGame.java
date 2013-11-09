package connectFour;

import java.io.IOException;

public class connectFourGame {
	public static void standard() throws IOException{
		connectFourGrid.gridsetStandard();
		connectFourRender.renderStandard();
		int change = 0;
		int input;
		int output;
		while(1>0){
			input =connectFourKeyboardInput.keyboardInInt();
			 
			if(change == 0){
				
				output =dot.move(change,input);
				change = 1;
			}			
			else{
				output =dot.move(change,input);
				change = 0;
			}

			
			//System.out.println(change);
			connectFourRender.renderStandard();
			if(dot.check(input,output)==4){
				if(change == 0){
				System.out.println("WINNER IS White" );
				break;
				}
				if(change == 1){
				System.out.println("WINNER IS Black" );
				break;
				}
			}
		}
	}
}
