package Arrays.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(optimalThreeSum(nums));
    }

//    public static List<List<Integer>> bruteThreeSum(int[] nums) {
//        Set<List<Integer>> set = new HashSet<>();
//
//        for(int i=0; i<nums.length; i++) {
//            for(int j=i+1; j< nums.length; j++) {
//                for(int k=j+1; k< nums.length; k++) {
//
//                    if(nums[i] + nums[j] + nums[k] == 0) {
//
//                        List<Integer> triplet = new ArrayList<>();
//                        triplet.add(nums[i]);
//                        triplet.add(nums[j]);
//                        triplet.add(nums[k]);
//
//                        Collections.sort(triplet);
//
//                        set.add(triplet);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(set);
//    }

    public static List<List<Integer>> betterThreeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i]+nums[j]);

                if(hashSet.contains(third)) {

                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(third);

                    Collections.sort(triplet);
                    set.add(triplet);
                }
                hashSet.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }

    // 2 pointer approach -
    public static List<List<Integer>> optimalThreeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i< nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;

                } else if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                }
            }
        }

        return new ArrayList<>(result);
    }
}

