package Arrays.Medium.Leetcode2149;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElementsBySize {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] arr) {

        // Better -
//        ArrayList<Integer> positives = new ArrayList<>(arr.length/2);
//        ArrayList<Integer> negatives = new ArrayList<>(arr.length/2);
//
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] > 0) {
//                positives.add(arr[i]);
//            } else {
//                negatives.add(arr[i]);
//            }
//        }
//
//        int[] result = new int[arr.length];
//
//        int index = 0;
//
//        for(int i=0; i< positives.size(); i++) {
//            result[index++] = positives.get(i);
//            result[index++] = negatives.get(i);
//        }
//
//        return result;

        // Optimal -
        int[] result = new int[arr.length];

        int positives = 0;
        int negatives = 1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                result[positives] = arr[i];
                positives += 2;
            } else {
                result[negatives] = arr[i];
                negatives += 2;
            }
        }
        return result;
    }
}

