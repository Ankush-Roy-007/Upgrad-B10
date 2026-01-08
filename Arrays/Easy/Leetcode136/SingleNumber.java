package Leetcode136;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,4};
        System.out.println(singleNumber(arr));
        int[] nums = {2,3,4,2,9,3,4,5,5};
        System.out.println(singleNumber(nums));
        int[] a = {5};
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] arr) {
        int xor = 0;

        for(int n : arr) {
            xor = xor ^ n;
        }

        return xor;
    }
}
