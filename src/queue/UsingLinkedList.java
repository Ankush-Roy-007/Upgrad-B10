package queue;

public class UsingLinkedList {
    public static void main(String[] args) {
        LList queue = new LList();
        int i = 1;
        queue.enqueued(i);
        queue.print();
        i = 2;
        queue.enqueued(i);
        queue.print();
        i = 3;
        queue.enqueued(i);
        queue.print();
        queue.dequeued();
        queue.print();
        i = 4;
        queue.enqueued(i);
        queue.print();
        i = 5;
        queue.enqueued(i);
        queue.print();
        queue.dequeued();
        queue.print();
    }
}
