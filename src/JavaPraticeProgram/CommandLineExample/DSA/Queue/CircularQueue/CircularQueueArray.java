package JavaPraticeProgram.CommandLineExample.DSA.Queue.CircularQueue;

public class CircularQueueArray {

    int[] queue;
    int size , front , rear;

    CircularQueueArray(int size){
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        return ((front == 0 && rear == size - 1)|| front == rear +1 );
    }

    boolean isEmpty(){
        return front == -1;
    }


    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){
            front = rear = 0;
        }else if(rear == size -1 && front != 0){
            rear = 0;
        }else {
            rear ++;
        }

        queue[rear] = data;
        System.out.println("Inserted element is:- "+data);
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted: " + queue[front]);
        if(front == rear){
            front = rear = -1;
        }else if(front == size-1){
            front = 0;
        }else {
            front ++;
        }
    }

    void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }else {
            System.out.println("Element at front"+queue[front]);
        }
    }

    void display(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Circular Queue: ");
        int i = front;
        while (true){
            System.out.print(queue[i]+" ");
            if(i == rear)
                break;
            i= (i+1)%size;
        }
        System.out.println();
    }


}
