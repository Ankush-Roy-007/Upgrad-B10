package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array element are");
        System.out.println(Arrays.toString(arr));

        // Add all element
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Array sum is ");
        System.out.println(sum);



    }
}
