package JavaPraticeProgram.CommandLineExample.Pratice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int largest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(small);

    }
}
