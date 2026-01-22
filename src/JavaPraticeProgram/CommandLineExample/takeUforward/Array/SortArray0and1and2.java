package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import java.util.Arrays;

public class SortArray0and1and2 {

    public static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort012(int[] arr ){
            int low = 0, mid = 0, high = arr.length-1;

            while (mid <= high ){
                if(arr[mid] == 0){
                    swap(arr , low , mid);
                    low++;
                    mid++;
                }else if (arr[mid]==1){
                    mid++;
                }else {
                    swap(arr , mid , high);
                    high--;
                }
            }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,2,1,2,0,0,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));

//        for(int i = 0; i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int k=0;k<arr.length;k++){
//            System.out.print(arr[k]+" ");
//        }
//        System.out.println(Arrays.toString(arr));


    }
}
