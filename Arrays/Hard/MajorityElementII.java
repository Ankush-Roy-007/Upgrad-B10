package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,2,2,2};
//        System.out.println(bruteMajorityElement(nums));
//        System.out.println(betterMajorityElement(nums));
        System.out.println(optimalMajorityElement(nums));
    }

    // Brute Force -
    public static List<Integer> bruteMajorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i< nums.length; i++) {

            if(!list.contains(nums[i])) {
                int count = 0;

                for(int j=0; j< nums.length; j++) {
                    if(nums[j] == nums[i]) {
                        count++;
                    }
                }

                if(count > (nums.length / 3)) {
                    list.add(nums[i]);
                }
            }

            if(list.size() == 2) {
                break;
            }
        }

        return list;
    }

    // Better -
    public static List<Integer> betterMajorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int limit = (nums.length / 3) + 1;

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) == limit) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    // Optimal -
    public static List<Integer> optimalMajorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int element1 = 0, element2 = 0;
        int count1 = 0, count2 = 0;

        for(int i=0; i< nums.length; i++) {
            if (nums[i] == element1) {
                count1++;
            } else if (nums[i] == element2) {
                count2++;
            } else if (count1 == 0) {
                element1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                element2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int i=0; i< nums.length; i++) {
            if(element1 == nums[i]) count1++;
            else if(element2 == nums[i]) count2++;
        }

        int limit = nums.length / 3;
        if(count1 > limit) ans.add(element1);
        if(count2 > limit) ans.add(element2);

        return ans;
    }
}
