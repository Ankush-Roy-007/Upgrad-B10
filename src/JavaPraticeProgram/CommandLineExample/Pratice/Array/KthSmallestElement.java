package JavaPraticeProgram.CommandLineExample.Pratice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int k = sc.nextInt();
        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println(k+"th smallest element is "+arr[k-1]);



    }
}
