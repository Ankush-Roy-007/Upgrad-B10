package JavaPraticeProgram.CommandLineExample.DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.println("Enter the array element");
        for (int i=0;i<=number.length-1;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Array element are ");
        System.out.println(Arrays.toString(number));

        System.out.println("Enter the element to find");
        int element = sc.nextInt();

        boolean found = false;

        for (int i=0;i<number.length;i++){
            if(number[i]==element){
                System.out.println("element is found at position:-"+i);
                found=true;
            }
        }
        if(!found){
            System.out.println("Element " + element + " is not present in array");
        }

    }
}
