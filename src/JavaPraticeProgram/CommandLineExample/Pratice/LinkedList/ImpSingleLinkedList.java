package JavaPraticeProgram.CommandLineExample.Pratice.LinkedList;

public class ImpSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        System.out.println("Linked List before any element add");
        singleLinkedList.display();
        System.out.println("Linked List after element add");

        singleLinkedList.addFirst(10);
        singleLinkedList.addFirst(20);
        singleLinkedList.addFirst(30);


        singleLinkedList.display();

        singleLinkedList.addLast(40);

        singleLinkedList.display();


    }
}
