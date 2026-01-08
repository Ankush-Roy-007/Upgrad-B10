package Queue;
public class Simplequeue {

    int [] queue ;
    int front , rear , size;

    Simplequeue(int size){
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    void push(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){
            front = 0 ;
        }
        rear++;
        queue[rear] = data;
        System.out.println("Element add"+data);
    }

    void pop(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted element is "+queue[front]);
        front++;
    }
    void peek(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is "+queue[front]);
    }
    void display(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front ; i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

}