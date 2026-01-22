package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateFormUnsortedArray {
    public static void main() {
        int[] arr = {4,6,1,4,6,5};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
