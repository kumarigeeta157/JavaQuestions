package ExceptionHandling;

public class BoundException {
	public static void main(String[] args) {
		int[] a = new int [5];
		
		try {
		a[5] = 9;
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
