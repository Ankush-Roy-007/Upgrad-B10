package queue;

public class UsingArray {
    public static void main(String[] args) {
        ArrayList AL = new ArrayList(10);
        int value = 1;
        AL.enqueue(value);
        AL.show();
        value = 2;
        AL.enqueue(value);
        AL.show();
        value = 3;
        AL.enqueue(value);
        AL.show();

        AL.dequeue();
        AL.show();
        AL.dequeue();
        AL.show();
        AL.dequeue();
        AL.show();


    }
}
