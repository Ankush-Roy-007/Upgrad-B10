package Arrays.Easy.Leetcode121;

public class BestTimeTobuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]<buy) {
                buy = arr[i];
            } else {
                maxProfit = Math.max(maxProfit, arr[i]-buy);
            }
        }
        return maxProfit;
    }
}
