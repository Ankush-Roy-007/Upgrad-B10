package LinkedList;

import java.util.LinkedList;

public class Doublylinkedlist1 {
    public static void main(String[] args) {

        LinkedList<Integer> dll = new LinkedList();

        // Add at beginning
        dll.addFirst(10);

        // Add at last
        dll.addLast(30);

        // Add in middle (at index 1)
        dll.add(1, 20);

        // Traverse forward
        System.out.println("Forward: " + dll);

        // Traverse backward
        System.out.print("Backward: ");
        for (int i = dll.size() - 1; i >= 0; i--) {
            System.out.print(dll.get(i) + " ");
        }
    }
}
