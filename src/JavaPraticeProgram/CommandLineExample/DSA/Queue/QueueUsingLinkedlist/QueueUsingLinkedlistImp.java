package JavaPraticeProgram.CommandLineExample.DSA.Queue.QueueUsingLinkedlist;

public class QueueUsingLinkedlistImp {
    public static void main(String[] args) {
        QueueUsingLinkedlist queueUsingLinkedlist = new QueueUsingLinkedlist();
        queueUsingLinkedlist.display();

        System.out.println("Element add to queue");
        queueUsingLinkedlist.push(10);
        queueUsingLinkedlist.push(20);
        queueUsingLinkedlist.push(30);
        queueUsingLinkedlist.push(40);
        queueUsingLinkedlist.display();

        System.out.println("Element remove from queue");
        queueUsingLinkedlist.pop();
        queueUsingLinkedlist.display();

        queueUsingLinkedlist.front();


    }
}
