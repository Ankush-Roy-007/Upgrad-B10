package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayAndDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is");
        System.out.println(Arrays.toString(arr));
    }
}
