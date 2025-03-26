package DivisionByZero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionByZero {
	public static void main(String[] args) {
//		int a= 5 , b= 0 , c= 0;
//		try {
//			c = a/b;
//			
//		}catch(Exception e ) {
//			System.out.println(e);
//			
//		}
//		
//		System.out.println("Handled Exception");
//		
		
		try {
			System.out.println("type an integer ");
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			System.out.println("you typed in ... " + s);
			int num = Integer.parseInt(s);
			System.out.println("Converted to an integer ... " + num);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("string buffered ");
		}
		
		
		
		
	}

}
