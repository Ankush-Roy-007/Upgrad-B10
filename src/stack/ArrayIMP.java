package stack;

public class ArrayIMP {
    int[] array ;
    int top;
    int size;
    ArrayIMP(int size){
        array = new int[size];
        top=-1;
        this.size=size-1;
    }

    public void push(int i) {
        if(top==size) System.out.println("overflow");
        else {
            top++;
            array[top] = i;
        }
    }

    public void pop() {
        if(top==-1) System.out.println("underflow");
        else {
            array[top]=0;
            top--;
        }
    }

    public void peek() {
        System.out.println(array[top]);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top==size;
    }

    public void size() {
        System.out.println(top+1);
    }
}
