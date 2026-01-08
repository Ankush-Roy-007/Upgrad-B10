package LinkedList;

public class Main2 {
    public static void main(String[] args) {

        Circularlinkedlist cll = new Circularlinkedlist();

        cll.addFirst(10);
        cll.addLast(30);
        cll.addMiddle(10, 20);

        cll.traverseForward();
        cll.traverseBackward();
    }
}
