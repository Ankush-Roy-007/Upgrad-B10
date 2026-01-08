package JavaPraticeProgram.CommandLineExample.DSA.LinkedListUsingArray;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedlistUsingArray {
    Node head;

    public void createFromArray(int[] arr){

        if(arr.length == 0) return;

        head = new Node(arr[0]);
        Node current = head;

        for(int i=1;i<arr.length;i++){
            current.next = new Node(arr[i]);
            current = current.next;
        }
    }

    public void Display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node current = head;

        if(head == null){
            head = newNode;
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Null");
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Null");
        }
        if(head.next == null){
            head = null;
        }
        Node secondLast = head;
        Node Last = head.next;

        while (Last.next != null){
            Last = Last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

}
