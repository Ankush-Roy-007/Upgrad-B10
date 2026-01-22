package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

import java.util.HashMap;

public class TwoSum {
    static void main() {
        int[] arr={1,2,3,4,5};
        int k = 5;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];

                if(sum == k){
                    System.out.println("Element are:-"+arr[i]+" "+arr[j]);
                    System.out.println("Element index are:-"+i+" "+j);
                }

            }
        }


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int need = k - arr[i];
            if(map.containsKey(need)){
                System.out.println("Element are:-"+need+" "+arr[i]);
            }
            map.put(arr[i],i );
        }



    }
}
