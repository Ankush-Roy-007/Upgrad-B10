package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    static void main() {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k=3;
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum==k){
                maxLength = i+1;
            }if(map.containsKey(sum-k)){
                maxLength = Math.max(maxLength,i-map.get(sum-k));
            }if(!map.containsKey(sum)){
                map.put(sum , i);
            }
        }
        System.out.println(maxLength);
    }
}
