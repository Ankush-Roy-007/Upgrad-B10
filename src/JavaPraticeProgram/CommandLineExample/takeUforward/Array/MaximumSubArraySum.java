package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int maxSum = Integer.MIN_VALUE;
//
//        for(int i=0;i<arr.length;i++){
//            int currentSum = 0;
//            for(int j=i;j<arr.length;j++){
//                currentSum+=arr[j];
//                if(currentSum > maxSum){
//                    maxSum = currentSum;
//                }
//            }
//        }
//        System.out.println(maxSum);
        int maxSum = arr[0];
        int currentSum = arr[0];

        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i],currentSum+=arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);
    }
}
