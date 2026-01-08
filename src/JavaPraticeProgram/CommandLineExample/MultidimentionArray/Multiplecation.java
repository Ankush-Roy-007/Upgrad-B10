package JavaPraticeProgram.CommandLineExample.MultidimentionArray;

public class Multiplecation {
    public static void main(String[] args) {
        //2D Array
        int[][] array1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] array2 = {{9,8,7},{6,5,4},{3,2,1}};
        for (int i = 0; i < array1.length; i++) {
            for(int j=0;j<array1[i].length;j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for(int j=0;j<array2[i].length;j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
