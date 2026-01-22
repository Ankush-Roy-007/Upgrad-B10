package JavaPraticeProgram.CommandLineExample.DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinandMaxElement {
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


        int temp = 0;
        for(int i = 0; i<number.length;i++){
            for (int j = i+1;j<number.length;j++) {
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is ");
        System.out.println(Arrays.toString(number));

        System.out.println("Smallest element is:- "+number[0]);
        System.out.println("Largest element is:- "+number[number.length-1]);

//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for(int i=0;i<number.length;i++){
//            if(number[i]<min){
//                min = number[i];
//            }
//            if(number[i]>max){
//                max = number[i];
//            }
//        }
//
//
//
//        System.out.println("Smallest element is:- "+min);
//        System.out.println("Largest element is:- "+max);





    }

}
