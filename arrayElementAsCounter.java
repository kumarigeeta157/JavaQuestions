import java.util.Random;

public class arrayElementAsCounter {
    public static void main(String[] args) {
        Random rand = new Random();
        int array1[] = new int[10];
        for (int roll = 1; roll <= 100; roll++) {
            array1[1+ rand.nextInt(8)]++;
        }
        System.out.println("face  frequency");
        for (int face = 1 ; face < array1.length ; face++){
            System.out.println(face + "\t" + array1[face]);
        }

    }
}
