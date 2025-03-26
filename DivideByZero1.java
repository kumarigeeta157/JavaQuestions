package ExceptionHandling;

import java.util.Scanner;

public class DivideByZero1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first value :");
	int a = sc.nextInt();
	System.out.println("Enter the second value : ");
	int b = sc.nextInt();
	
	double c = 0 ;
	 c = a/b;
	 if(b == 0 ) {
		 try {
			 b = 0;
			 }catch(Exception e) {
				 System.out.println(e);
			 }
	 finally {
		System.out.println("system is safe ....");
	}
	 }
	 else {
		 System.out.println("vaue of c : " + c);
	 }
	
	}

}
