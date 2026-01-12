package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import java.util.Arrays;

public class LeftRotateArrayByDPlace {


     static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotate(int[] arr , int d) {
         int n = arr.length;

         d = d%n;
         reverse(arr , 0 ,d-1);
         reverse(arr , d , n-1);
         reverse(arr , 0,n-1);


     }


//        for(int i = 0;i<n;i++){
//            int first = arr[0];
//            int j;
//            for( j=0;j<arr.length-1;j++){
//                arr[j] = arr[j+1];
//            }
//            arr[j] = first;
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d=3;
        leftRotate(arr , d);
        System.out.println(Arrays.toString(arr));

    }
}

