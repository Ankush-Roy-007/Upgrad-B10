package JavaPraticeProgram.CommandLineExample.DSA.CircularLinkList;



class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}


public class CircularLinkedlist {
    Node head = null;
    Node tail = null;


    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;

        }else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while (temp != head);
        System.out.println("(back to head)");
    }



}
