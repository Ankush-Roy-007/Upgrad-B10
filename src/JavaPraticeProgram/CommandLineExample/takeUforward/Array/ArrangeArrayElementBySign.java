package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrangeArrayElementBySign {
    public static void main(String[] args) {
        int[] arr = {2, -1, 5, 7, -2, -3};

//        ArrayList<Integer> pos = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//
//        for(int num:arr){
//            if(num >=0){
//                pos.add(num);
//            }else{
//                neg.add(num);
//            }
//        }
//
//        int i=0;
//        for (int index=0;index<arr.length;index +=2){
//            arr[index] = pos.get(i);
//            arr[index+1] = neg.get(i);
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int[] result = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                result[posIndex]=arr[i];
                posIndex +=2;
            }else{
                result[negIndex]=arr[i];
                negIndex +=2;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
