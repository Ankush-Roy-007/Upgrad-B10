package Arrays.Medium.Leetcode1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
        int[] a = {3,3};
        System.out.println(Arrays.toString(twoSum(a, 6)));
    }

    // public static int[] twoSum(int[] nums, int target) {
    //     for(int i=0;i<nums.length;i++) {
    //         for(int j=i+1; j<nums.length;j++) {
    //             if(nums[i] + nums[j] == target) {
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {

            // Get the complement using target value
            int complement = target - nums[i];

            // Search the hashmap for complement, if found, we got our pair
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Put element in hashmap for subsequent searches
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
