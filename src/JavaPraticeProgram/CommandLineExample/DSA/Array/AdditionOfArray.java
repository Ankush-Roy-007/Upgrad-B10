package JavaPraticeProgram.CommandLineExample.DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arr = scanner.nextInt();
        int[] array = new int[arr];
        int sum = 0;

        for(int i=0;i<array.length;i++){
            array[i]= scanner.nextInt();
            sum += array[i];
        }
        System.out.println("Array element are ");
        System.out.println(Arrays.toString(array));
        System.out.println("Addition of array is ");
        System.out.println(sum);
    }

}
