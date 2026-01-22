package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.TackUForward;

public class MaxElementArray {

    // Method to find largest element
    public static int largestElement(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 99, 23};

        int result = largestElement(arr);
        System.out.println("Largest element is: " + result);
    }
}
