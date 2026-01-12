package Arrays.Hard;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums, 0));

        int[] a = {2,2,2,2,2};
        System.out.println(fourSum(a, 8));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-3; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1; j<nums.length-2; j++) {
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int third = j+1;
                int fourth = nums.length - 1;

                while(third < fourth) {
                    long sum = (long) nums[i] + nums[j] + nums[third] + nums[fourth];

                    if(sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[third], nums[fourth]));
                        
                        third++;
                        fourth--;

                        while(third < fourth && nums[third] == nums[third-1]) third++;
                        while(third < fourth && nums[fourth] == nums[fourth+1]) fourth--;

                    } else if(sum > target) {
                        fourth--;
                    } else if(sum < target) {
                        third++;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

}