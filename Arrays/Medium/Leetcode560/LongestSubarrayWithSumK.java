package Arrays.Medium.Leetcode560;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,1,1,4,2,3};
        System.out.println(subarray(nums, 5));
    }

    public static int subarray(int[] arr, int x) {

        // Brute Force -
//        int length = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0;
//
//                for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//
//                if (sum == x) {
//                    length = Math.max(length, j - i + 1);
//                }
//            }
//        }
//        return length;

        // Better -
//        int length = 0;
//        for(int i=0; i<arr.length; i++) {
//            int sum = 0;
//            for(int j=i; j<arr.length; j++) {
//                sum += arr[j];
//                if(sum == x) {
//                    length = Math.max(length, j-i+1);
//                }
//            }
//        }
//        return length;

        // Optimal -
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, len = 0;
        // Before array starts sum is 0 at index -1
        map.put(0,-1);
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(map.containsKey(sum - x)) {
                len = Math.max(len, i- map.get(sum - x));
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return len;

    }

}

