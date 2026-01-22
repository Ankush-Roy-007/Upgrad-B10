package JavaPraticeProgram.CommandLineExample.DSA.Queue.DequeueArray;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeueUsingCollection {
    public static void main(String[] args) {
        Deque<Integer> dequeue = new ArrayDeque<>();

        dequeue.addFirst(50);
        dequeue.addLast(40);
        dequeue.addFirst(30);
        dequeue.addLast(20);
        System.out.println(dequeue);

        dequeue.removeFirst();
        dequeue.removeLast();
        System.out.println(dequeue);




    }
}
