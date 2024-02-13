//import java.util.Arrays;
//import java.util.Set;
//
//public class Main extends IndexOutOfBoundsException {
//    public Main(){super();}
//    public static void main(String[] args) {
//
////        System.out.println("Hello world!");
////        Class<?> cl = null;
////        try {
////
////            cl = Class.forName(args[]);
////        } catch(ClassNotFoundException e) {
////            System.err.println("Class not found.");
////            System.exit(1);
////        }
////        Set<String>s = null;
////        try{
////            s = (Set<String>)cl.newInstance();
////        }
////        catch(IllegalAccessException e){
////            System.err.println("Class not accessible.");
////            System.exit(1);
////        }
////        catch(InstantiationException e){
////            System.out.println("Class not instantiable.");
////            System.exit(2);
////        }
//        s.addAll(Arrays.asList(args).subList(1,args.length));
//        System.out.println(s);
//    }
//}