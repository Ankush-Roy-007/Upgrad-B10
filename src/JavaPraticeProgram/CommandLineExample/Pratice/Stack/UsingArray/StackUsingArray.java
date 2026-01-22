package JavaPraticeProgram.CommandLineExample.Pratice.Stack.UsingArray;

public class StackUsingArray {

    int [] stack;
    int size;
    int top;

    StackUsingArray(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int data){
        if (top == size - 1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " Pushed");
    }

    void pop(){
        if (top == -1){
            System.out.println("Stack is UnderFlow");
            return;
        }
        System.out.println(stack[top--]+"Popped");
    }


    void peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Element at top:-"+stack[top]);
    }

    void display(){
        if (top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for (int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }


}
