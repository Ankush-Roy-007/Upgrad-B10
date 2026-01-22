package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

import java.util.Arrays;

public class ArraySort012 {
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void Sort123(int[] arr){
        int low =0 ,mid =0,high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr , low , mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else {
                swap(arr , mid , high);
                high--;
            }
        }
    }

    static void main() {
        int[] arr = {0,1,1,0,1,2,1,2,0,0,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(arr));


        ArraySort012 ar = new ArraySort012();
        ar.Sort123(arr);
        System.out.println(Arrays.toString(arr));


    }
}
