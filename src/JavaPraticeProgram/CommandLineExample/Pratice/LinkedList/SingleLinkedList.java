package JavaPraticeProgram.CommandLineExample.Pratice.LinkedList;


class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {

    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    public void display() {

        if (head == null) {
            System.out.println("null");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            if (currNode.next != null) {
                System.out.print("->");
            }
            currNode = currNode.next;
        }
        System.out.println("->Null");
    }


    public void deleteFirst() {

        if (head == null) {
            System.out.println("Null");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Null");
            return;
        }
        if (head.next == null) {
            head = null;
        }

        Node secondLast = head;
        Node Last = head.next;

        while (Last != null){
            Last = Last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
}



