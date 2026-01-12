package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3};
//        Bruate solution
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i=0;i<arr.length;i++){
//            hashSet.add(arr[i]);
//        }
//        System.out.println(hashSet);

//        int i = 0;
//        for (int j=1;j<arr.length;j++){
//            if(arr[i] != arr[j]){
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//
//        for (int k =0;k<=i;k++){
//            System.out.print(arr[k]+" ");
//        }



        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }

        System.out.println();
        System.out.println("Using Hash set");


        HashSet<Integer> set = new HashSet<>();
        for (int j = 0;j< arr.length;j++){
            set.add(arr[j]);
        }

        System.out.println(set);

    }
}
