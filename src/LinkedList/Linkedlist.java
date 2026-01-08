package LinkedList;

public class Linkedlist {
 Node head;
 public Linkedlist(){
     this.head = null;
 }
  public void insertAtBeginning(int data){
     Node newNode = new Node(data);
     newNode.next = head;
     head = newNode;
  }
  public void deleteNode(int key){
     Node temp = head;
     Node prev = null;

     if(temp != null && temp.data ==key){
         head = temp.next;
         return;
     }
     while(temp !=null && temp.data != key){
         prev = temp;
         temp = temp.next;
     }
     if(temp == null)
         return;
     prev.next = temp.next;
  }
  public void traverse(){
     Node current = head;
     while(current != null){
         System.out.print(current.data + "->");
         current = current.next;
     }
  }
}
