package JavaPraticeProgram.CommandLineExample.DSA.Array2d;

import java.util.Arrays;
import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row");
        int row = sc.nextInt();

        System.out.println("Enter the number of column");
        int column = sc.nextInt();

        int[][] array = new int[row][column];

        System.out.println("Enter the array element");

        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(array));

        boolean found = false;

        System.out.println("Enter the element to find");
        int element = sc.nextInt();

        for(int i=0 ; i<row;i++){
            for (int j=0 ; j<column; j++){
                if(array[i][j] == element ){
                    System.out.println("Element find at position "+"i:-"+i+"j:-"+j);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Element not present in array");
        }

    }
}
