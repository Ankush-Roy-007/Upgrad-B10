package JavaPraticeProgram.CommandLineExample.DSA.Queue.QueueUsingArray;

public class Imp {
    public static void main(String[] args) {
        QueueUsingArray qe = new QueueUsingArray(5);

        qe.push(10);
        qe.push(20);
        qe.push(30);
        qe.push(40);
        System.out.println("Element in queue");
        qe.display();

        qe.pop();
        System.out.println("element in queue");
        qe.display();

        qe.peek();


    }
}
