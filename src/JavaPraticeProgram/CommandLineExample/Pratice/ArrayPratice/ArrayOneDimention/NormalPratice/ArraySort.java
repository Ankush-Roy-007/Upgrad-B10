package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the array element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array element are");
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Sorted Array is");
        System.out.println(Arrays.toString(arr));
    }
}
