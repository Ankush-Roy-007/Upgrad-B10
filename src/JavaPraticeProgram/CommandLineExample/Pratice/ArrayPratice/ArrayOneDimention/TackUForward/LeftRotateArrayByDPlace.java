package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.TackUForward;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotateArrayByDPlace {

    static void reverse(int[] arr,int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotation(int[] arr,int d){
        int n = arr.length;

        d= d%n;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 1;

        leftRotation(arr,d);

        System.out.println(Arrays.toString(arr));
    }

}
