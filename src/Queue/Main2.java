package Queue;
public class Main2 {
    public static void main(String[] args) {
        Simplequeue  qe = new Simplequeue (5);

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