public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 45, 76, 24, 18, 32, 49, 57, 63};
        int ans  = rangeSearch(arr, 2, 5, 18);
        System.out.println(ans);
    }

    static int rangeSearch(int[] arr, int start, int end, int target) {
        if(arr == null || start < 0 || end >= arr.length || start > end) {
            return -1;
        }

        for(int i=start; i<=end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
