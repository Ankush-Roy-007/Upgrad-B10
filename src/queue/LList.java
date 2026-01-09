package queue;

public class LList {
    Node head;
    Node tail;
    int size;
    LList() {
        head= null;
        tail = null;
        size=-1;
    }

    public void enqueued(int i) {
        Node newNode = new Node(i);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next=newNode;
            tail = newNode;
        }
        size++;
    }

    public void dequeued() {
        //int ans=0;
        if(size == -1) System.out.println("underflow the queue");
        else{
            System.out.println(head.data);
            head = head.next;
            size --;
        }
        //return ans;
    }

    public void print() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.println();
    }
}
