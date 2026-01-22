package JavaPraticeProgram.CommandLineExample.DSA.Array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplecation {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
//                System.out.print(arr1[i][j]+" ");
            }
//            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr1));

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
//                System.out.print(arr2[i][j]+" ");
            }
//            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr2));



        int rows = arr1.length;
        int column = arr2[0].length;
        int common = arr1[0].length;

        int[][] result = new int[rows][column];

        for(int i= 0 ;i<rows;i++ ){
            for(int j=0;j<column;j++){
                for(int k =0;k<common;k++){
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));

    }
}
