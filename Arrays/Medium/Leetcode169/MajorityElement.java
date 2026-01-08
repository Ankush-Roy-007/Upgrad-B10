package Arrays.Medium.Leetcode169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,1,2,2};
        System.out.println(majority(nums));
    }

    public static int majority(int[] nums) {
        int majority = nums[0];
        int votes = 1;

        for(int i=1; i< nums.length; i++) {
            if(votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;
    }
}
