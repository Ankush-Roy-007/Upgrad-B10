public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {23, 45, 76, 24, 18, 32, 49, 57, 63};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        if(arr.length == 0 || arr == null) {
            return -1;
        }

        int minimum = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
