package Genrics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice " , 20 ,3.8));
		students.add(new Student("Bob" , 22,3.9));
		students.add(new Student("Charlie" , 452,45.9));
		students.add(new Student("Bob" , 4562,13.9));
		
		System.out.println("Sorting by Name : ");
		SortUtils.sortList(students,Comparator.comparing(Student :: getName));
		students.forEach(System.out::println);
		
		
		System.out.println("\n Sorting by Age : ");
		SortUtils.sortList(students,Comparator.comparing(Student :: getAge));
		students.forEach(System.out::println);
		
		System.out.println("\n Sorting by Grade (Decending ) : ");
		SortUtils.sortList(students,Comparator.comparingDouble(Student :: getGrade));
		students.forEach(System.out::println);
		
		
	}

}
