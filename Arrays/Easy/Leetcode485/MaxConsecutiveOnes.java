package Leetcode485;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,1,1,0,0,1};
        consecutive(arr);
    }

    public static void consecutive(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++) {

            if(nums[i] == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
//                if(count > maxCount) {
//                    maxCount = count;
//                }

            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
