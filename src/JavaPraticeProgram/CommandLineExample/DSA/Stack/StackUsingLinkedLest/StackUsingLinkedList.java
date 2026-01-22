package JavaPraticeProgram.CommandLineExample.DSA.Stack.StackUsingLinkedLest;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data  = data;
        this.next = null;
    }
}
public class StackUsingLinkedList {
    Node top;

    void Push(int data){
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
        System.out.println(data+"Pushed");
    }

    void Pop(){
        if(top == null){
            System.out.println("Stack is underflow");
            return;
        }
        System.out.println(top.data+"Popped");
        top = top.next;
    }

    void Peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is:- "+top.data);
    }


    void Display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.Display();

        stackUsingLinkedList.Push(10);
        stackUsingLinkedList.Push(20);
        stackUsingLinkedList.Push(30);
        stackUsingLinkedList.Display();

        stackUsingLinkedList.Pop();
        stackUsingLinkedList.Display();

        stackUsingLinkedList.Peek();

    }
}

