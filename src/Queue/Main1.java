package Queue;
public class Main1 {
    public static void main(String[] args) {
        Circularqueue cq = new  Circularqueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display();

        cq.dequeue();
        cq.enqueue(60);
        cq.display();
        cq.peek();

    }
}