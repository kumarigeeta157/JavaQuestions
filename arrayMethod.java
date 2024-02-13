public class arrayMethod {
    public static void main(String[] args) {
        int[] list1 = {3,4,5,6,7};
        change(list1);
        for(int y : list1){
            System.out.println("y = " + y);
        }
    }
    public static void change(int x[]){
        for(int counter=0 ; counter <x.length ; counter++){
            x[counter] += 5;

        }
    }


}
