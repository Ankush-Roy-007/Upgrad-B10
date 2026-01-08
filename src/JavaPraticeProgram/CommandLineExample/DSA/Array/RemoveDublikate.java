package JavaPraticeProgram.CommandLineExample.DSA.Array;

import java.util.Arrays;

public class RemoveDublikate {
    public static void main(String[] args) {
        int[] arr = {10,5,4,7,5};
//        int temp = 0;
//
//        for(int i=0;i<arr.length;i++) {
//            boolean duplicate = false;
//
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    duplicate = true;
//                    continue;
//                }
//            }
//            if (!duplicate) {
//                System.out.print(arr[i]+" ");
//            }
//
//        }
//
//        System.out.println();
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            System.out.print(arr[i]+" ");
//        }

        // With out using 2 loop


//        for(int i=0;i<arr.length;i++){
//            for (int j =i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j] = temp;
//                }
//            }
//            System.out.print(arr[i]+" ");
//        }


        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(i==0||arr[i] != arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }

    }
}

