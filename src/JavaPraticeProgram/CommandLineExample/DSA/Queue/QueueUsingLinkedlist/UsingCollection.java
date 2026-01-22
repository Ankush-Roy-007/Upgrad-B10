package JavaPraticeProgram.CommandLineExample.DSA.Queue.QueueUsingLinkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class UsingCollection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Add element add to queue");
        queue.add(10);
        queue.offer(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Element in queue"+queue);

        System.out.println("Remove element from front using remove:-"+queue.remove());
        System.out.println("Remove element from front using poll:-"+queue.poll());

        System.out.println("Element in queue"+queue);

        System.out.println("Peek front element using element:-"+queue.element());
        System.out.println("Peek front element using peek:-"+queue.peek());

        System.out.println("Check queue is empty or not:-"+queue.isEmpty());
        System.out.println("Check element 40 exist in queue or not:-"+queue.contains(40));
        System.out.println("Size od queue:-"+queue.size());


    }
}
