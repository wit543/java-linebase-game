package connectFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class connectFourKeyboardInput {
	public static String keyboardInString() throws IOException{
		
	     BufferedReader stdin =
	             new BufferedReader (new
	                 InputStreamReader(System.in));
	     String a = stdin.readLine();

		return a;
		
	}
	public static int keyboardInInt() throws IOException{
		
	     BufferedReader stdin =
	             new BufferedReader (new
	                 InputStreamReader(System.in));
	     String a = stdin.readLine();
	     int b = Integer.parseInt(a);
		return b;
		
	}
	public static double keyboardAnyKey() throws IOException{
		
	     BufferedReader stdin =
	             new BufferedReader (new
	                 InputStreamReader(System.in));
	     int a = stdin.read();
	     
		return a;
		
	}
}
