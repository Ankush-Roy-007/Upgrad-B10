package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

import java.util.Arrays;

public class MoveZeroToEnd {
    static void main() {
        int i=0;
        int[] arr = {0,1,3,0,4};

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        while (i<arr.length){
            arr[i]=0;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
