package JavaPraticeProgram.CommandLineExample.DSA.Queue.DequeueArray;

public class DequeueArray {

    int[] dequeue;
    int front , rare,size;

    DequeueArray(int size){
        this.size = size;
        dequeue = new int[size];
        front = -1;
        rare = -1;
    }

    boolean isFull(){
        return (rare == size -1 && front == 0 || (front == rare +1));
    }

    boolean isEmpty(){
        return front == -1;
    }

    void insertFront(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) { // first element
            front = rare = 0;
        }else if(front == 0){
            front = size-1;
        }else {
            front --;
        }
        dequeue[front] = data;
        System.out.println("Inserted at front: " + data);
    }

    void insertRare(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) { // first element
            front = rare = 0;
        }else if(rare == size -1){
            rare = 0;
        }else{
            rare++;
        }
        dequeue[rare] = data;
        System.out.println("Inserted at rare: "+data);
    }

    void deleteFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted from front: " + dequeue[front]);
        if(front == rare){
            front = rare = -1;
        }else if(front == size -1){
            front = 0;
        }else{
            front++;
        }
    }

    void deleteRare(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted from rear: " + dequeue[rare]);

        if(front == rare){
            front = rare = -1;
        }else if(rare == 0){
            rare = size-1;
        }else{
            rare--;
        }
    }

    void isFrontPeek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Element at front:-"+dequeue[front]);
    }
    void isRarePeek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Element at rare:-"+dequeue[rare]);
    }



}
