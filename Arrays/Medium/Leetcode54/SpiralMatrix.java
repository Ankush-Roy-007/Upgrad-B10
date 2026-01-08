package Arrays.Medium.Leetcode54;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        List<Integer> arr = spiralOrder(matrix);
        System.out.println(arr);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right) {
            // left -> right
            for(int i=left; i<=right; i++) {
                arr.add(matrix[top][i]);
            }
            top++;

            // top -> bottom
            for(int i=top; i<=bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;

            // right -> left
            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom -> top
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }

        return arr;
    }
}