package Arrays.Medium.Leetcode73;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1,1},
                {1,0,0,1},
                {1,1,0,1},
                {1,1,1,1}
        };
//        bruteSetZeroes(matrix);
//        betterSetZeroes(matrix);
        optimalSetZeroes(matrix);

        for(int i=0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

//    public static void bruteSetZeroes(int[][] matrix) {
//
//        // Step 1: Mark rows and columns with -1
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//
//                if(matrix[i][j] == 0) {
//                    // mark entire row
//                    for (int col = 0; col < matrix[i].length; col++) {
//                        if(matrix[i][col] != 0) {
//                            matrix[i][col] = -1;
//                        }
//                    }
//                    // mark entire column
//                    for (int row = 0; row < matrix.length; row++) {
//                        if(matrix[row][j] != 0) {
//                            matrix[row][j] = -1;
//                        }
//                    }
//                }
//            }
//        }
//
//        // Step 2: Convert -1 to 0
//        for(int i=0; i< matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(matrix[i][j] == -1) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }

//    public static void betterSetZeroes(int[][] matrix) {
//        int[] row = new int[matrix.length];
//        int[] col = new int[matrix[0].length];
//
////        Mark rows and columns containing 0
//        for(int i=0; i< matrix.length; i++) {
//            for(int j=0; j< matrix[i].length; j++) {
//                if(matrix[i][j] == 0) {
//                    row[i] = 1;
//                    col[j] = 1;
//                }
//            }
//        }
//
////        Apply zeroes
//        for(int i=0; i<matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(row[i] == 1 || col[j] == 1) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }

    public static void optimalSetZeroes(int[][] matrix) {
        int firstRow = 0, firstCol = 0;

        // Set markers in first row and first column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) firstRow = 1;
                    if(j == 0) firstCol = 1;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Replace inner matrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Handle first row
        if(firstRow == 1) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        // Handle first column
        if(firstCol == 1) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

