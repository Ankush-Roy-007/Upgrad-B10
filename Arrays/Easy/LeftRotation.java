import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        rotateArray(3, arr);
//        System.out.println(Arrays.toString(arr));

        rotateLeft(arr, 3);
    }

    public static void rotateArray(int d, int[] arr) {
        int[] temp = new int[d];

        for(int i=0; i<temp.length; i++) {
            temp[i] = arr[i];
        }

        for(int i=0; i<arr.length - d; i++) {
            arr[i] = arr[i + d];
        }

        for(int i = arr.length - d; i< arr.length; i++) {
            arr[i] = temp[i - d -1];
        }

    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Step-1 : reverse a array -
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

        // Step-2 : reverse first (length - k) numbers -
        reverse(arr, 0, n - k - 1);
        System.out.println(Arrays.toString(arr));

        // Step-3 : Reverse last k numbers -
        reverse(arr, n - k, n- 1);
        System.out.println(Arrays.toString(arr));
    }
}
