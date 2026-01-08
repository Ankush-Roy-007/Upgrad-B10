package JavaPraticeProgram.CommandLineExample.DSA.Queue.PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        // Accourding to small value
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // Accourding to high value
//        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.add(10);
        queue.add(50);
        queue.add(30);
        queue.add(40);
        queue.add(20);

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
