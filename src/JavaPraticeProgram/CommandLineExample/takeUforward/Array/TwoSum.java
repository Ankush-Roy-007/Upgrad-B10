package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,5};
        int target = 13;
        int sum = 0;

//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                sum =arr[i]+arr[j];
//                if(sum==target){
//                    System.out.println(arr[i]+" "+arr[j]);
//                    System.out.println(i+" "+j);
//                }
//            }
//        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need = target-arr[i];
            if(map.containsKey(need)){
                System.out.println(need+" "+arr[i]);
            }
            map.put(arr[i],i);
        }


    }
}
