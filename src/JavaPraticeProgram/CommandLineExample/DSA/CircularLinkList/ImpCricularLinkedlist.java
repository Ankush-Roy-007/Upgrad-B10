package JavaPraticeProgram.CommandLineExample.DSA.CircularLinkList;

public class ImpCricularLinkedlist {
    public static void main(String[] args) {
        CircularLinkedlist circularLinkedlist = new CircularLinkedlist();

        circularLinkedlist.add(10);
        circularLinkedlist.add(20);
        circularLinkedlist.add(30);
        circularLinkedlist.add(40);

        circularLinkedlist.display();

        circularLinkedlist.addFirst(50);

        circularLinkedlist.display();

    }
}
