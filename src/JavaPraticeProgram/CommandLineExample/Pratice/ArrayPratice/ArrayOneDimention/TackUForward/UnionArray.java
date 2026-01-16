package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.TackUForward;

import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4};
        int[] arr1 = {5,4,3,6};

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0 ;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        for(int i = 0 ;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }

        System.out.println(hashSet);
    }
}
