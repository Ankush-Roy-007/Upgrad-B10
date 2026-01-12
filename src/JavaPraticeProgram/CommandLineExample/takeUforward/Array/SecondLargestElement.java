package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {


        int[] arr = {10,40,40,3,7};
//      Worest Case to get out put O(n^2)
//        for(int i = 0; i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Second Largest"+arr[arr.length-2]);

//        int i = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;
//        for(int j = 0 ;j<arr.length;j++){
//            if(arr[j]>i){
//               second = i;
//               i = arr[j];
//            }else if(arr[j]>second && arr[j]!=i){
//                second = arr[j];
//            }
//        }
//        System.out.println(second);

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                second = largest;
                largest = arr[i];
            }else if(arr[i]>second && arr[i]!=largest){
                second = arr[i];
            }
        }
        System.out.println("largest:-"+largest);
        System.out.println("Second largest:-"+second);



    }
}
