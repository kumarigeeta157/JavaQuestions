package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberFormatException {
	public static void main(String[] args) {
		try {
			System.out.println("Type a string in : ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println("you type in .. " + str);
			int num = Integer.parseInt(str);
			System.out.println("converted to an integer....." + num);
		}catch(Exception  e) {
		
			System.out.println(e);
			e.printStackTrace();
			
			
		}
	}

}
