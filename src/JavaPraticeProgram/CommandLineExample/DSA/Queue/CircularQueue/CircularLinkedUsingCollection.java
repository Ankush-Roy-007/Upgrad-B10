package JavaPraticeProgram.CommandLineExample.DSA.Queue.CircularQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class CircularLinkedUsingCollection {
    public static void main(String[] args) {

        Queue<Integer> cq = new ArrayDeque<>();

        cq.offer(10);
        cq.offer(20);
        cq.offer(30);
        cq.offer(40);

        System.out.println(cq); // [10, 20, 30, 40]

        cq.poll(); // removes 10
        cq.poll(); // removes 20

        cq.offer(50);
        cq.offer(60);

        System.out.println(cq); // [30, 40, 50, 60]
    }
}
