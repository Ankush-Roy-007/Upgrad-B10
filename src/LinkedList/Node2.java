package LinkedList;

public class Node2 {
    int data;
    Node2 prev;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.prev = this;
        this.next = this;
    }
}
