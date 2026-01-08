package JavaPraticeProgram.CommandLineExample.DSA.LinkList;

public class LinkedListFirstProgram {

Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head =newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Add Last

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //Add Anyposition

    public void Anypostion(int element , int key){
        Node newNode = new Node(element);
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;

        while (currentNode != null && currentNode.data != key){
            currentNode = currentNode.next;
        }

        if(currentNode == null){
            System.out.println("Key not found");
            return;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }




    //delete first

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    //delete Last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head=null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    //delete any position

    public void deleteAtAnyPosition(int key){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;

        while (currentNode != null && currentNode.next.data != key){
            currentNode = currentNode.next;
        }
        if(currentNode.next == null){
            System.out.println("Key not found");
            return;
        }
        currentNode.next = currentNode.next.next;

    }


    // Display

    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

}