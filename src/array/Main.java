package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1,2,3,4,5,6,7,8,9};
        double sum =0;
        System.out.println(Arrays.toString(array));

        for(int i=0;i<array.length;i++){
            sum = sum +array[i];
        }
        System.out.println("avg of array "+(sum/array.length));
        }
    }

