package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

import java.time.Instant;
import java.util.HashSet;

public class UnionFind {
    static void main() {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1,2,1,3,2,4};
        int[] arr1 = {2,5,6,7,4};

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.println(set);
    }
}
