import java.util.Arrays;
import java.util.Scanner;
public class additionarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] array2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        for(int i=0; i<array1.length; i++) {
            for(int j=0; j<array1[i].length; j++) {
                System.out.print(array1[i][j] + array2[i][j] + " ");
            }
            System.out.println();
        }

    }
}

