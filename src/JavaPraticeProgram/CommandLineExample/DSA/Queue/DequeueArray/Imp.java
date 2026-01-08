package JavaPraticeProgram.CommandLineExample.DSA.Queue.DequeueArray;

import java.util.Arrays;

public class Imp {
    public static void main(String[] args) {
        DequeueArray da = new DequeueArray(5);

//        System.out.println(Arrays.toString([da.dequeue]));

        da.insertFront(10);
        da.insertFront(20);
        da.insertRare(30);
        da.insertRare(40);
//        System.out.println(Arrays.toString([da.dequeue]));

        da.isFrontPeek();
        da.isRarePeek();

        da.deleteFront();
        da.deleteRare();


    }
}
