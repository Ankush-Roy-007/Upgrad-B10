import java.util.Arrays;

public class MaximumValueOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 34, 9, 16};
        max(arr);
    }

    static void max(int[] arr) {
        int maxVal = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(i> maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
    }
}
