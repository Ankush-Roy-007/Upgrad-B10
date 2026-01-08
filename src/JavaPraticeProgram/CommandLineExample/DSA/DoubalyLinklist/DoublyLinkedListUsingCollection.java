package JavaPraticeProgram.CommandLineExample.DSA.DoubalyLinklist;

import java.util.LinkedList;

public class DoublyLinkedListUsingCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println(list);

        list.removeFirst();

        System.out.println(list);




    }
}
