package JavaPraticeProgram.CommandLineExample.Lecture9;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" element");

        for(int i = 0 ; i<n;i++){
            arr [i] = sc.nextInt();
        }

        System.out.println("Array element are: ");
        for(int i = 0 ; i< n;i++){
            System.out.print(arr[i]+" ");
        }

        int temp = 0;

        for(int i=0;i<=arr.length - 1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nSorted Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
