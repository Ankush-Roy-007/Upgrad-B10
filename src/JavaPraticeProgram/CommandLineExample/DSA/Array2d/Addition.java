package JavaPraticeProgram.CommandLineExample.DSA.Array2d;

import java.util.Arrays;

public class Addition {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
        int sum = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j] += arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr1));

    }
}
