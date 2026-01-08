package Leetcode189;

import java.util.Arrays;

/*
    [1 2 3 4 5 6 7]  k = 3
    k = 1 -> [7 1 2 3 4 5 6]
    k = 2 -> [6 7 1 2 3 4 5]
    k = 3 -> [5 6 7 1 2 3 4]

 */

public class RotateArray {
    public static void main(String[] args) {
        // Right Rotate -
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));

        reverse(nums, 0, k-1);
        System.out.println(Arrays.toString(nums));

        reverse(nums, k, n-1);

        System.out.println(Arrays.toString(nums));
    }
}
