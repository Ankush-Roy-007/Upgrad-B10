package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import java.util.Arrays;

public class RearrangeArrayByPosiAndNegi {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,3,-7,-5};
        int n = arr.length;
        int[] result = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                result[posIndex] = arr[i];
                posIndex+=2;
            }else{
                result[negIndex] = arr[i];
                negIndex+=2;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
