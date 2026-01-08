package JavaPraticeProgram.CommandLineExample.DSA.Stack.StackUsingArray;

public class StackUsingArray {

    int size;
    int top;
    int[] stack;

    StackUsingArray(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void Push(int data){
        if(top == size-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
        System.out.println(data+" Pushed");
    }

    void Pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(stack[top--]+"Popped");
    }

    void Peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is "+stack[top]);
    }

    void Display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i= top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }


}
