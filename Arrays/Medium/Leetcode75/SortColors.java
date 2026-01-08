package Arrays.Medium.Leetcode75;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bruteApproach(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int red = 0;
        int white = 1;
        int blue = 2;

        for(int i=0; i< nums.length; i++) {
            if(nums[i] == red) {
                list.add(red);
            }
        }

        for(int i=0; i< nums.length; i++) {
            if(nums[i] == white) {
                list.add(white);
            }
        }

        for(int i=0; i< nums.length; i++) {
            if(nums[i] == blue) {
                list.add(blue);
            }
        }

        for(int i=0; i<nums.length; i++) {
            nums[i] = list.get(i);
        }

    }

    private static void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }

    public static void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while(mid <= end) {
            if(nums[mid] == 0) {
                swap(nums, start, mid);
                mid++;
                start++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, end);
                end--;
            }
        }
    }

}
