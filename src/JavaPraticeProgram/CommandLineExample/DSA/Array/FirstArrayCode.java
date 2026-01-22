package JavaPraticeProgram.CommandLineExample.DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FirstArrayCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arr = scanner.nextInt();
        int[] array = new int[arr];

        for(int i=0;i<array.length;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("Array element are ");
        System.out.println(Arrays.toString(array));
    }
}
