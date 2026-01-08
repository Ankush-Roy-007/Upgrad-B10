import java.util.Arrays;

public class SwapValuesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 34, 9, 16};
        int[] nums = {7, 18, 34, 63, 47};

        swap(arr, 1, 3);
        swap(nums, 3, 4);
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println(Arrays.toString(arr));
    }
}