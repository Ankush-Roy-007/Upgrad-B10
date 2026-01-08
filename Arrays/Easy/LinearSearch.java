public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {24, 46, 72, 15, 18, -8, 35, -27};

        int ans = search(arr, -8);
        System.out.println(ans);
    }

    static int search(int arr[], int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
