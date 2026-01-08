package JavaPraticeProgram.CommandLineExample.Pratice.Stack.UsingLinkedlist;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}



public class StackUsingLinkedlist {
    Node top;

    void push(int data){
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
        System.out.println(data+"pushed");
    }

    void pop(){
        if(top == null){
            System.out.println("Stack empty");
            return;
        }
        System.out.println(top.data+" popped element");
        top = top.next;
    }

    void peek(){
        if(top == null){
            System.out.println("Stack empty");
            return;
        }
        System.out.println("Top element is:-"+top.data);
    }

    void display(){
        if(top == null){
            System.out.println("Stack empty");
            return;
        }

        Node temp = top;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
