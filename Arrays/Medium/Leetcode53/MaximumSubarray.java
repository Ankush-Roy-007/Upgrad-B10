package Arrays.Medium.Leetcode53;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(nums));

        int[] arr = {5};
        System.out.println(maxSubarray(arr));

        int[] a = {-2,-2};
        System.out.println(maxSubarray(a));

        int[] b = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubarray(b));
    }

    public static int maxSubarray(int[] nums) {

        // Brute Apprach -
//        int maximum = nums[0];
//        for(int i=0; i<nums.length; i++) {
//            for(int j=i; j< nums.length; j++) {
//                int sum = 0;
//                for(int k=i; k<j; k++) {
//                    sum += nums[k];
//                    maximum = Math.max(sum, maximum);
//                }
//            }
//        }
//        return maximum;


        // Better appraoch -
//        int maximum = Integer.MIN_VALUE;
//        for(int i=0; i< nums.length; i++) {
//            int sum = 0;
//            for(int j=i; j< nums.length; j++) {
//                sum += nums[j];
//                maximum = Math.max(sum, maximum);
//            }
//        }
//        return maximum;

        // Optimal Solution -
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i< nums.length; i++) {
            sum += nums[i];
            if(sum>maximum) {
                maximum = sum;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        return maximum;
    }
}

