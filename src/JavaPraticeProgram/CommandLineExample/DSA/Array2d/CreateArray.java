package JavaPraticeProgram.CommandLineExample.DSA.Array2d;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of array");
        int row = sc.nextInt();
        System.out.println("Enter the column of array");
        int column = sc.nextInt();

        int [][] array = new int[row][column];

        System.out.println("Enter the array element");

        for(int i=0 ; i < row;i++){
            for(int j=0; j<column;j++ ){
                array[i][j]= sc.nextInt();
            }
        }

//        output
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));


        System.out.println("Enter the element to find");
        int element = sc.nextInt();

        boolean found = false;

        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(array[i][j] == element){
                    found =true;
                    System.out.println("Element found at position:-"+"i:-"+i+"j:-"+j);
                }
            }
        }
        if(!found){
            System.out.println("Element not present");
        }

    }
}
