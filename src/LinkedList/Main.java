package LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Linkedlist linkedlist = new Linkedlist();
        linkedlist.insertAtBeginning(5);
        linkedlist.insertAtBeginning(10);
        linkedlist.insertAtBeginning(15);
        linkedlist.insertAtBeginning(20);
        linkedlist.insertAtBeginning(25);
        linkedlist.insertAtBeginning(30);

        System.out.println("Linklist ->");
        linkedlist.traverse();
        System.out.println();
    }
}
