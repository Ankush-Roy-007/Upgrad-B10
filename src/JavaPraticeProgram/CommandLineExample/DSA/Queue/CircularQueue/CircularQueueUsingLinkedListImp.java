package JavaPraticeProgram.CommandLineExample.DSA.Queue.CircularQueue;

public class CircularQueueUsingLinkedListImp {
    public static void main(String[] args) {
        CircularQueueUsingLinkedList cq = new CircularQueueUsingLinkedList();

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display();

        cq.dequeue();
        cq.enqueue(10);
        cq.display();
    }
}
