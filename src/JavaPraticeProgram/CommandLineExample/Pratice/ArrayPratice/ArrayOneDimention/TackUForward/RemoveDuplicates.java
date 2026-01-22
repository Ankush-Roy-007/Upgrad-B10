package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.TackUForward;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1 , 1 ,2 ,2 ,2 ,3 ,3};
        int i=0;
        for(int j =1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];

            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr,i+1)));
    }
}
