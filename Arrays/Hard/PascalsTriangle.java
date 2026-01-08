package Arrays.Hard;

// Leetcode - 118

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            triangle.add(generateRow(i));
        }
        return triangle;
    }

    public List<Integer> generateRow(int row) {
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col=1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }

}
