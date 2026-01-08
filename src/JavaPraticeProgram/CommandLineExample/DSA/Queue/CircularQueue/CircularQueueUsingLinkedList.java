package JavaPraticeProgram.CommandLineExample.DSA.Queue.CircularQueue;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularQueueUsingLinkedList {
    Node front, rear;

    boolean isEmpty(){
        return front == null;
    }

    void enqueue(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            front = rear = newNode;
            rear.next = front;
        }else{
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
        System.out.println("Inserted element is:-"+data);
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(front == rear){
            System.out.println("Deleted:-"+front.data);
            front = rear = null;
        }else{
            System.out.println("Deleted:-"+front.data);
            front = front.next;
            rear.next = front;
        }
    }

    void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }else{
            System.out.println("Element at front is:-"+front.data);
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Circular Queue: ");
        Node temp = front;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while (temp != front);
        System.out.println();
    }

}
