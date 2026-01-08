import java.util.Scanner;
public class large {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nums = {1,2,3,4,5};
        int[] nums1 = {6,7,8,9,10,11,12,13,14,15};

        int[] sum;

        if(nums.length > nums1.length) {
            sum = new int[nums.length];
        } else {
            sum = new int[nums1.length];
        }

        for (int i = 0; i < nums.length; i++) {
            sum[i] = nums[i] + nums1[i];
        }

        for (int i = nums.length; i < nums1.length; i++) {
            sum[i] = nums1[i];
        }

        for(int i=0; i<sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
    }
}

