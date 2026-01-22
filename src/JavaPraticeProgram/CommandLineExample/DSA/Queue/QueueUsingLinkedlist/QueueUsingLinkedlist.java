package JavaPraticeProgram.CommandLineExample.DSA.Queue.QueueUsingLinkedlist;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class QueueUsingLinkedlist {

    Node head , tail;

    boolean isEmpty(){
        return head == null;
    }

    void push(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element is:-"+head.data);
        head = head.next;
    }

    void front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Element at front is:-"+head.data);
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }




}
