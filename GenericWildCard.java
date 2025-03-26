package Genrics;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCard {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(45);
		l1.add(24);
		l1.add(123);
		double sum = sum(l1);
		System.out.println( "sum of l1 : " + l1);
	}
	public static double sum(List<?extends Number> list) {
		double sum =0;
		for(Number n:list) {
			sum += n.doubleValue();
		}
		return sum;
	}

}
