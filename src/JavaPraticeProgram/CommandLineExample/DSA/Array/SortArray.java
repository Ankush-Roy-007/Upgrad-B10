
package JavaPraticeProgram.CommandLineExample.DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arr = scanner.nextInt();
        int[] array = new int[arr];

        for(int i=0;i<array.length;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("Array element are ");
        System.out.println(Arrays.toString(array));

        int temp = 0;
        for(int i = 0; i<array.length;i++){
            for (int j = i+1;j<array.length;j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is ");
        System.out.println(Arrays.toString(array));
    }
}
