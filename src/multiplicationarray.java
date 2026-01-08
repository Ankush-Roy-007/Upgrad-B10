import java.util.Arrays;
import java.util.Scanner;
public class multiplicationarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[][] A = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
         int[][] B = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
         int[][] C = new int[3][3];
         for(int i=0; i<A.length; i++) {
             for(int j=0; j<B[0].length; j++) {
                 for(int k=0; k<A[0].length; k++) {
                     C[i][j] += A[i][k] * B[k][j]; } } }
         for(int[] n : C) {
             System.out.println(Arrays.toString(n));
         }
    }
}



