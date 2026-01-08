package JavaPraticeProgram.CommandLineExample.DSA.DoubalyLinklist;

public class ImpDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addFirst(10);
        doublyLinkedList.addFirst(20);
        doublyLinkedList.addLast(30);

        doublyLinkedList.displayForward();
        doublyLinkedList.displayBackward();
    }
}
