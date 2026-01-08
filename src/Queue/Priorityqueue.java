import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;


public class Priorityqueue {
    public static void main(String[] args) {
        // Accourding to small value
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        // Accourding to high value
//        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.add(60);
        queue.add(80);
        queue.add(70);
        queue.add(90);
        queue.add(100);

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.peek());
    }
}