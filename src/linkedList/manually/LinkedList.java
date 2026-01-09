package linkedList.manually;
// doing oprations in this class
public class LinkedList {
    public static Node head;
    public static Node tail;
    LinkedList(){
        head = null;
        tail = null;
    }

    // add node to the list
    public static void addElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        newNode.prev=tail;
        tail.next = newNode;
        tail = newNode;
    }
    // add node to the specific position in list

    public static void addElement(int data, int positionInList){
        Node newNode = new Node(data);
        Node temp = head;
        if(positionInList == 1){
            head.prev=newNode;
            newNode.next = head;
            head = newNode;
        }else{
            int index = 0;
            while(index<positionInList){
                temp = temp.next;
                index++;
            }
            newNode.prev=temp;
            newNode.next=temp.next;
            temp.next=newNode;
        }
//        tail.next = newNode;
//        tail = newNode;
    }
    // delete node by data
    public void deleteElement(int data){
        Node temp = head.next;

        if(head.data==data) {
            head = head.next;
            head.prev=null;
        }else {
            while (temp.data != data) {

                temp = temp.next;
            }
            Node t = temp.next;
            temp=temp.prev;
            temp.next=t;
            t.prev=temp;


        }
    }
    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }


}
