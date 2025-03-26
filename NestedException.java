package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
class NegativeNumberException extends Exception{
	
	public NegativeNumberException(String string) {
		
	}

	public void  message() {
		
		System.out.println("negative number ");;
	}
}
public class NestedException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the integer : ");
		int num = sc.nextInt();
		if(num < 0) {
			throw new NegativeNumberException("negative Number ");
		}
		System.out.println("you enter posititve number " + num);
		
		
		
		}catch(InputMismatchException e) {
			System.out.println("invalid input ! enter valid number : " + e);
			
		}catch(NegativeNumberException e1) {
			System.out.println("Exception: " + e1);
		}finally {
			System.out.println("rest code run ");
		}
	}

}
