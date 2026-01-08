package LinkedList;

public class Main1 {
    public static void main(String[] args) {

        Doublylinkedlist dll = new Doublylinkedlist();

        dll.addFirst(10);
        dll.addLast(30);
        dll.addMiddle(10, 20);

        dll.traverseForward();
        dll.traverseBackward();
    }
}
