package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

import JavaPraticeProgram.CommandLineExample.Demo.Main;

import java.util.HashMap;

public class LongestSubArrayOfSumIsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            if(sum == k){
                maxLength = i+1;
            }if(map.containsKey(sum - k)){
                maxLength = Math.max(maxLength , i-map.get(sum-k));
            }if(!map.containsKey(sum)){
                map.put(sum , i);
            }
        }
        System.out.println(maxLength);

    }
}
