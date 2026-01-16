package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import JavaPraticeProgram.CommandLineExample.Demo.Main;

import java.util.HashMap;

public class LongestSubArrayOfSumIsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int length = 0;
        int sum1 = 3;
        int sum = 0;
//        for(int i=0;i<arr.length;i++){
//            int sum =0;
//            for(int j=i;j<arr.length;j++){
//                    sum = sum + arr[j];
//                    if(sum == sum1){
//                        length = Math.max(length , j-i+1);
//                }
//            }
//        }
//        System.out.println(length);
//    }

        HashMap<Integer , Integer>map = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
                if(sum==sum1){
                    length = i=1;
                }
                if(map.containsKey(sum-sum1)){
                    length = Math.max(length , i-map.get(sum-sum1));

                    map.putIfAbsent(sum,i);
                }
                System.out.println(length);
            }
    }
}
