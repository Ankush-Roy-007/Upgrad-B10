package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,4};
        int i = 0;
//        for (int j=0;j<arr.length;j++){
//            if(arr[j]!=0) {
//                arr[i] = arr[j];
//                i++;
//            }
//        }
//
//        while (i < arr.length){
//            arr[i] = 0;
//            i++;
//        }



        for(int j = 0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i] = arr[j];
                i++;
            }
        }

        while (i<arr.length){
            arr[i] = 0;
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
