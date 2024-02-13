public class TryCatchFinally {
    public static void main(String[] args) {
        int[] arr = {4,8,3,23,1,33,54};
        int result = 0;
        try{
            for(int i=0 ; i< arr.length ; i++) {
                if (arr[i] < arr[i + 1]) {
                    result = arr[i] / arr[i + 1];
                }
                System.out.println(arr[9]);

            }
        }
        catch(Exception e){
            System.out.println("system went wrong");
        }

        finally{
            System.out.println(arr[5]);

        }

    }
}
