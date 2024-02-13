import java.util.*;


public class HelloFullJava {
    static final double pi = 3.48;

    public static void main(String[] arr1){

//        System.out.println(23);
        final int i = 45;
//         pi = 3.15;
        System.out.println(pi);
        String s1 = "hello" ;
        String s2 = "Harsh";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        boolean s4 = s1.equals(s2);
        System.out.println(s4);
        String name = new String("saraswati");
        System.out.println(name);
//        List<String>[] stringlist = new List<String>[1];
        Stack<String> stack = new Stack<String>();
//        String[] arr2 = new String[];
        String[] arr2 = {"hello" ,"geeks", "for", "geeks" };
        for (String arg : arr2 )
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());
        Set<String> guys = new HashSet<String>(
                Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(
                Arrays.asList("Larry", "Moe", "Curly"));
//        Set<String> aflCio = union(guys, stooges);
//        System.out.println(aflCio);



    }
}
