package JavaPraticeProgram.CommandLineExample.DSA.LinkList;

public class Main {
    public static void main(String[] args) {
        LinkedListFirstProgram linkedListFirstProgram = new LinkedListFirstProgram();
        linkedListFirstProgram.addFirst(20);
        linkedListFirstProgram.addFirst(30);
        linkedListFirstProgram.addFirst(40);
        linkedListFirstProgram.display();


        linkedListFirstProgram.addLast(50);
        linkedListFirstProgram.display();


        linkedListFirstProgram.deleteFirst();
        linkedListFirstProgram.display();

        linkedListFirstProgram.deleteLast();
        linkedListFirstProgram.display();


        linkedListFirstProgram.Anypostion(60,30);
        linkedListFirstProgram.display();

        linkedListFirstProgram.deleteAtAnyPosition(20);
        linkedListFirstProgram.display();

    }
}
