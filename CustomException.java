package ExceptionHandling;

import java.util.Scanner;



public class CustomException {
	public static void validAge(int age) throws Exception{
		if(age < 0 || age > 140 ) {
			throw new Exception("Invalid age " + age + " age must be 0 to 140 ");
			
		}
		System.out.println("Age is " + age);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the age ");
			int age = sc.nextInt();
			validAge(age);
			
		}
		
            catch(Exception e){
			System.out.println("exception : " + e.getMessage());
		}
		finally {
			System.out.println("rest of the code ");
		}
		
	}

}
