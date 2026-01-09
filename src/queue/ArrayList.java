package queue;

public class ArrayList {
    int[] list;
    int Size;
    int front,rear;
    ArrayList(int size){
        Size = size;
        list = new int[size];
        front = rear= -1;
    }

    public void enqueue(int value) {
        if(rear == Size) System.out.println("overflow");
        else{
            if(front == -1) front++;
            rear++;
            list[rear]=value;
        }
    }

    public void dequeue() {
        if(front == -1) System.out.println("underflow");
        else{
            int ele = list[front];
            if(front == rear){
                front = rear = -1;
            }
            else {
                front++;
            }
        System.out.println(ele);

        }
    }
    public void show(){
        for(int i = front;i<rear;i++){
            System.out.print(list[i]+",");
        }
        System.out.println();
    }
}
