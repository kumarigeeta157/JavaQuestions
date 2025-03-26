package DivisionByZero;

public class MultiCatchBlock {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30/3;
		
		}
		catch(ArithmeticException e){
			System.out.println("task1 is created .. " + e);
			
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
			
		}
		catch(Exception e2) {
			System.out.println( e2);
			
		}
		System.out.println("rest of code ");
	}

}
