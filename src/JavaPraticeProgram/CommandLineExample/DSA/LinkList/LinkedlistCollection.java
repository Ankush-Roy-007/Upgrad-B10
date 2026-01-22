package JavaPraticeProgram.CommandLineExample.DSA.LinkList;

import java.util.LinkedList;

public class LinkedlistCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst( 50);
        list.addFirst(60);
        list.addLast(70);
        list.addLast(80);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        System.out.println(list.get(1));

        list.set(1,90);
        System.out.println(list);

    }
}
