package JavaPraticeProgram.CommandLineExample.DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Avarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arr = scanner.nextInt();
        double[] array = new double[arr];
        double sum =0;

        for(int i=0;i<array.length;i++){
            array[i]= scanner.nextInt();
            sum = sum + array[i];
        }
        double avarge = sum / array.length;
        System.out.println("Array element are ");
        System.out.println(Arrays.toString(array));
        System.out.println("Sum of array is:-"+sum);
        System.out.println("Avarge of array is:-"+avarge);


    }
}
