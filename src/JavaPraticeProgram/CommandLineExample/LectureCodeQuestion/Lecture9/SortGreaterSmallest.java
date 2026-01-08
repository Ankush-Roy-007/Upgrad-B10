package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.Lecture9;

import java.util.Arrays;

public class SortGreaterSmallest {

    public static void main(String[] args) {
        int[] array = {2,43,32,55,61,2,11,99,4,3,23,54,76};
        int temp = 0;
        for(int i=0; i<array.length;i++){
            for (int j=i+1;j<array.length;j++){

                if (array[i]>array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(array));
    }

}
