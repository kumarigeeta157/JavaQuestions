package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ALDemo1 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
//		arr.add("aamir");
//		arr.add("samar");
//		arr.add("kabir");
//		arr.add("Hyderabad");
//		arr.add(152345);
//		arr.add(1562.0124);
//		arr.add("true");
//		System.out.println(arr);
////		Collections.sort(arr);
//		System.out.println(arr);
//		Iterator itr = arr.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.hasNext());
//		}
		ArrayList a1 = new ArrayList();
		int[] arr1 = {5,6,77,4,12,15};
		Arrays.sort(arr1);
		for(int i:arr1) {
			System.out.println(i);
		}
		a1.add("srinivas");
		a1.add(1254);
		a1.add(30.15);
	
		System.out.println(a1);
		
		
		
	}
	

}
